package pl.tmajk.jira_selenium.scripts.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TfMain {
private WebDriver driver;
private TFNavBar b2bJiraNavBar;	
	public TfMain(WebDriver driver){
		this.driver = driver;
		b2bJiraNavBar = new TFNavBar(driver);
	}
	public TFNavBar getNavBar() {
		return b2bJiraNavBar;
	}
	
	public void goToReports() throws Exception{
		driver.get("http://gate.eccapital.pl:8080/testFactory-1.1-SNAPSHOT/#!CHOOSE_REPORT");
	}


}
