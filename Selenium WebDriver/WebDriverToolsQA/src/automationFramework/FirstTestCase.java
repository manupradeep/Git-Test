package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {
	public static void main(String[] args){		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Manoj\\Desktop\\Drivers\\geckodriver.exe");
		driver =new FirefoxDriver();
		
		
		driver.get("http://www.store.demoqa.com");
		System.out.println("Successfully opened website");
		
		driver.quit();
	}
}
