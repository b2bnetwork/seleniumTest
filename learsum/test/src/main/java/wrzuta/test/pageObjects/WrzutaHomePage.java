package wrzuta.test.pageObjects;

import org.openqa.selenium.WebDriver;
import wrzuta.test.lib.lib;


public class WrzutaHomePage extends lib{
public WrzutaHeader wrzutaHeader;
	
	public WrzutaHomePage(WebDriver driver) throws InterruptedException {
		wrzutaHeader = new WrzutaHeader(driver);
		driver.get("http://wrzuta.pl");
		
		driver.manage().window().maximize();
      //  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		waitForPageToLoad(1000, driver);
	}
	
	public WrzutaHeader getHeader() {
		return wrzutaHeader;
	}

}
