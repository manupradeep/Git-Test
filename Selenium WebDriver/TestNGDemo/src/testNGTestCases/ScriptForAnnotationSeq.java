package testNGTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScriptForAnnotationSeq {
	
		// declaration and instantiation of objects/variables
    	WebDriver driver = new FirefoxDriver();
    	public String baseUrl = "http://newtours.demoaut.com";
	
    	@AfterTest
    	public void terminatingTheBrowser() {
    		//Terminating the Firefox browser...
    		driver.quit();
    	}
    	
    	@BeforeTest
    	public void launchTheBrowser() {
    		// launch Firefox and direct it to the Base URL..
    		driver.get(baseUrl);
    	}
    	
    	@Test
    	public void verifyHomePageTitle() {
    		 String expectedTitle = "Welcome: Mercury Tours";
    	     String actualTitle = "";

    	     // launch Firefox and direct it to the Base URL
    	     driver.get(baseUrl);

    	     // get the actual value of the title
    	     actualTitle = driver.getTitle();
    	       
    	     //compare the actual title of the page with the expected one and print the result as "Passed" or "Failed"..
    	     Assert.assertEquals(actualTitle, expectedTitle);
    	}
    	
    	/*@AfterTest
    	public void terminatingTheBrowser() {
    		//Terminating the Firefox browser...
    		driver.quit();
    	}*/
    	
}
