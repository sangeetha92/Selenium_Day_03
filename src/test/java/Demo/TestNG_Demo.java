package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {
	WebDriver driver;
	String Expectedresult = "Find a Flight: Mercury Tours:";
	  @Test
  public void login() {
	  //System.out.println("login success");
//	  WebDriver driver = new ChromeDriver();
    driver.findElement(By.name("userName")).sendKeys("tutorial");
	driver.findElement(By.name("password")).sendKeys("tutorial");
	driver.findElement(By.name("login")).click();
	Assert.assertEquals(Expectedresult, driver.getTitle());
	WebDriverWait wait = new WebDriverWait(driver,30);
    System.out.println(driver.getTitle());
    wait.until(ExpectedConditions.titleIs("Find a Flight: Mercury Tours:"));
    System.out.println(driver.getCurrentUrl());
    String read = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[1]/font/b")).getText();
    System.out.println(read);
	  }
  @BeforeClass
  public void beforeClass() {
	  //System.out.println("open the URL");
	  System.setProperty("webdriver.chrome.driver", "C:\\REST Webservice\\Selenium 3.0\\Selenium 3.0\\Selium 3.0\\chromedriver.exe");
	  driver = new ChromeDriver();
      driver.get("http://demoaut.com/");
//	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	//driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	//String alertMessage = driver.switchTo().alert().getText();
	//driver.switchTo().alert().accept();
	//System.out.println(alertMessage);
      driver.manage().window().maximize();
    
	    }

  //@AfterClass
 // public void afterClass() {
	//System.out.println("logout the application");
	  //driver.quit();
	   // }

  //@BeforeTest
  //public void beforeTest() {
	//  System.out.println("open browser");
  //}

  //@AfterTest
  //public void afterTest() {
	 // System.out.println("Closed browser");
	  //  }
}
