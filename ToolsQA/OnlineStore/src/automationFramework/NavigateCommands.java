package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateCommands {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Practice Exercise

	  //  Launch new Browser
	    //Open DemoQA.com website
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Manoj\\Desktop\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.DemoQA.com");
		
	   // Click on Registration link using “driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();"
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		
		//Come back to Home page (Use ‘Back’ command)
		driver.navigate().back();
	    System.out.println("Use ‘Back’ command");
	    
		//Again go back to Registration page (This time use ‘Forward’ command)
		driver.navigate().forward();
	    System.out.println("Use ‘Forward’ command");
	    
		//Again come back to Home page (This time use ‘To’ command)
	   driver.navigate().to("http://www.DemoQA.com");
	   System.out.println("Use ‘To’ command");
	   
		//Refresh the Browser (Use ‘Refresh’ command)
	   driver.navigate().refresh();
	    
	   //Close the Browser
	   driver.quit();

	}

}
