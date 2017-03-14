package pl.tmajk.jira_selenium.scripts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pl.tmajk.jira_selenium.core.PageObject;

public class TfRequrements extends PageObject{
	private WebDriver driver;
	
	public TfRequrements(WebDriver driver){
		this.driver = driver;
	}
	
	/*Menu item names:
	 * Nowe wymagania,
	 */
	//"//div[@class = 'v-button v-widget borderless v-button-borderless menuButton v-button-menuButton']//span[@class = 'v-button-caption' and text()='']"
	public void clickMenuItemByName(String buttoCaptionName) throws Exception{
		By buttonCaption = By.xpath("//div[@class = 'v-button v-widget borderless v-button-borderless menuButton v-button-menuButton']//span[@class = 'v-button-caption' and text()='" + buttoCaptionName + "']");
		WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(buttonCaption)));
		WebElement buttonClick = driver.findElement(buttonCaption);
        buttonClick.click();
        Thread.sleep(250);
	}
	
}
