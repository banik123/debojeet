package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;	
		}
		
	public void LoginCreds(String userName, String Password) {
		
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys(userName);
		
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys(Password);
		
		driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
		
	}
	
	
	
	
	
	
	
	
}
