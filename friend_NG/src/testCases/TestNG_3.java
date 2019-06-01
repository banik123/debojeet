package testCases;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_3 {

	WebDriver driver;
	
@Test(dataProvider=  "Guru99")

public void TestDataProvider(String userName, String passWord) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Debojeet\\Desktop\\Selenium\\chromedriver.exe");
	
	driver= new ChromeDriver();
	
	driver.get("http://www.demo.guru99.com/v4/");
	
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(userName);
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(passWord);
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	Assert.assertTrue(driver.getTitle().contains("Guru 99"));
	System.out.println("Login is successful");
	}

   @AfterMethod
	public void tearDown() {
	
	driver.quit();

}

@DataProvider(name="Guru99")

	public Object[][] passData(){
		
	Object[][] data= new Object[2][2];
	
	data[0][0]= "admin1";
	data[0][1]= "domain1";
	data[1][0]= "admin2";
	data[1][1]= "domain2";
	
	return passData();
	
}

}
