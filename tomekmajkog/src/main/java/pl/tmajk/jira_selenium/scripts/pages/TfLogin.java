package pl.tmajk.jira_selenium.scripts.pages;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pl.tmajk.jira_selenium.core.PageObject;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;


public class TfLogin extends PageObject{
	
public TFNavBar b2bJiraNavBar;
		
	public TfLogin(WebDriver driver) {
		b2bJiraNavBar = new TFNavBar(driver);
		driver.get("http://gate.eccapital.pl:8080/testFactory-1.1-SNAPSHOT");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
	}
	
	public TFNavBar getNavBar() {
		return b2bJiraNavBar;
	}
	
	public Boolean logIn() throws Exception{
		getNavBar().inputTextInField("gwt-uid-5", "admin");
		getNavBar().inputTextInField("gwt-uid-7", "12345678");
		getNavBar().navigateToMenuElementByClassName("v-button-caption");
		return true;
	}
	
}
