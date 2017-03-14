package eBay.Test.Scripts.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import eBay.Test.Core.HelpersMethods;

public class EbayHeader extends HelpersMethods
{
	private WebDriver driver;
	
	public EbayHeader(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void wpiszSzukanaFraze(String fraza) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("gh-ac"))));
		WebElement tbSearch = driver.findElement(By.id("gh-ac"));
		tbSearch.sendKeys(fraza);
		Thread.sleep(250);
	}
	
	public void kliknijPrzyciskWyszukaj()
	{
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("gh-btn"))));
		WebElement btnSearch = driver.findElement(By.id("gh-btn"));
		btnSearch.click();
	}
}