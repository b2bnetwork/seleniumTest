package eBay.Test.Scripts.Pages;
import org.apache.xpath.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbayFooter 
{
	private WebDriver driver;
	private WebElement paginationTable;
	
	public EbayFooter(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public boolean doesPaginationTableExist()
	{
		try
		{
			paginationTable = (new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.id("Pagination")));
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
}