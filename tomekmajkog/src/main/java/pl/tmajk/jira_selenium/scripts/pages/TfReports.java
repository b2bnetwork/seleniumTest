package pl.tmajk.jira_selenium.scripts.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pl.tmajk.jira_selenium.core.PageObject;

public class TfReports extends PageObject{
	private WebDriver driver;
	
	public TfReports(WebDriver driver){
		this.driver = driver;
	}
	
	//za parametr 'Success' lub 'Fail'
	public List<WebElement> getReportsList(String reportStatus){
				
		By query = By.className("v-table-row-testReport" + reportStatus + "Row");
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(query)));
        
		return driver.findElements(query);
	}

}