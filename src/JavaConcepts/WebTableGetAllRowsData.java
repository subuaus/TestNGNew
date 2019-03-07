package JavaConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableGetAllRowsData {

	WebDriver driver;
	@Test(description ="First Test")

	public void TableRowColumn() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/AT%20Learn/WebTable.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



		List<WebElement> rows = driver.findElements(By.xpath("/html/body/table/tbody/tr"));

		for(int i=0; i<rows.size(); i++) {
			//check column each in row, identification with 'td' tag
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			int ColSize= cols.size();
			System.out.println(ColSize);
//
//			for(int j=0; j<cols.size(); j++) {
//				System.out.println(cols.get(j).getText());
			
			
			System.out.println(cols.get(2).getText());
		}
	
	
	
	//====================================================================
			List<WebElement> ele = driver.findElements(By.xpath("/html/body/table/tbody/tr[1]"));
	
			int NumCell = ele.size();
			System.out.println(NumCell);
	
			//First row in one line
			for(int i=0;i<NumCell; i++){
				String Row1 = (ele.get(i).getText());
				System.out.println(Row1);
				System.out.println("================================");
				
				//Split 2 columns from first row
				String[] parts = Row1.split(" ");
				System.out.println(parts[0]);
				System.out.println(parts[1]);
				System.out.println("================================");
				//Print all together vertically
				for(int j=0; j<parts.length; j++){
					System.out.println(parts[j]);
				}
				String[] separate = "String name".split(" ");
		System.out.println(separate[1]);		
			}

	//homework: 

//		int r = driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
//		System.out.println(r);
//		int c= driver.findElements(By.xpath("/html/body/table/tbody/tr/td")).size();
//		System.out.println(c);
//
//		for (int i = 1; i<=r;i++){
//			for(int j= 1;j<=c;j++){
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//				System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText());
//
//			}
//			System.out.println();
//		}





	


}
}
