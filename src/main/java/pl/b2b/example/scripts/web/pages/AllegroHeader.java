package pl.b2b.example.scripts.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pl.b2b.example.core.PageObject;

public class AllegroHeader extends PageObject {
	WebDriver driver;
	
	public AllegroHeader(WebDriver driver) {
		this.driver = driver;
	}
	
	public void wpiszTekstWPoleWyszukaj(String fraza) throws Exception {
		By query = By.id("main-search-text");
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(query)));
		
        WebElement searchInput = driver.findElement(query);
        
        searchInput.sendKeys(fraza);
        
        Thread.sleep(250);
	}
	
	public void kliknijPrzyciskSzukaj() throws Exception {
		By query = By.className("search-btn");
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(query)));
		
        WebElement searchInput = driver.findElement(query);
        
        searchInput.click();
        
        Thread.sleep(250);
	}
	
	public void wyszukaj(String fraza) throws Exception {
		wpiszTekstWPoleWyszukaj(fraza);
		kliknijPrzyciskSzukaj();
	}

}
