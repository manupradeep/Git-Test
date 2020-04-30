package testNGTestCases;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScriptForWDDemoFireFox {
	
  @Test
  public void verifyHomePageTitle() {
	  
	  // declaration and instantiation of objects/variables
      //WebDriver driver = new FirefoxDriver();
      
      File file = new File("F:\\Saradhi.Seshagiri\\Resource_Files\\Selenium\\Selenium\\Selenium_New_Jars\\chromedriver.exe");
	  System.setProperty("webdriver.chrome.driver",file.getAbsolutePath() );
	  WebDriver driver = new ChromeDriver();
	  
      String baseUrl = "http://newtours.demoaut.com";
      
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = "";

      // launch Firefox and direct it to the Base URL
      driver.get(baseUrl);

      // get the actual value of the title
      actualTitle = driver.getTitle();
       
      //compare the actual title of the page with the expected one and print the result as "Passed" or "Failed"..
      Assert.assertEquals(actualTitle, expectedTitle);
      
      //close Firefox...
      driver.quit();

  }
}
