package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryFlights {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating a firefox browser instance
		WebDriver driver = new FirefoxDriver();
		
		// Opening the specified URL
		driver.get("http://newtours.demoaut.com");
		
		// Comparing the Actual Title value 
		String Title = driver.getTitle();
		System.out.println(Title);
		
		if(driver.getTitle().contains("Welcome: Mercury Tours")){
			System.out.println("Test passed");
		}else{
			System.out.println("Test failed");
		}
		
		//Closing the Broser
		//driver.close();
	}

}
