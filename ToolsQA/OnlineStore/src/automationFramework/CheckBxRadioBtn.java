package automationFramework;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBxRadioBtn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Practice Exercise

	   // Launch new Browser
	   // Open "http://toolsqa.wpengine.com/automation-practice-form/"
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Manoj\\Desktop\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		List<WebElement> checkLst = driver.findElements(By.name("sex"));
	   // Challenge One – Select the deselected Radio button (female) for category Sex (Use IsSelected method)
		boolean bValue=false;
		bValue = checkLst.get(0).isSelected();
		
		if(bValue=true)
			checkLst.get(1).click();
		else
			checkLst.get(0).click();
		
		
	  //  Challenge Two – Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
		
		driver.findElement(By.id("exp-2")).click();
	  
	  //Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
		List<WebElement> checkBxProf = driver.findElements(By.name("profession"));
		
		int iSize = checkBxProf.size();
		
		for(int i=0;i<iSize;i++){
			String sName = checkBxProf.get(i).getAttribute("value");
			
			if(sName.equalsIgnoreCase("Automation Tester")){
				checkBxProf.get(i).click();
				break;
			}
		}
	
	    //Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)
		WebElement oCheckBox = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		oCheckBox.click();
		
		// Kill the browser
		driver.quit();
	}

}
