package testNGTestCases;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTestCaseClass {
		
	private WebDriver driver = null;
	
  @Test
  public void testForTitle() {
	  
	  String Title = "Welcome: Mercury Tours";
      
      String ActualTitle = driver.getTitle();
      Assert.assertEquals(Title,ActualTitle );
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  
	  String baseUrl = "http://newtours.demoaut.com";
	  
	  File file = new File("F:\\Saradhi.Seshagiri\\Resource_Files\\Selenium\\Selenium\\Selenium_New_Jars\\chromedriver.exe");
      System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
     
      driver = new ChromeDriver();
      
      driver.get(baseUrl);
	  
  }

  
  @AfterTest
  public void afterTest() {
	  
	  System.out.println("Success!!!!");
	  driver.quit();
	  
  }

}
