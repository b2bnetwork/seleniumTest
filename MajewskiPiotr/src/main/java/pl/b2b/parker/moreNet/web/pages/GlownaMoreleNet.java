package pl.b2b.parker.moreNet.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlownaMoreleNet {

	WebDriver driver;

	@FindBy(name = "search")
	WebElement poleSzukania;
	
	@FindBy(xpath="//*[@id='searchform']/div/div[2]/button")
	WebElement lupa;

	public GlownaMoreleNet(WebDriver driver) {
		this.driver = driver;
	}

	public void wpiszSzukanyProdukt(String produkt) {
		poleSzukania.sendKeys(produkt);
	}
	
	public void kliknijLupe(){
		lupa.click();
	}

}
