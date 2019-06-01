package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_brainstorm {
 
	WebDriver driver;
	File obj;
	FileInputStream objIS;
	XSSFWorkbook objWK;
	XSSFSheet objSheet;
	String objRW;
	String objCol;
	
	@BeforeTest
	
	public void OpenWebpage() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Debojeet\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");	
		
	}
	
	@Test(dataProvider= "loginCreds")
	
	public void PerformAction(String objRW, String objCol) throws InterruptedException{
		
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(objRW);
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(objCol);	
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	
	}
	
	@DataProvider(name= "loginCreds")
	
	public void AttachExcel() throws IOException {
		
		System.out.println("Printer is mine");
		System.out.println("Printer is yors");
		File obj= new File("C:\\Users\\Debojeet\\Desktop\\Selenium\\test1.xlsx");
		objIS= new FileInputStream(obj);
		objWK= new XSSFWorkbook(objIS);
		objSheet= objWK.getSheet("excel");
		
		int rowCount= objSheet.getLastRowNum();
		
		for (int i= 0; i<= rowCount; i++)
		{
			
			String objRow= objSheet.getRow(i).getCell(1).getStringCellValue();
			String objCol= objSheet.getRow(i).getCell(2).getStringCellValue();
			
			objRW= objSheet.getRow(i).getCell(1).getStringCellValue();
			objCol= objSheet.getRow(i).getCell(2).getStringCellValue();
			
			
		}
	
	}
	
	@AfterTest
	public void QuitWindow() {
		
		
		driver.quit();
	}
	
}
