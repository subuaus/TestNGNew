package EnabledDisabledTestNG;

import org.testng.annotations.Test;
	public class Test01{
	@Test
	public void printClass01(){
	 System.out.println("This is Test Case 01");
	 
	}
	@Test (enabled=true
			)
	public void printClass02(){
	 System.out.println("This is Test Case 02");
	}
	
	
	}
