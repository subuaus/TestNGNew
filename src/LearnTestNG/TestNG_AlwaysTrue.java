package LearnTestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_AlwaysTrue {
	
@Test(alwaysRun= true)
	
	public void TestPrint1(){
		System.out.println("Test1");
	}
@Test(alwaysRun= true)

public void TestPrint2(){
	System.out.println("Test2");
	Assert.fail();
}
@Test(alwaysRun = true, dependsOnMethods = "TestPrint2" )

public void TestPrint3(){
	System.out.println("Test3");
}
@Test(alwaysRun= false, dependsOnMethods = "TestPrint3")

public void TestPrint4(){
	System.out.println("Test4");
}
@Test(alwaysRun= false)

public void TestPrint5(){
	System.out.println("Test5");
}

}
