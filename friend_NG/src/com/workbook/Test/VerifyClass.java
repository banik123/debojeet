package com.workbook.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;

public class VerifyClass {

	WebDriver driver;
	
	@Test(priority=1)
	public void verifyLogin(){
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Debojeet\\Desktop\\Selenium\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://demosite.center/wordpress/wp-login.php");
	LoginPage login= new LoginPage(driver);
	login.LoginCreds("admin", "demo123");
	}

	
	@Test(priority=2)
	public void Sprint() throws InterruptedException {
	    
		Thread.sleep(3000);
		System.out.println("abcd");
		driver.findElement(By.xpath("//*[@id=\"show-settings-link\"]")).click();
		
		
		
		
		
	}
	
	
	
	
}
