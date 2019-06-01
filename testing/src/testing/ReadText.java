package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Debojeet\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.demo.guru99.com/v4/");
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr177714");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("jytutyq");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
//		if(driver.getPageSource().contains("mngr1777h1"))
//		{
//			System.out.println("Manager ID is validated");
//		}
//
//		else {
//			System.out.println("Wrong Credentials");
//		}
		
		boolean expectedTitle = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).isDisplayed();
		
		System.out.println(expectedTitle);
		
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[15]/a")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"rt-feature\"]/div/div[1]/div/div/div/div[2]/div[4]/div/div/div/div/div[1]/div/div/a/i")).click();
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("");
		
		
	}

}
