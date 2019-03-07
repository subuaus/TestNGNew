package AutomationLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework13thFeb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.harveynorman.com.au/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//List <WebElement> ShopList = driver.findElements(By.cssSelector("#outer-wrap"));
		List <WebElement> ShopList = driver.findElements(By.xpath("//*[@id='outer-wrap']/footer/div/div/div/div/div[1]"));

		for(int i=0; i<=ShopList.size(); i++)
		{
			String ShopListNames = ShopList.get(i).getText();
			System.out.println(ShopListNames);

			System.out.println("===================================================================================");

			List<WebElement> CustomerService = driver.findElements(By.xpath("//div[@class='mega-customer accordion-body child collapse collapse-xs']"));

			for(int j=0;j<CustomerService.size();j++)
			{
				String TextCS = CustomerService.get(j).getText();
				System.out.println(TextCS);

			}

		}



	}
}
