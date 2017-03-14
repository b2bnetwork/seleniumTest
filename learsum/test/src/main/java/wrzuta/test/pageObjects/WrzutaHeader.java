package wrzuta.test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import wrzuta.test.lib.lib;


public class WrzutaHeader extends lib {
	WebDriver driver;

	public WrzutaHeader(WebDriver driver) {
		this.driver = driver;
	}
	
	public void wpiszTekstWPoleWyszukaj(String fraza) throws Exception {
		By query = By.id("words");
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(query)));
		
        WebElement searchInput = driver.findElement(query);
        
        searchInput.sendKeys(fraza);
        
        Thread.sleep(250);
	}
	
	public void kliknijPrzyciskSzukaj() throws Exception {
		By query = By.xpath(".//*[@id='header_search_submit']");
		
		waitForPageToLoad(1000, driver);
		
        WebElement searchInput = driver.findElement(query);
        
        
        searchInput.click();
        
        Thread.sleep(250);
	}
	
	public void wyszukaj(String fraza) throws Exception {
		wpiszTekstWPoleWyszukaj(fraza);
		kliknijPrzyciskSzukaj();
	}

	public void kliknijWTopMuzyka() throws InterruptedException 
	{
	By query = By.xpath("html/body/div[1]/ul/li[2]/a");
	
	
	
    WebElement musicInput = driver.findElement(query);
    
    
    musicInput.click();
    
    waitForPageToLoad( driver);}
	
}
