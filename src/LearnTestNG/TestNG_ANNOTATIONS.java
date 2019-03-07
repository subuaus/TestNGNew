package LearnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_ANNOTATIONS {

	@Test
	public void TestPrint1(){
		System.out.println("Test1");
	}
	
	@Test
	public void TestPrint2(){
		System.out.println("Test2");
	}
	
	@BeforeMethod
	public void TestPrint3(){
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void TestPrint4(){
		System.out.println("AfterMethod");
	}
	
	@BeforeClass
	public void TestPrint5(){
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void TestPrint6(){
		System.out.println("AfterClass");
	}
	
	@BeforeTest
	public void TestPrint7(){
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	public void TestPrint8(){
		System.out.println("AfterTest");
	}
	
	@BeforeSuite
	public void TestPrint9(){
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void TestPrint10(){
		System.out.println("AfterSuite");
	}

}
