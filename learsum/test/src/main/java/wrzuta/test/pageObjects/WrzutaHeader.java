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
	By query = By.cssSelector(".top-bar__nav > li:nth-child(2) > a:nth-child(1)");
	
	
	
    WebElement musicInput = driver.findElement(query);
    
    
    musicInput.click();
    
    waitForPageToLoad( driver);}
	


public void podajTytułyZTop(int TopPierwszych) throws InterruptedException 
{
String queryPart1 = ".//*[@id='content']/div[1]/div/ul/li[";
String queryPart2 = "]/div[2]/a";
for(int i =1; i<=TopPierwszych;i++){
	System.out.println(driver.findElement(By.xpath( queryPart1 + i + queryPart2)).getText());	
}
}

}

