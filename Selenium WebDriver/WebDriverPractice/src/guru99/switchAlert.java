package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchAlert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://jsbin.com/usidix/1");
		 driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
	      String  alertMessage = driver.switchTo().alert().getText();
	        driver.switchTo().alert().accept();
	       
	        System.out.println(alertMessage);
	        driver.quit();

	}

}
