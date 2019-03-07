package AutomationLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AT10ListOfElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.harveynorman.com.au/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		List <WebElement> LinkList = driver.findElements(By.xpath("//*[@id='outer-wrap']/footer/div/div/div/div/div[1]/div"));
		
		
		for (int i= 0; i<LinkList.size();i++)
		{
			
		
		String LinkTextName = LinkList.get(i).getText();
		System.out.println(LinkTextName);
		}
		
	}

}
