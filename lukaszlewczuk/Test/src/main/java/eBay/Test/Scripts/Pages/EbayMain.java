package eBay.Test.Scripts.Pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import eBay.Test.Core.HelpersMethods;

public class EbayMain extends HelpersMethods
{
	private EbayHeader ebayHeader;
	
	public EbayMain(WebDriver driver) 
	{
		ebayHeader = new EbayHeader(driver);
		driver.get("http://www.ebay.pl/");	
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public EbayHeader getHeader()
	{
		return ebayHeader;
	}
}