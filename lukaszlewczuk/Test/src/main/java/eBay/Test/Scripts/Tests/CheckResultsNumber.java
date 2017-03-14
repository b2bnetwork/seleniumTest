package eBay.Test.Scripts.Tests;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import eBay.Test.Scripts.Pages.EbayMain;

public class CheckResultsNumber 
{
	private WebDriver webdriver;
	
	@Before
	public void setUp() 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\sys\\geckodriver.exe");
		webdriver = new FirefoxDriver();
	}
	
	@Test
	public void CountListItems()
	{
		EbayMain mainPage = new EbayMain(webdriver);
	}
	
	@After
	public void tearDown() 
	{
		webdriver.quit();
	}
}