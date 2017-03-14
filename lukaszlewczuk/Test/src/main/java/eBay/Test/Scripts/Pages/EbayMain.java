package eBay.Test.Scripts.Pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import eBay.Test.Core.HelpersMethods;

public class EbayMain extends HelpersMethods
{
	private EbayHeader ebayHeader;
	private EbayFooter ebayFooter;
	
	public EbayMain(WebDriver driver) 
	{
		ebayHeader = new EbayHeader(driver);
		ebayFooter = new EbayFooter(driver);
		driver.get("http://www.ebay.pl/");	
	}
	
	public EbayHeader getHeader()
	{
		return ebayHeader;
	}
	
	public EbayFooter getFooter()
	{
		return ebayFooter;
	}
}