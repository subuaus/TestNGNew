package JavaConcepts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class PageLoadTimeout {
	

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("https://www.harveynorman.com.au/");
//		try{
//			driver.get("https://www.harveynorman.com.au/");
//			System.out.println("HNFound");
//		
//		}catch(Exception e){
//			System.out.println("HN Not Found");
//		}
	}
}

//LEARN implicit wait, explicit wait, fluent wait, Thread.sleep, synchronization
