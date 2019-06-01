package com.Maven.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig() {
		
		File src= new File("./Configuration\\config.properties");
		
		try {
			
			FileInputStream fis= new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
			
		}
		
		catch(Exception e){
			
			System.out.println("Exception is" +e.getMessage());
			}
		
	}
	
	public String getBaseURL() {
	
		String URL= pro.getProperty("baseURL");
		return URL;
		}
	
	public String getUserName() {
		
		String userName= pro.getProperty("userName");		
		return userName;
	}
	
	public String getPassWord() {
		
		String passWord= pro.getProperty("passWord");		
		return passWord;
	}
	
	public String getChromePath() {
	
	String chromePath= pro.getProperty("chromePath");		
	return chromePath;
}
	
}
