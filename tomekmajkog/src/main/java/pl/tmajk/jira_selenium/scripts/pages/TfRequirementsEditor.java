package pl.tmajk.jira_selenium.scripts.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pl.tmajk.jira_selenium.core.PageObject;

public class TfRequirementsEditor extends PageObject {
	private WebDriver driver;
	private TFNavBar tfNavbar;
	
	public TfRequirementsEditor(WebDriver driver){
		this.driver = driver;
		tfNavbar = new TFNavBar(driver);
	}
	
	public TFNavBar getNavBar(){
		return tfNavbar;
	}
	
	//gwt-uid-12 - nazwa
	//gwt-uid-22 status - Szkic
	//gwt-uid-24 - typ - Informacja
	public void inputRequirementName(String requirementName) throws Exception{
		tfNavbar.inputTextInField("gwt-uid-12", requirementName);
	}
	
	public void inputRequirementStatus(String requirementStatus) throws Exception{
		tfNavbar.inputTextInField("gwt-uid-22", requirementStatus);
	}
	
	public void inputRequirementType(String requirementType) throws Exception{
		tfNavbar.inputTextInField("gwt-uid-24", requirementType);
	}
	
	public void clickSaveRequirementButton() throws Exception{
		By buttonCaption = By.xpath("//div[@class = 'v-button v-widget requirementsEditorButton v-button-requirementsEditorButton']//span[@class = 'v-button-caption' and text()='Zapisz']");
		WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(buttonCaption)));
		WebElement buttonClick = driver.findElement(buttonCaption);
        buttonClick.click();
        Thread.sleep(250);
	}

	public List<WebElement> findReuqiredFormFields(){
		By query = By.xpath("//div[@class = 'v-widget v-has-caption v-caption-on-top v-has-width']//input");
		WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(query)));
		return driver.findElements(query);
	}
	
}
