package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Debojeet\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		
Thread.sleep(5000);

       driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr177714");;
       driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("jytutyq");
       driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
       
       String actual_title= driver.getTitle();
                System.out.println(actual_title);
       String expected_title= "Guru99 Bank Manager HomePage";
	 
       if (actual_title.equals(expected_title))
       {
    	   System.out.println("Login is successful ");
       }
       
       else
       {
    	   System.out.println("Invalid login");
       }
	}
	
	

}
