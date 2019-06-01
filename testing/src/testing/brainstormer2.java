package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class brainstormer2{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Debojeet\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.oyorooms.com");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("button[onclick='moeRemoveBanner()'][class='ng-binding']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("a[href='/login'][class='header__mybooking__link icon icon-account header__mybooking__link--icon']")).click();
		
		
		
		
	}
	
	
	
}

