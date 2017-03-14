package Pages;

public class OtoMotoSearchPage {
	private WebDriver driver;
	
	public OtoMotoSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id = "select2-param571-container")
	public String manufacturerDropdownSelectorId;
	
	public void chooseManufacturer(String name){
		Select select = new Select(driver.findElement(By.xpath(manufacturerDropdownSelectorId)));
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

