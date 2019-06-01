package testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sprint {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Debojeet\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://activate-sit2.gst.sprint.com/resources/index.html");
		driver.manage().window().maximize();
//		Enter credentials
		Thread.sleep(2000);
		driver.findElement(By.className("text")).sendKeys("yd744929");
		driver.findElement(By.id("PASSWORD")).sendKeys("Xendesktop@786");
		driver.findElement(By.xpath("//*[@id=\"bodyArea\"]/div/div/div[1]/div[1]/form/div[3]/input")).click();
		Thread.sleep(10000);		
		driver.findElement(By.id("storeId")).sendKeys("1418");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@id, 'submit')]")).click();
		//Thread.sleep(5000);
//		Duster Button
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(10000);
	
//	    Perform a new connection journey
	 
		
//		int x= driver.findElement(By.id("")).getLocation().getX();
//		int y= driver.findElement(By.id("")).getLocation().getY();
		
		driver.findElement(By.xpath("//button[@id='newConnection'][@ng-click='clickedNewButton()']")).click();
//		
//		List <WebElement> button= driver.findElements(By.id("newConnection"));
//	
//		System.out.println(button.size());
//	
//		for (int i=0; i<button.size(); i++) {
//			
//			int x= button.get(i).getLocation().getX();
//			
//			if(x!=0) {
//				
//				button.get(i).click();
//				break;
//			}
//	    	}
//	    Create new account
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.className("radio-outline")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.className("full-button-panel")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
// 		Sign Privacy
		WebElement checkBox= driver.findElement(By.className("checkbox-outline"));
		checkBox.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div/div[1]/div/div/div/div/div/div[2]/div[3]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//      Driving License Page
		WebElement issuing_state= driver.findElement(By.xpath("//*[@id=\"stateList\"]"));
		Select month_dropdown= new Select(issuing_state	);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		month_dropdown.selectByVisibleText("VA");
		driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div/div[1]/div/div/div/div/div/div[2]/div[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//      Customer Information 
		WebElement first_name= driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(first_name).sendKeys("Test").perform();
		driver.manage().timeouts().implicitlyWait(5,  TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id= 'lastName'][@ng-show= '!resetManagerUsername']")).sendKeys("Sprint");
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("debojeet.bhattacharya@Sprint.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mdn\"]")).sendKeys("2162190589");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"addressPPUCity\"]")).sendKeys("Kalamazoo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id= 'addressPPUAddressLine1']")).sendKeys("1121 Miller Road");
		Thread.sleep(2000);
		WebElement state= driver.findElement(By.id("addressPPUState"));
		state.click();
		Select state_dropdown= new Select(state);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		state_dropdown.selectByVisibleText("MI");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id= 'addressPPUZip']")).sendKeys("49001");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div/div[1]/div/div/div/div/div[2]/div[2]/div/button/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class= 'full-button-panel']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
//      Check Port-In
		driver.findElement(By.xpath("//div[@class= 'btn button-primary ng-binding']")).click();
		
//      Coverage-check-port-in
		driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div/div[1]/div/div/div/div/div/div[2]/div[1]/div/fieldset/div[1]/div[2]/div/div/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div/div[1]/div/div/div/div/div/div[2]/div[4]")).click();
//		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//      Credit Check
		WebElement account_Type= driver.findElement(By.id("ATST"));
		account_Type.click();
		Select dropdown= new Select(account_Type);
		dropdown.selectByVisibleText("Individual - Individual");
		Thread.sleep(2000);
		
		//Click on SSN Number
		driver.findElement(By.xpath("//div[@class='temp-input']")).click();
		//Click on DOB
		driver.findElement(By.xpath("//input[@id='FormattedDate'][@placeholder= 'mm/dd/yyyy']")).click();
		
		// Enter SSN number
		driver.findElement(By.cssSelector("input[id='ssnMaskedText'][type='tel']")).sendKeys("123455024");
		// Enter DOB
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.cssSelector("input[id='FormattedDate'][ng-focus='changeDisplayField()']")).sendKeys("05");
		Thread.sleep(20000);
		
		driver.findElement(By.cssSelector("button[ng-click='submitComponents(navigationFlow.performCreditCheck)']")).click();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("button[ng-if='navigationFlow.performCreditCheck'][type='button']")).click();
		Thread.sleep(4000);


//      Device Page
		driver.findElement(By.cssSelector("label[class='checkbox-label ng-binding'][for='manufacturer-1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("span[role='button'][aria-label='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("img[ng-src='https://sprint.com/catalog/images/devices/apple/iphone_8/space_gray/device_230x400_a.gif']")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("div[class='circle'][style='background-color:#DDDFDE']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[@form='hb.device.label.deviceDetails']")).click();
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("button[class='btn button-secondary ng-binding'][ng-click='dismissBxgxPopUp()']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(4000);

		
// 		Purchase Option
		WebElement purchase_Option= driver.findElement(By.xpath("//*[@id=\"purchaseOption_0\"]"));
		purchase_Option.click();
		Select purchase_Value= new Select(purchase_Option);
		purchase_Value.selectByVisibleText("Full price");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='ng-binding'][id='submit']")).click();
		Thread.sleep(3000);
		
//   	Device Protection Page
		driver.findElement(By.xpath("//span[@class='checkbox-outline']")).click();	
		driver.findElement(By.xpath("//button[@id='submit'][@type='button']")).click();
		Thread.sleep(3000);
		
//   	Plans Page
		driver.findElement(By.cssSelector("i[class='ico ico--search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[ng-model='node.value'][ng-change='validateInputAccessory()']")).sendKeys("TSTLPDSA1");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("i[class='ico ico--search']")).click();
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("div[tabindex='-1'][aria-describedby='slick-slide570']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("label[for='PREMRES03'][class='radio-checkbox-control-label ng-binding']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[ng-disabled='isGotitDisabled'][ng-click='addonContinue()']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[id='submit'][ng-disabled='isDisabled']")).click();
		Thread.sleep(4000);
		
//		autopayEbillEnrollIntentPage
		driver.findElement(By.cssSelector("button[ng-click='submitEnrollment()']")).click();
		Thread.sleep(5000);
		
		
//      Add-ons page
		driver.findElement(By.cssSelector("div[tabindex='-1'][role='option'][aria-describedby='slick-slide1120']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='submit'][class='ng-binding']")).click();
		Thread.sleep(4000);
		
		
//		MAC Details		
		driver.findElement(By.cssSelector("button[class='btn button-primary macButtonMargin ng-binding'][type='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("label[class='radio-btn radio-btn-macs-alignment mac-label'][for='macsGroup_1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='submit'][ng-click='openMacIncompatibilityPopup()']")).click();
		Thread.sleep(3000);
		
		
//		Accessories Page		
		driver.findElement(By.cssSelector("button[id='submit'][class='ng-binding']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[id='submit'][ng-click='openUpgradeFeeInfoPopup()']")).click();
		
		
		
		
	}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

		
		
	


