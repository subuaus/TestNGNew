package AutomationLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class XXXXXXXXXXXLearning {
	
WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webjet.com.au/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
//		//going to join us page
//		
//
//	
//		//submitting the join us form
//		
//Select FNIni = new Select (driver.findElement(By.cssSelector("select[id*='Salutation']")));
//		//Get size
//				int FNIniSize = FNIni.getOptions().size();
//				FNIni.selectByIndex(3);
//				
//		//Inputs
//				driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Subin");
//				driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Thomas");
//				Select Phone= new Select(driver.findElement(By.cssSelector("select[id^='PhoneNumberType']")));
//				Phone.selectByValue("Work");
//				driver.findElement(By.cssSelector("input[data-val-required^='Please enter your valid phone number.']")).sendKeys("0470226665");
//				driver.findElement(By.cssSelector("input[id='EmailAddress']")).sendKeys("subinrokr@gmail.com");
//				driver.findElement(By.cssSelector("input[id='EmailAddressConfirmation']")).sendKeys("subinrokr@gmail.com");
//				driver.findElement(By.cssSelector("input[id='Address_StreetAddress']")).sendKeys("22 South Shore Avenue");
//				driver.findElement(By.cssSelector("input[id='Address_Suburb']")).sendKeys("Point Cook");
//				Select CountryList = new Select (driver.findElement(By.cssSelector("select[name^='Address.Country']")));
//				CountryList.selectByValue("AU");
//				Select StatePostcode = new Select (driver.findElement(By.cssSelector("select[name^='Address.State']")));
//				StatePostcode.selectByValue("VIC");
//				driver.findElement(By.cssSelector("input[id^='ddlPostcode']")).sendKeys("3030");
//				driver.findElement(By.cssSelector("input[type^='password'][data-val-contrequiredif-dependentproperty^='ValidatePassword']")).sendKeys("Test@123");
//				driver.findElement(By.cssSelector("input[name^='PasswordConfirmation']")).sendKeys("Test@123");
//				driver.findElement(By.cssSelector("input[id^='DateOfBirth']")).sendKeys("18/07/1989");
//		
//				//Checkbox
//				
//				if(driver.findElement(By.cssSelector("input[id^='AgreedToTerms']")).isDisplayed()){
//					driver.findElement(By.cssSelector("input[id^='AgreedToTerms']")).click();
//					
//					
//					
//					driver.findElement(By.xpath("//input[@id='myProfileSubmit']")).click();
//					
//				}
//				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//				//Login Now
//				
//			driver.findElement(By.xpath("//a[@class='sub-nav-link'][text()='My Account']")).click();
//				driver.findElement(By.xpath("//a[text()='Log In']")).click();
//				
//				driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("subinrokr@gmail.com");
//				driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Test@123");
//				driver.findElement(By.cssSelector("input[type='submit']")).click();
				
//				
//				//Ticket book
//			
			driver.findElement(By.xpath("//*[@id='departure-airport']")).sendKeys("Melb");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);				
				List <WebElement> Departure = driver.findElements(By.xpath("//ul[@id='ui-id-6']"));
				driver.findElement(By.id("ui-id-28"));
				Departure.size();
				Departure.get(0).click();
//				//Departure
				
				}
	
}
