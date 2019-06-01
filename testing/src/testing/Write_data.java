package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write_data {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Debojeet\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.demo.guru99.com/v4/");
		
		File obj= new File("C:\\Users\\Debojeet\\Desktop\\Selenium\\test.xlsx");
		FileInputStream objIS= new FileInputStream(obj);
		
		XSSFWorkbook objWB= new XSSFWorkbook(objIS);
		XSSFSheet objSheet= objWB.getSheet("excel");
		
		int rowCount= objSheet.getLastRowNum();
		
		for (int i= 0; i<= rowCount; i++)
		{
			
			String objRow= objSheet.getRow(i).getCell(1).getStringCellValue();
			String objCol= objSheet.getRow(i).getCell(2).getStringCellValue();
			
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(objRow);
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(objCol);
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
			Thread.sleep(5000);
			
			try {
				
				Alert alert= driver.switchTo().alert();
				String actualText= driver.switchTo().alert().getText();
				System.out.println(actualText);
				String expectedText= "User cannot login";
				alert.accept();
				Thread.sleep(3000);
				FileOutputStream objOS = new FileOutputStream(obj);
				XSSFRow objRw= objSheet.getRow(i);
				
				if (actualText.equals(expectedText)) {
					
					System.out.println("Failed");
					objRw.createCell(3).setCellValue("Fail");
					objWB.write(objOS);
					objOS.close();
					
//					System.out.println("Passed");
//					
//						objRw.createCell(3).setCellValue("Pass");
//						objWB.write(objOS);
//						objOS.close();
//						
					}
				
				
				else {
					
					String actualTitle= driver.getTitle();
					String expectedTitle= "Guru99 Login";
					if(actualTitle.equals(expectedTitle))
					{
				
				System.out.println("Passed");
				objRw.createCell(3).setCellValue("Pass");
					}
			
			else {
				System.out.println("Failed");
			}
//					
//					System.out.println("Failed");
//					objRw.createCell(3).setCellValue("Fail");
//					objWB.write(objOS);
//					objOS.close();
				}
				
				
				
				
			}
			
			catch(NoAlertPresentException ex)
			{
				String actualTitle= driver.getTitle();
				String expectedTitle= "Guru99 Login";
				
				if(actualTitle.equals(expectedTitle))
						{
					
					System.out.println("Passed");
				
						}
				
				else {
					System.out.println("Failed");
				}
				}					
		}
		
		objIS.close();				
				
			}

}
