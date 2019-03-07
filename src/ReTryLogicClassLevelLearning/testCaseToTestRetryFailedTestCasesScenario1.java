package ReTryLogicClassLevelLearning;

import org.testng.Assert;
import org.testng.annotations.Test;
public class testCaseToTestRetryFailedTestCasesScenario1 {
@Test
public void test1(){
 System.out.println("Failed Test Scenario-1");

 Assert.assertFalse(false);
}
}