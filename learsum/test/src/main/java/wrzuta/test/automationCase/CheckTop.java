package wrzuta.test.automationCase;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import wrzuta.test.pageObjects.WrzutaHomePage;

public class CheckTop {

private WebDriver webdriver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "c:\\sys\\geckodriver.exe");
		webdriver = new FirefoxDriver();
	}
	
	@Test
	public void findTitlesOfTop15Song() throws Exception {
		
		WrzutaHomePage wrzutaHomePage = new WrzutaHomePage(webdriver); 		
				
		wrzutaHomePage.getHeader().kliknijWTopMuzyka(); 					
	//	wrzutaHomePage.getHeader()
		
	}

//	@Test
//	public void findMultimediaOnSite()throws Exception {
//		
//		WrzutaHomePage wrzutaHomePage = new WrzutaHomePage(webdriver); 		
//				
//		wrzutaHomePage.getHeader().wyszukaj("abcsa sd"); 					
//		
//	}
//
	@After
	public void tearDown() {
		//webdriver.quit();
	}
}
