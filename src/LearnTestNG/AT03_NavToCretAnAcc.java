package LearnTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AT03_NavToCretAnAcc extends AT02_NavLoginAccount {

	@Test
	public void navigateToCreateAnAcc(){
		
		//Click on Navigate to Creata an Account link
		driver.findElement(By.xpath("//a[@class='btn btn_primary']")).click();
		

	}

}
