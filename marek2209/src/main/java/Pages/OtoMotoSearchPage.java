package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OtoMotoSearchPage {
	private WebDriver driver;
	
	public OtoMotoSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id = "select2-param571-container")
	public WebElement manufacturerDropdownSelectorId;

	@FindBy(id = "select2-7ytp-container")
	public WebElement priceFromId;
	
	@FindBy(id = "select2-th7y-container")
	public WebElement priceToId;

	
	public void chooseManufacturer(String name){		
		
		manufacturerDropdownSelectorId.click();
	   WebElement xpath = driver.findElement(By.xpath(".//*[@id='select2-param571-result-af71-audi']"));
	   xpath.click();
	}
	
	public void chooseModel(String model){
		
	}
	
	public void choosePrice(String fromPrice,String toPrice){
		
		priceFromId.click();
		priceFromId.sendKeys(toPrice);
		
		
	}
	
	public void chooseYear(int fromYear, int toYear){
		
	}
	
	public void chooseFuelType(){
		
	}
	
	public void clickSearch(){
		
	}
}

