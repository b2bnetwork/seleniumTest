package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OtoMotoSearchPage {
	private WebDriver driver;
	
	public OtoMotoSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id = "select2-param571-container")
	public String manufacturerDropdownSelectorId;
	
	public void chooseManufacturer(String name){
		Select select = new Select(driver.findElement(By.id(manufacturerDropdownSelectorId)));
		select.selectByVisibleText(name);
	}
	
	public void chooseModel(String model){
		
	}
	
	public void choosePrice(int fromPrice, int toPrice){
		
	}
	
	public void chooseYear(int fromYear, int toYear){
		
	}
	
	public void chooseFuelType(){
		
	}
	
	public void clickSearch(){
		
	}
}

