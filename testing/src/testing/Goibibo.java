package testing;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Goibibo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Debojeet\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.goibibo.com/");
//		Thread.sleep(10000);
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//*[@id=\"ctabutton\"]/a")).click();
		

		
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"get_sign_in\"]")).click();
		
		driver.switchTo().frame("authiframe");
		Thread.sleep(2000);
		driver.findElement(By.id("authMobile")).sendKeys("9920940702");
		driver.findElement(By.id("mobileSubmitBtn")).click();
		Thread.sleep(20000);
		driver.findElement(By.id("authOtpSubmitBtn")).click();
		Thread.sleep(20000);
//		driver.switchTo().frame("//*[@id=\"webklipper-publisher-widget-container-notification-container\"]");
		
//		driver.findElement(By.xpath("//*[@id=\"hd_user_widdget\"]/i")).click();
//		driver.findElement(By.partialLinkText("My Traveller Details")).click();
		
		Alert alert= driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//*[@id=\"ctabutton\"]/a")).click();
		Thread.sleep(3000);
		
		
	}	
		
		
	}


