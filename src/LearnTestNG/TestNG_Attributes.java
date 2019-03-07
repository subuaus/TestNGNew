package LearnTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Attributes {
WebDriver driver;
	
	@Test
	
	public void navigate(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.harveynorman.com.au/customer/account/login");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("email")).sendKeys("abcd11");
	driver.findElement(By.id("send2")).click();
	String ErrorMessage= driver.findElement(By.id("email-error")).getAttribute("innerHTML");
	System.out.println(ErrorMessage);
	
	String ErrorMessage2= driver.findElement(By.id("email-error")).getText();
	System.out.println("ErrorMessage2"+ErrorMessage2);
	String ErrorMessage3= driver.findElement(By.id("email-error")).getAttribute("class");
	System.out.println("ErrorMessage3"+ErrorMessage3);
	}	
}
