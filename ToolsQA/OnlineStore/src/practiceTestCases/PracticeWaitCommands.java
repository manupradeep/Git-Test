package practiceTestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeWaitCommands {

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
		
		//3) Click on the Button “Timing Alert”
		driver.findElement(By.id("timingAlert")).click();
		
		//4) Accept the Alert (Alert will take 3 second to get displayed, Use WebDriverWait to wait for it)
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		alert.accept();
		
		driver.close();
	}

}
