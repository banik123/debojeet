
package testCases;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test_brainStormNG {
	
WebDriver driver;
File obj;
FileInputStream objIS;
XSSFWorkbook objWK;
XSSFSheet objSheet;

int rowCount;


@BeforeMethod

public void OpenWebpage() {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Debojeet\\Desktop\\Selenium\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("http://www.demo.guru99.com/V4/");	
driver.manage().window().maximize();

}


@Test(dataProvider = "loginCreds")

public void PerformAction(String objRW, String objCol) throws InterruptedException {
	
driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(objRW);
driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(objCol);
Thread.sleep(5000);
driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
}


@DataProvider(name = "loginCreds")

public Object[][] AttachExcel() throws IOException {
	
System.out.println("Print to check if DataProvider is working");

obj= new File("C:\\Users\\Debojeet\\Desktop\\Selenium\\test1.xlsx");
objIS = new FileInputStream(obj);
objWK = new XSSFWorkbook(objIS);
objSheet = objWK.getSheet("excel");
rowCount = objSheet.getLastRowNum();
Object[][] data= new Object[rowCount][2];

for (int i = 0; i < rowCount; i++) {
	
data[i][0] = objSheet.getRow(i).getCell(0).getStringCellValue();
data[i][1] = objSheet.getRow(i).getCell(1).getStringCellValue();
}

return data;

}


@AfterMethod

public void QuitWindow() {

	driver.quit();
}
}