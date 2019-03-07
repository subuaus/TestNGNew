package AutomationLearning;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AT03_GetPageTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.harveynorman.com.au/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Get Page Title
		
		String HNtitle = driver.getTitle();
		System.out.println("Page title is"+HNtitle);
		
		

	}

}
