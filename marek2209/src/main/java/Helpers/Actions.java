package Helpers;

import org.openqa.selenium.WebDriver;

public class Actions {
	
	public WebDriver driver;
	
	public Actions(WebDriver driver){
		this.driver = driver;
	}
	
	public void goToOtoMotoUrl(){
		driver.get("https://otomoto.pl");
	}

}
