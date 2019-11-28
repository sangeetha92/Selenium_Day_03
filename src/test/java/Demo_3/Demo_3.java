package Demo_3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_3 {
	WebDriver driver;
  @Test
  public void f() {
	  // WebElement resize = driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
	  // Actions action = new Actions(driver);
	//	 action.dragAndDropBy(resize, 1000, 1000).perform();
	  WebElement aboutus = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span"));
	  Actions act = new Actions(driver);	
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(aboutus));
	act.moveToElement(aboutus).click().build().perform();
	WebElement ouroffice = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));
    WebDriverWait wait1 = new WebDriverWait(driver,10);
	wait1.until(ExpectedConditions.elementToBeClickable(ouroffice));
    act.moveToElement(ouroffice).click().build().perform();
	WebElement bangalore = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[2]/a/span"));
	WebDriverWait wait2 = new WebDriverWait(driver,30);
	wait2.until(ExpectedConditions.elementToBeClickable(bangalore));
	act.moveToElement(bangalore).click().build().perform();
	String parentwindowid = driver.getWindowHandle();
	Set<String> set = driver.getWindowHandles();
	for(String s:set)
	{
		driver.switchTo().window(s);
	}
    driver.switchTo().frame(driver.findElement(By.name("main_page")));
  //driver.switchTo().frame("main_page");
  String address = driver.findElement(By.tagName("address")).getText();
  System.out.println(address);
  driver.quit();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\REST Webservice\\Selenium 3.0\\Selenium 3.0\\Selium 3.0\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  }
}
