package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectCommands {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


	   // Launch new Browser
	  //  Open “http://toolsqa.wpengine.com/automation-practice-form/”
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Manoj\\Desktop\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		//Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
	  //  Select oSelect = new Select(driver.findElement(By.id("selenium_commands")));
		Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));
		//Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
	    oSelect.selectByIndex(0);
	    Thread.sleep(2000);
	    oSelect.deselectByIndex(0);
	    Thread.sleep(2000);
	    //Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
	    oSelect.selectByVisibleText("Navigation Commands");
	    Thread.sleep(2000);
	    oSelect.selectByVisibleText("Navigation Commands");
	    Thread.sleep(2000);
	    
	    //Print and select all the options for the selected Multiple selection list.
	    List<WebElement> oSize = oSelect.getOptions();
	    int iListSize = oSize.size();
	    for(int i =0; i < iListSize ; i++){
			// Storing the value of the option	
			String sValue = oSelect.getOptions().get(i).getText();

			// Printing the stored value
			System.out.println(sValue);

			// Selecting all the elements one by one
			oSelect.selectByIndex(i);
			Thread.sleep(2000);
			
	    
	    //Deselect all options
	    oSelect.deselectAll();
	   // 
	    }
	  //Close the browser
		driver.close();
	}
	

}
