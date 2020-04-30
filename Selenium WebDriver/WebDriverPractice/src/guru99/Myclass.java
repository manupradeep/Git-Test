package guru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myclass{
public static void main(String[] args){
	//fetch Mercury Tours' homepage
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://newtours.demoaut.com");
	
	//verify its title
	String ExpectedTitle = "Welcome: Mercury Tours";
	String ActualTitle ="";
	ActualTitle = driver.getTitle();
	
	//print out the result of the comparison
	if(ActualTitle.contentEquals(ExpectedTitle)){
		System.out.println("Title Matches: Passed");
	}
	else
		System.out.println("Title not Matched: Failed");
	//4.close it before ending the entire program.
		
	driver.close();
	
	
}

}