package testNGTestCases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ScriptForMultipleTests2 {
	
  @Test()
  public void testMethodFail() {
	  Assert.fail();
  }
  
  @Test()
  public void testMethodPass() {
	  Assert.assertTrue(true);
  }
  
  @Test()
  public void testMethodForException() {
	  throw new SkipException("Skipping testMethodForException()....");
  }
}
