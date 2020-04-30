package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverCommands_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Practice Exercise – 2

	    //  Launch a new Firefox browser.
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Manoj\\Desktop\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		//Open http://demoqa.com/frames-and-windows/
		driver.get("http://demoqa.com/frames-and-windows/");
		
	    //Use this statement to click on a New Window button driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();”
		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		
		//Close the browser using close() command
		driver.quit();

	}

}
