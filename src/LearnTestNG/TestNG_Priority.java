package LearnTestNG;

import org.testng.annotations.Test;

public class TestNG_Priority {
	@Test(priority=1, description="This is first test case description")
			public void Cat(){
		System.out.println("This is Third test");
	}
	@Test(priority=2, description="This is second test case description")
	public void Apple(){
		System.out.println("This is first test");
	}

	@Test(priority=3, description="This is third test case description")
	public void Ball(){
		System.out.println("This is Second test");

	}
}
