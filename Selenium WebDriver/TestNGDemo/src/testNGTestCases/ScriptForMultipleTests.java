package testNGTestCases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ScriptForMultipleTests {
	
  @Test(priority=4)
  public void testMethodFail() {
	  Assert.fail();
  }
  
  @Test(priority=9)
  public void testMethodPass() {
	  Assert.assertTrue(true);
  }
  
  @Test(priority=2)
  public void testMethodForException() {
	  throw new SkipException("Skipping testMethodForException()....");
  }
  
  @Test(priority=2)
  public void testMethod() {
	  Assert.assertTrue(true);
  }
}
