package LearnTestNG;

import org.testng.annotations.Test;

public class TestNG_SmokeSanity {

	
	@Test (groups = {"SmokeTest"}, priority=1)
	public void login1(){
		System.out.println("Priority1");
	}

	@Test (groups = {"SmokeTest"}, priority=2)
	public void browse2(){

		System.out.println("Priority2");
	}
	

	@Test(groups = {"regressionTest"}, priority=3)
	public void SelectProduct3(){

		System.out.println("Priority3");
	}

	@Test (groups = {"regressionTest"}, dependsOnGroups={"SmokeTest"}, priority=4)
	public void CheckoutPage4(){

		System.out.println("Priority4");
	}

	@Test (groups = {"regressionTest"}, enabled=false)
	
	public void PaymentGate5(){

		System.out.println("Priority5");
	}




}
