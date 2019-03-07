package ParallelRun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelRun {

	WebDriver driver;
	@Test
	@Parameters("browser")
	public void navigate(String browserName){
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\chromedriver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\chromedriver\\chromedriver.exe");
			driver= new ChromeDriver();
		}	

		else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\chromedriver\\chromedriver.exe");
			driver= new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.get("https://www.harveynorman.com.au/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}


}




