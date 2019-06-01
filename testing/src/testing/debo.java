package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class debo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.out.println("Hello ");
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Debojeet\\Desktop\\Selenium\\chromedriver.exe");

WebDriver driver= new ChromeDriver();

driver.get("https://www.google.com/");

driver.findElement(By.name("q")).sendKeys("youtube");

Thread.sleep(3000);

driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div/center/input[1]")).click();

driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3")).click();
	
driver.findElement(By.xpath("//*[@id=\"search\"]")).click();

driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("o mere dil ke chain");

driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.manage().window().maximize();

String expectedTitle= "YouTube";

String actualTitle= driver.getTitle();

System.out.println(actualTitle);



if (actualTitle.equals(expectedTitle)) {
	
	System.out.println("Both titles match");
}
else {
	System.out.println("TItles do not match");
}

driver.findElement(By.partialLinkText("O Mere Dil Ke Chain | Sanam")).click();

 Thread.sleep(25000);

 driver.findElement(By.partialLinkText("Mere Sapno Ki Rani | Sanam")).click();
 
 Thread.sleep(25000);
 
 driver.findElement(By.partialLinkText("Pehla Nasha (Valentine's Day Special) | Sanam")).click();
 

 
	}

}
