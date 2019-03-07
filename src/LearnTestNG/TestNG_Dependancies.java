package LearnTestNG;

import org.testng.annotations.Test;

public class TestNG_Dependancies {

	@Test
	public void login(){
		System.out.println("login");
		
		
	}
	@Test (dependsOnMethods= "login")
	public void DoSomeActivity(){
		System.out.println("DoSomeActivity");
		
		
	}
	@Test (dependsOnMethods= "DoSomeActivity")
	public void Logout(){
		System.out.println("logout");
		
		
	}
}
