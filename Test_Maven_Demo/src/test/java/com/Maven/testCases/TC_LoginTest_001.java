package com.Maven.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Maven.PageObjects.Page_Object;

public class TC_LoginTest_001 extends Base_Class{

	@Test
	public void loginTest() {
		
		driver.get(baseURL);
		Page_Object pageObject= new Page_Object(driver);
		driver.manage().window().maximize();
		pageObject.Login_Creds(userName, passWord);
		
//		
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			
			Assert.assertTrue(true);
		}
		
		else {
			
			Assert.assertTrue(false);		
		}
		
		
		
		
		
	}
	}
		
		
		
		
	