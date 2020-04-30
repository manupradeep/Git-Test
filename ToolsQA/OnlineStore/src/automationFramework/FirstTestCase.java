package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {
	public static void main(String[] args){
	
	WebDriver driver;
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Manoj\\Desktop\\Drivers\\geckodriver.exe");
	driver  = new FirefoxDriver();
	driver.get("http://www.store.demoqa.com");
	 
    // Print a Log In message to the screen
    System.out.println("Successfully opened the website www.Store.Demoqa.com");

	//Wait for 5 Sec
	//Thread.sleep(5);
   
	
    // Close the driver
    driver.quit();
}
}