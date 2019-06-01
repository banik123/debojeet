package com.SprintAutomation.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sprint_Automation {

	WebDriver driver;
	
	public Sprint_Automation(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void Sprint_Automate(String userName, String passWord) {
		
		driver.findElement(By.className("text")).sendKeys(userName);
		driver.findElement(By.id("PASSWORD")).sendKeys(passWord);
		driver.findElement(By.xpath("//*[@id=\"bodyArea\"]/div/div/div[1]/div[1]/form/div[3]/input")).click();	
		WebElement storeID= driver.findElement(By.id("storeId"));
		storeID.sendKeys("1418");
	}
	
	
	
	
	
}
