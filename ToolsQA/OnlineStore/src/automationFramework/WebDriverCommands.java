package automationFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverCommands {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Practice Exercise – 1

	  //  Launch a new Firefox browser.
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Manoj\\Desktop\\Drivers\\geckodriver.exe");
	    
		//Open Store.DemoQA.com
		driver = new FirefoxDriver();
		driver.get("http://www.store.demoqa.com");
	    
		//Get Page Title name and Title length
		String pageTitle=driver.getTitle();
		int titleLength=driver.getTitle().length();
	    
		//Print Page Title and Title length on the Eclipse Console.
		System.out.println("Page Title is : "+pageTitle);
		System.out.println("Page TitleLength is : "+titleLength);
		
		//Get Page URL and verify if the it is a correct page opened
		String eTitle="http://store.demoqa.com/";
		String aTitle=driver.getCurrentUrl();
		
		if(aTitle.equals(eTitle))
			System.out.println("Verification of Url is successful");
		else
			System.out.println("URL mismatch");
	    
		//Get Page Source (HTML Source code) and Page Source length
		String pSource=driver.getPageSource();
		int pslenght=pSource.length();
	    
		//Print Page Length on Eclipse Console.
		System.out.println("Page length: "+pslenght);
	    
		//Close the Browser.
		driver.close();	
	}
}
