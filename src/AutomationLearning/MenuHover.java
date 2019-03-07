package AutomationLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class MenuHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.harveynorman.com.au/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Shop all products>>Menu click (If it does not appear)
		//driver.findElement(By.xpath("//*[@id='shopAllMd']")).click();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Hovering the Mouse
		Actions Hover= new Actions(driver);
		Hover.moveToElement(driver.findElement(By.xpath("//*[@id='navMdList']//a[contains(text(),'Smart Home')]"))).build().perform();
		driver.findElement(By.xpath("//*[@id='navMdContent']//a[contains(text(),'Apple Homepod')]")).click();
		
		
		}

}
