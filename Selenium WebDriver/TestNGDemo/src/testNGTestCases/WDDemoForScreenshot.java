package testNGTestCases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WDDemoForScreenshot {

	@Test
    public void testTakeScreenShot() throws Exception{
 
		System.setProperty("webdriver.chrome.driver", "F:\\Saradhi.Seshagiri\\Resource_Files\\Selenium\\Selenium\\Selenium_New_Jars\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
 
        //goto url
        driver.get("http://interact.techmahindra.com/nlogin.aspx");
 
        //Call take screenshot function
         this.takeSnapShot(driver, "F:\\Saradhi.Seshagiri\\Saradhi_TechM\\Additional_Resources\\test.png") ; 
    }
     
     /**
      * This function will take screenshot
      * @param webdriver
      * @param fileWithPath
      * @throws Exception
      */
     public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
 
        	//Convert web driver object to TakeScreenshot
         	TakesScreenshot scrShot =((TakesScreenshot)webdriver);
 
         	//Call getScreenshotAs method to create image file
            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
 
            //Move image file to new destination
            File DestFile=new File(fileWithPath);
 
            //Copy file at destination
            FileUtils.copyFile(SrcFile, DestFile);
 
    }

}
