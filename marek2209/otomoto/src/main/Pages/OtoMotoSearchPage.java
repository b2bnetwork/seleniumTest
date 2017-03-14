package marek2209.selenium.otomoto;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;

public class OtoMotoSearchPage {
	
	
	@FindBy(id = "select2-param571-container")
	private WebElement manufacturerDropdownSelectorId;
	
	public void chooseManufacturer(string name){
		Select select = new Select(driver.findElement(By.xpath(manufacturerDropdownSelectorId)));
		
		select.selectByVisibleText(name);
	}
	
	public void chooseModel(string model){
		
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
