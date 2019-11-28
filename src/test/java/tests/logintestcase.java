package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import LibraryFunctions.BrowserFactory;
import Pages.login;

public class logintestcase
{
	@Test
	public void test()
	{
		WebDriver driver = BrowserFactory.startBrowser("chrome","http://demoaut.com/");
		Pages.login log = new login(driver);
		log.loginuser("tutorial", "tutorial");
	}
	}