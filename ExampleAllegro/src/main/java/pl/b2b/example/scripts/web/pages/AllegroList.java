package pl.b2b.example.scripts.web.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pl.b2b.example.core.PageObject;

public class AllegroList extends PageObject {
	private WebDriver driver;
	private AllegroHeader allegroHeader;
	
	public AllegroList(WebDriver driver) {
		this.driver = driver;
		allegroHeader = new AllegroHeader(driver);
	}
	
	public AllegroHeader getHeader() {
		return allegroHeader;
	}
	
	public List<WebElement> getProductPriceTagList() {
		By condition = By.xpath("//div[@id = 'opbox-listing']");
		By query = By.xpath("//div[@id = 'opbox-listing']//article//span[contains(@class, 'formatted-price')]");
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(condition)));
        
		return driver.findElements(query);
	}

}
