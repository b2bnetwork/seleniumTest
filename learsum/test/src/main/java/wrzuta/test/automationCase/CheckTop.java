package wrzuta.test.automationCase;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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
		wrzutaHomePage.getHeader().podajTytułyZTop(15);
		
		
		Assert.assertTrue(((JavascriptExecutor)webdriver).executeScript("return document.readyState").equals("complete"));
		
		
	}

	@Test
	public void findMultimediaOnSite()throws Exception {
		
		WrzutaHomePage wrzutaHomePage = new WrzutaHomePage(webdriver); 		
				
		wrzutaHomePage.getHeader().wyszukaj("abcsa sd"); 					
		Assert.assertTrue(((JavascriptExecutor)webdriver).executeScript("return document.readyState").equals("complete"));
	
	}

	@After
	public void tearDown() {
		//webdriver.quit();
	}
}
