package testNGTestCases;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGFile {
	
    //WebDriver driver = new FirefoxDriver();
    
	WebDriver driver = null;
    String baseUrl = "http://newtours.demoaut.com";

    @Test
    public void f() {
    
    	System.setProperty("webdriver.chrome.driver", "F:\\Saradhi.Seshagiri\\Resource_Files\\Selenium\\Selenium\\Selenium_New_Jars\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
      
      driver.get(baseUrl);
      
      String Title = "Welcome: Mercury Tours";
      
      String ActualTitle = driver.getTitle();
      Assert.assertEquals(Title,ActualTitle );
      
      driver.quit();
}


}
