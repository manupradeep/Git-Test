package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myclass1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://www.facebook.com";
		driver.get(baseURL);
		//String tagName=driver.findElement(By.id("email")).getTagName();
		WebElement uName= driver.findElement(By.id("email"));
		uName.sendKeys("manupradeep.kumar7@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("cassiterite1$");
		
		WebDriverWait mywaitVar = new WebDriverWait(driver,10);
		mywaitVar.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("u_0_l")));
		
		WebElement logIn = driver.findElement(By.id("u_0_l"));
		logIn.click();
		//System.out.println(tagName);
		String ExpectedTitle = "Facebook";
		String ActualTitle = driver.getTitle();
		
		if(ActualTitle.contentEquals(ExpectedTitle)){
			System.out.println("Log in Successful: Username and Password are correct");
		}
		
		else
			System.out.println("Log in Unsuccessful: Username and Password are incorrect");
		//driver.findElement(By.linkText("Forgotten account?")).click();
	}

}
