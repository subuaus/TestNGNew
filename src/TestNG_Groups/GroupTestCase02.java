package TestNG_Groups;

import org.testng.annotations.Test;
public class GroupTestCase02 {
	@Test (groups = { "functionalTest" })
	public void composeMail(){
		System.out.println("Mail Sent");
	}
}