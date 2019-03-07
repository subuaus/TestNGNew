package LearnTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Assertion01 {
	WebDriver driver;
	
	@Test
	public void navigate01(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.harveynorman.com.au/customer/account/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		String currentURL = driver.getCurrentUrl();
		//Assert
		Assert.assertTrue(currentURL.contains("customer/account/login"));
		
	}
	@Test
	public void navigate02(){
		String AccountName= driver.findElement(By.xpath("//a[contains(text(),'Account')]")).getText();
		
		System.out.println(AccountName);
		
		Assert.assertEquals("Account", AccountName);

		}
	@Test
	public void navigate03(){
		String MyString= "Software Test Lab";
		
		System.out.println(MyString);
		
		Assert.assertTrue(MyString.contains("Test1"),"This word is not present");
		

		}


}
