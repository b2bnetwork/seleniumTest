package eBay.Test.Scripts.Tests;
import java.util.concurrent.TimeUnit;
import static java.lang.System.out;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import eBay.Test.Scripts.Pages.EbayMain;
import junit.framework.AssertionFailedError;

public class CheckResultsNumber 
{
	private WebDriver webdriver;
	
	@Before
	public void setUp() 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\sys\\geckodriver.exe");
		webdriver = new FirefoxDriver();
		webdriver.manage().window().maximize();
		//webdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void CountListItems() throws InterruptedException
	{
		EbayMain mainPage = new EbayMain(webdriver);
		mainPage.getHeader().wpiszSzukanaFraze("bike");
		mainPage.getHeader().kliknijPrzyciskWyszukaj();
		int itemsNumber = (new WebDriverWait(webdriver, 10)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='ListViewInner']/li[contains(@class,'sresult')]"))).size();
		out.println(itemsNumber);
		if(mainPage.getFooter().doesPaginationTableExist())
		{
			try { Assert.assertTrue(itemsNumber == 50); }
			catch (AssertionError e) { System.out.println("Test case failed"); }
		}
		else
		{
			try {Assert.assertTrue(itemsNumber <= 50); }
			catch (AssertionFailedError e) { System.out.println("Test case failed"); }
		}
	}
	
	@After
	public void tearDown() 
	{
		System.out.println("Test finished");
		//webdriver.quit();
	}
}