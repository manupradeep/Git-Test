package practiceTestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeSwitchWindows {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) Launch new Browser

		//2) Open URL �http://toolsqa.wpengine.com/automation-practice-switch-windows/�
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Manoj\\Desktop\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		
		//3) Click on Button �Alert Box�, it will open a Pop Up Window generated by JavaScript
		driver.findElement(By.xpath("//*[text()='Alert Box']")).click();
		
		//4) Switch to Alert window (Use �SwitchTo()Alert() command)
		Alert myAlert = driver.switchTo().alert();

		//5) Close the Pop Up Window (Use Accept command)
		myAlert.accept();
		
	}

}
