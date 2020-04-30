package testNGTestSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
   String message = "Manisha";	
   MessageUtil messageUtil = new MessageUtil(message);
	
   //@Test(enabled = false)
   // if this test is not ready then we can skip by using above annotation 
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Manisha";
      Assert.assertEquals(message,messageUtil.salutationMessage());
   }
}
