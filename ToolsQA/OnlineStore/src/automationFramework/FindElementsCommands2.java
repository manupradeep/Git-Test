package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsCommands2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Practice Exercise 2

	  //  Launch new Browser
	  //  Open URL http://toolsqa.wpengine.com/automation-practice-form/
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Manoj\\Desktop\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
				
		//Click on the Link “Partial Link Test” (Use ‘patialLinkTest’ locator and search by ‘Partial’ word)
	    driver.findElement(By.partialLinkText("Partial")).click();
	    System.out.println("Partial Link Test clicked");
		
		//Identify Submit button with ‘tagName’, convert it in to string and print it on the console
	    driver.findElement(By.tagName("button")).submit();
	    System.out.println("Button clicked");
	    
	    //Click on the Link “Link Test” (Use ‘linkTest’ locator)
	    driver.findElement(By.linkText("Link Test")).click();
	    System.out.println("Link Test clicked");
	
	    driver.close();
	}

}
