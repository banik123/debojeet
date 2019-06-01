package com.Maven.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Object {

	WebDriver driver;
	
	public Page_Object(WebDriver driver) {
		
		this.driver= driver;
	}
	
	public void Login_Creds(String userName, String passWord) {
		
		driver.findElement(By.name("uid")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(passWord);
		driver.findElement(By.name("btnLogin")).click();
	
	}
	
}
