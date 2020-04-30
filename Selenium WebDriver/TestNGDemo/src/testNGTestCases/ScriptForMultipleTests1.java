package testNGTestCases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ScriptForMultipleTests1 {
	
  @Test()
  public void testA() {
	  Assert.assertTrue(true);
  }
  
  @Test()
  public void testC() {
	  Assert.assertTrue(true);
  }
  
  @Test()
  public void testB() {
	  Assert.assertTrue(true);
  }
}
