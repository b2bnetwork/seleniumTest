package pl.b2b.example.scripts.web.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import pl.b2b.example.scripts.web.pages.AllegroList;
import pl.b2b.example.scripts.web.pages.AllegroMain;

public class FindOnList {
	private WebDriver webdriver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "d:\\drivers\\geckodriver.exe");
		webdriver = new FirefoxDriver();
	}
	
	@Test
	public void findMostExpensiveItemOnList() throws Exception {
		AllegroMain allegroMain = new AllegroMain(webdriver); 			//Wejść na strone główną
		allegroMain.getHeader().wyszukaj("passat"); 					//Wyszukać passata
		AllegroList allegroList = new AllegroList(webdriver);
		List<WebElement> prices = allegroList.getProductPriceTagList();	//Pobrać listę wyników
		
		List<Double> doublePrices = new ArrayList<>();
		for (WebElement price : prices) {
			String sprice = price.getText();
			String strippedPrice = sprice.substring(0, sprice.lastIndexOf(" ")).trim().replace(",", ".").replace(" ", "");
			doublePrices.add(Double.parseDouble(strippedPrice));
		}
		
		//Znaleść najdroższy
		Double highest = new Double(0);
		for (Double price : doublePrices) {
			if (price > highest) {
				highest = price;
			}
		}
		
		Assert.assertTrue(highest > 100000D);
		
		System.out.println("And the winner is:");
		System.out.println(highest + " zł");
		
		Thread.sleep(3000);
	}

	@Test
	public void findCheapestItemOnList() {
		//Wejść na strone główną
		//Wyszukać passata
		//Pobrać listę wyników
		//Znaleść najtańszego
	}
	
	@After
	public void tearDown() {
		webdriver.quit();
	}

}
