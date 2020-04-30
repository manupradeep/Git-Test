package practiceTestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeSwitchWindow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1) Launch new Browser

		//2) Open URL “http://toolsqa.wpengine.com/automation-practice-switch-windows/”
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Manoj\\Desktop\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		
		//3) Get Window name (Use GetWindowHandle command)
		String handle = driver.getWindowHandle();
		
		System.out.println(handle);
		
	//	4) Click on Button “New Message Window”, it will open a Pop Up Window
		driver.findElement(By.xpath("//*[text()='New Message Window']")).click();
		
	//	5) Get all the Windows name ( Use GetWindowHandles command)
		Set handles = driver.getWindowHandles();
		
		 
		
		//6) Close the Pop Up Window (Use Switch Command to shift window)
		for(String handle1:driver.getWindowHandles()){
			System.out.println("In handle1"+handle1);
			driver.switchTo().window(handle1);
	
		}
		driver.close();
	}
	

}
