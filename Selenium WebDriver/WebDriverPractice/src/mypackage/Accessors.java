package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Accessors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.calculator.net");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/div[2]/div/div[3]/a")).click();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/div[1]/div[1]/ul[1]/li[3]/a")).click();
		driver.findElement(By.id("cpar1")).sendKeys("5");
		driver.findElement(By.id("cpar1")).getAttribute("value");
		
	}

}
