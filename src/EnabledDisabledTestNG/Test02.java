package EnabledDisabledTestNG;

import org.testng.annotations.Test;
public class Test02 {
@Test (enabled=false)
public void printClass03(){
 System.out.println("This is Test Case 03");
}
}