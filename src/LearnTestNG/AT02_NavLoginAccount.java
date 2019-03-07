package LearnTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AT02_NavLoginAccount extends AT01_NavigateToHN {

	@Test
	public void navigateToLogin(){
		
		//Click on Account link
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/ul/li[5]/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

	}

}
