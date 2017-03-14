package pl.tmajk.jira_selenium.scripts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pl.tmajk.jira_selenium.core.PageObject;

public class TFNavBar extends PageObject {
	WebDriver driver;
	
	public TFNavBar(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToIssues() throws Exception{

		navigateToMenuElementById("logo");

	}
	
	
	public void logOut() throws Exception{

		navigateToMenuElementById("header-details-user-fullname");
		navigateToMenuElementById("log_out");
		
	}
	
	public void navigateToMenuElementById(String menuElementId) throws Exception{
	
		By menuElement = new By.ById(menuElementId);
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(menuElement)));
		
        WebElement jiraMenuElement = driver.findElement(menuElement);
        
        jiraMenuElement.click();
        
        Thread.sleep(250);        
	
	}
	
	public void navigateToMenuElementByClassName(String menuElementClassName) throws Exception{
	
		By menuElement = new By.ByClassName(menuElementClassName);
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(menuElement)));
		
        WebElement jiraMenuElement = driver.findElement(menuElement);
        
        jiraMenuElement.click();
        
        Thread.sleep(250);        
	
	}

	public void inputTextInField(String fieldIdName, String inputText) throws Exception{
		By fielId = By.id(fieldIdName);
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(fielId)));
		
        WebElement formField = driver.findElement(fielId);
        
        formField.sendKeys(inputText);
        
        Thread.sleep(250);
	}
	
}
