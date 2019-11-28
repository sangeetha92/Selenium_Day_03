package Demo_2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "C:\\REST Webservice\\Selenium 3.0\\Selenium 3.0\\Selium 3.0\\chromedriver.exe");
	  driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	String alertMessage = driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	System.out.println(alertMessage);
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  //@AfterClass
  //public void afterClass() {
//	driver.quit();
  //}

}
