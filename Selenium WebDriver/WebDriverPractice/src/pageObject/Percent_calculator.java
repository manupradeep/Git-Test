package pageObject;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Percent_calculator
{
private static WebDriver driver = null;
public static void main(String[] args)
{
driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://www.calculator.net");
// Use page Object library now
Page_objects_perc_calc.lnk_math_calc(driver).click();
Page_objects_perc_calc.lnk_percent_calc(driver).click();
Page_objects_perc_calc.txt_num_1(driver).clear();
Page_objects_perc_calc.txt_num_1(driver).sendKeys("10");
Page_objects_perc_calc.txt_num_2(driver).clear();
Page_objects_perc_calc.txt_num_2(driver).sendKeys("50");
Page_objects_perc_calc.btn_calc(driver).click();
String result =
Page_objects_perc_calc.web_result(driver).getText();
if(result.equals("5"))
{
System.out.println(" The Result is Pass");
}
else
{
System.out.println(" The Result is Fail");
}
driver.close();
}
}