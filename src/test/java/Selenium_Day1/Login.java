package Selenium_Day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Login {
WebDriver driver;
//	public static void main(String[] args) {
		// TODO Auto-generated method stub
@BeforeTest
public void before()
{
System.setProperty("webdriver.chrome.driver", "C:\\REST Webservice\\Selenium 3.0\\Selenium 3.0\\Selium 3.0\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("http://demoaut.com/");
driver.manage().window().maximize();
}
//driver.findElement(By.name("userName")).sendKeys("tutorial");
//driver.findElement(By.name("password")).sendKeys("tutorial");
//driver.findElement(By.name("login")).click();
//driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
//Select user = new Select(driver.findElement(By.name("passCount")));
//user.selectByValue("3");
//Select City = new Select(driver.findElement(By.name("fromPort")));
//City.selectByVisibleText("London");
//driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]")).sendKeys("4");
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//driver.findElement(By.linkText("Home")).click();
//driver.findElement(By.linkText("Flights")).click();
//driver.findElement(By.linkText("CONTACT")).click();
//driver.findElement(By.linkText("Home")).click();
//driver.quit();
@Test	
public void readdata() throws IOException
	{
	File src = new File ("C:\\Users\\Training_c2a.05.01\\Desktop\\Selenium.xlsx");
	FileInputStream fis = new FileInputStream(src);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)	
		{
			String data0 = sheet1.getRow(j).getCell(0).getStringCellValue();
			String data1 = sheet1.getRow(j).getCell(1).getStringCellValue();
			System.out.println("out");
			System.out.println(data0);
			System.out.println(data1);
driver.findElement(By.name("userName")).sendKeys(data0);
driver.findElement(By.name("password")).sendKeys(data1);
driver.findElement(By.name("login")).click();	
WebDriverWait wa = new WebDriverWait(driver,10);
wa.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Home"))));
String web = driver.getTitle();
System.out.println(web);
SoftAssert softAssertion= new SoftAssert();
softAssertion.assertEquals("Find a Flight: Mercury Tours:", web);
if(web=="Find a Flight: Mercury Tours:")
{
	 sheet1.getRow(j).createCell(3).setCellValue("pass");
	 FileOutputStream fos = new FileOutputStream("C:\\Users\\Training_c2a.05.01\\Desktop\\Selenium.xlsx");
	 wb.write(fos);
	 fos.close();
}
//driver.navigate().back();
driver.findElement(By.linkText("Home")).click();
driver.findElement(By.name("userName")).clear();
driver.findElement(By.name("password")).clear();
//sheet1.getRow(i).getCell(3).setCellValue("pass");
}
}
	}
}

