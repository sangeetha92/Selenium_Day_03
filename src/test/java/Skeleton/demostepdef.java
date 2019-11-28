package Skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demostepdef {
	WebDriver driver;

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		@Given("^end user is on the login page$")
		public void end_user_is_on_the_login_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    //System.out.println("user is on the login page");
			System.setProperty("webdriver.chrome.driver", "C:\\REST Webservice\\Selenium 3.0\\Selenium 3.0\\Selium 3.0\\chromedriver.exe");
			driver = new ChromeDriver();			
			driver.get("http://demoaut.com/");
		}

		@When("^end user enters the valid credentials and click on submit button$")
		public void end_user_enters_the_valid_credentials_and_click_on_submit_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			//System.out.println("enter credentials and click submit");
			driver.findElement(By.name("userName")).sendKeys("tutorial");
			driver.findElement(By.name("password")).sendKeys("tutorial");
			driver.findElement(By.name("login")).click();
		}

		@Then("^user does successful login$")
		public void user_does_successful_login() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			//System.out.println("login successful");
			WebDriverWait wa = new WebDriverWait(driver,10);
			wa.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Home"))));
			String web = driver.getTitle();
			System.out.println(web);
			SoftAssert softAssertion= new SoftAssert();
			softAssertion.assertEquals("Find a Flight: Mercury Tours:", web);
	}

}
