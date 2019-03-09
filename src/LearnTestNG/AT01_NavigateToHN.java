package LearnTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AT01_NavigateToHN {
	
	//CHECKING THIS LINE ON GIT......
	//CHECKING THIS LINE ON GIT......
	//Hi subin...............................
	//Hi Sam.........
	//New Comment to check
	//adadfsf
	WebDriver driver;
@Test
public void navigate(){
	System.setProperty("webdriver.chrome.driver", "/LearnMaven/src/main/java/driverList/chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.harveynorman.com.au/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	


	}

}
