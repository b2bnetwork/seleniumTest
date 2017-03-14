package pl.tmajk.jira_selenium.scripts.pages;


import org.openqa.selenium.WebDriver;

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