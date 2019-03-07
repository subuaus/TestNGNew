
package AutomationLearning;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AT05_Weblist {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.harveynorman.com.au/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='category-grid']/div[1]/div/div[1]/a/img")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("select_999999900")).click();
		Select Warranty = new Select (driver.findElement(By.id("select_999999900")));
		
		int DropDownSize = Warranty.getOptions().size();// Getting size of the Dropdown
		System.out.println(DropDownSize);
		
		for(int j=0;j<DropDownSize;j++)
		{
			String DropDownText = Warranty.getOptions().get(j).getText();
			System.out.println(DropDownText);
			Warranty.getOptions().get(j).click();
			
		}
	}

}
