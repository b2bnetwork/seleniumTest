package pl.b2b.example.scripts.web.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import pl.b2b.example.core.PageObject;

public class AllegroMain extends PageObject {
	public AllegroHeader allegroHeader;
	
	public AllegroMain(WebDriver driver) {
		allegroHeader = new AllegroHeader(driver);
		driver.get("https://allegro.pl");
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public AllegroHeader getHeader() {
		return allegroHeader;
	}

}
