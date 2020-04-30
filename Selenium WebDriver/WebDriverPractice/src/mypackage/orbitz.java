package mypackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class orbitz {

public static void main(String[] args) throws IOException, InterruptedException {

String[][] data;
data=excelRead();
double price;
for(int i=1 ; i<data.length ; i++)
{
price=findPrice(data[i][0],data[i][1]);
System.out.println("Price For Flight From " +data[i][0]+ " To " +data[i][1]+ " is " +price);
}
}
public static double findPrice(String src,String dest) throws InterruptedException
{
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("http://www.orbitz.com/");

Thread.sleep(1000);

//Click on the Flights Only radio button
driver.findElement(By.xpath("//input[@name=’search.type’]")).click();

//Click on From city
driver.findElement(By.name("ar.rt.leaveSlice.orig.key")).sendKeys(src);

//Click on To city
driver.findElement(By.name("ar.rt.leaveSlice.dest.key")).sendKeys(dest);

//Leave date
driver.findElement(By.name("ar.rt.leaveSlice.date")).sendKeys("03/20/2015");

//Return Date
driver.findElement(By.name("ar.rt.returnSlice.date")).sendKeys("03/27/2015");

//Click on Search Flights Button
driver.findElement(By.name("search")).click();

Thread.sleep(1000);

//Select the lowest price from the list
driver.findElement(By.xpath("//*[@id=’main’]/div[9]/div[2]/div[1]/div[1]/div/div[2]/a")).click();

//Get the price
String price=driver.findElement(By.className("mirrorCash")).getText().replace("$", "").replace(",","");
double dprice=Double.parseDouble(price);
return dprice;
}
public static String[][] excelRead() throws IOException
{
FileInputStream fis=new FileInputStream("E:\\abcd.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet ws=wb.getSheet("Sheet1");

int rowNum=ws.getLastRowNum()+1;
int colNum=ws.getRow(0).getLastCellNum();
String[][] data=new String[rowNum][colNum];

for(int i=1; i<rowNum ; i++)
{
XSSFRow row=ws.getRow(i);
for(int j=0; j<colNum; j++)
{
XSSFCell cell=row.getCell(j);
String value=cellToString(cell);
data[i][j]=value;
System.out.println(cell);
}
}
return data;
}
public static String cellToString(XSSFCell cell)
{
int type;
Object res;
type=cell.getCellType();
switch(type)
{
case 0://Numeric value in excel
res=cell.getNumericCellValue();
break;
case 1://String value in excel
res=cell.getStringCellValue();
break;
default:
throw new RuntimeException("There are no support for this type of cell.");
}
return res.toString();
}}

