package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calculatorsum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new FirefoxDriver();
	
	driver.navigate().to("http://www.calculator.net/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/div[2]/div/div[3]/a")).click();
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/div[1]/div[1]/ul[1]/li[3]/a")).click();
	driver.findElement(By.id("cpar1")).sendKeys("5");
	driver.findElement(By.id("cpar2")).sendKeys("50");
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/div[1]/div[1]/table[1]/tbody/tr[2]/td/input[2]")).click();
	String result;
	result=driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/div[1]/div[1]/p[2]/font/b")).getText();
	
	System.out.println("Result is "+result);
	
	driver.close();
	}

}
