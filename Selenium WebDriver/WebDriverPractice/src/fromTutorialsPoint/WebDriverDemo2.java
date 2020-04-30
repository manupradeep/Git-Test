package fromTutorialsPoint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.calculator.net/mortgage-calculator.html");
	    System.out.println("The output of the isSelected"+driver.findElement(By.id("caddoptional")).isSelected());
		System.out.println("The output of the isEnabled"+driver.findElement(By.id("caddoptional")).isEnabled());
		System.out.println("The output of the isDisplayed"+driver.findElement(By.id("caddoptional")).isDisplayed());
		
		driver.close();
	
	
	}

}
