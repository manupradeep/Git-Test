package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsCommands1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Practice Exercise 1

	   // Launch new Browser
	   // Open URL http://toolsqa.wpengine.com/automation-practice-form/
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Manoj\\Desktop\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	    //Type Name & Last Name (Use Name locator)
		driver.findElement(By.name("firstname")).sendKeys("Manoj");
		driver.findElement(By.name("lastname")).sendKeys("MV");
		
	    //Click on Submit button (Use ID locator)
		//driver.findElement(By.id("submit")).submit();
		
		System.out.println("data submitted successfully");
		
		driver.quit();

	}

}
