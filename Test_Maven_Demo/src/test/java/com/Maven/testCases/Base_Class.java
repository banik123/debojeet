package com.Maven.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Maven.Utilities.ReadConfig;

public class Base_Class {

	ReadConfig readconfig= new ReadConfig();
	
		
	String baseURL= readconfig.getBaseURL();
	String userName= readconfig.getUserName();
	String passWord= readconfig.getPassWord();
	WebDriver driver;

	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		driver= new ChromeDriver();
	}
	
	
	@AfterClass
	public void tearDown() { 
		
		driver.quit();
		
	}
	
}
