package testing;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHP_Travels2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Debojeet\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://phptravels.com/404/");
		driver.manage().window().maximize();
	
		String parent= driver.getWindowHandle();
		
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul[2]/li[2]/a/i")).click();
		
		Set<String> allWindows= driver.getWindowHandles();
		
//		int count= allWindows.size();
//		System.out.println(count);
	
//	    for(String childWindow : allWindows) {
//	    	
//	    	if(!parent.equalsIgnoreCase(childWindow)) {
//	    		
//	    		driver.switchTo().window(childWindow);
//	    		Thread.sleep(5000);
//	    		driver.findElement(By.partialLinkText("http://phptravels.com/order/")).click();
//	    		Thread.sleep(10000);
//	    		
//	    		driver.findElement(By.id("onesignal-popover-allow-button")).click();
//	    		Thread.sleep(3000);
//	    		WebElement cross= driver.findElement(By.xpath("//*[@id=\"PopupSignupForm_0\"]/div[2]/div[1]"));
//	    		driver.switchTo().frame(cross);
//	    		
//	    		
//	    		
//	    	}
	    	
	    	ArrayList<String> tabs= new ArrayList<>(allWindows);
	     
	        driver.switchTo().window(tabs.get(1));
	        Thread.sleep(3000);
	        
	        driver.findElement(By.partialLinkText("http://phptravels.com/order/")).click();
	        Thread.sleep(4000);
	       	      
	        Set<String> allWindows1= driver.getWindowHandles();
	        
	        ArrayList<String> tabs1= new ArrayList<>(allWindows1);
	        	        
	        driver.switchTo().window(tabs1.get(2));
	        Thread.sleep(20000);
	        driver.findElement(By.id("onesignal-popover-allow-button")).click();
	        
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"PopupSignupForm_0\"]/div[2]/div[1]")).click();
	        
	        driver.findElement(By.partialLinkText("FEATURES")).click();
	        driver.findElement(By.partialLinkText("Offers Module")).click();
	        
	        
	        
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	