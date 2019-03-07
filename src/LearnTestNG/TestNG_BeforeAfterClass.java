package LearnTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_BeforeAfterClass {
	WebDriver driver;
	@BeforeClass
	public void navigate(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.harveynorman.com.au/customer/account/login");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	System.out.println("Test1");
	}
	@Test(priority=1)
	
	public void TestPrint(){
		System.out.println("Test2");
	}
	
	@Test(priority=2)
	public void LogiScreen(){
		
	driver.findElement(By.id("email")).sendKeys("abcd11");
	driver.findElement(By.id("send2")).click();
	String ErrorMessage= driver.findElement(By.id("email-error")).getAttribute("innerHTML");
	System.out.println(ErrorMessage);
	
	String ErrorMessage2= driver.findElement(By.id("email-error")).getText();
	System.out.println("ErrorMessage2"+ErrorMessage2);
//	String ErrorMessage3= driver.findElement(By.id("email-error")).getAttribute("class");
//	System.out.println("ErrorMessage3"+ErrorMessage3);
	System.out.println("Test3");
	}
	@AfterClass
	public void CloseBrowser(){
		driver.quit();
		System.out.println("Test4");
	}
	}
		

