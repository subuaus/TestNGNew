package TestNG_Groups;

import org.testng.annotations.Test;

public class GroupTestCase01 {
	@Test (groups = { "smokeTest or functionalTest" })
	public void loginTest(){
		System.out.println("Logged in successfully");
		
	
	}
}

