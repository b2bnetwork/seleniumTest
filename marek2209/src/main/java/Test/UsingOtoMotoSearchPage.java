package Test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import Helpers.Actions;
import Pages.OtoMotoSearchPage;

public class UsingOtoMotoSearchPage {
	
	public WebDriver driver;
	public OtoMotoSearchPage searchPage;
	public Actions action;
	@Before
	public void setup(){
		System.setProperty("webdriver.gecko.driver","C:/Users/b2bnet/Downloads/geckodriver.exe");
        driver = new FirefoxDriver();
        action = new Actions(driver);
        searchPage = PageFactory.initElements(driver, OtoMotoSearchPage.class);
	}
	
	
	@Test
	public void FindManufacturer(){
		action.goToOtoMotoUrl();
		searchPage.chooseManufacturer("Audi");
	}
	

}