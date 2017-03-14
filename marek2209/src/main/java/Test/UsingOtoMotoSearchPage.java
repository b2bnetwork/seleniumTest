package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class UsingOtoMotoSearchPage {
	
	public WebDriver driver;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.gecko.driver","C:/Users/b2bnet/Downloads/geckodriver.exe");
        driver = new FirefoxDriver();

	}
	
	@Test
	public void dupa(){
		System.out.println("asdasd");
	}
	

}