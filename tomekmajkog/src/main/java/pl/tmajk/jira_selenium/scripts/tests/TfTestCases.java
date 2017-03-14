package pl.tmajk.jira_selenium.scripts.tests;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pl.tmajk.jira_selenium.scripts.pages.TfLogin;
import pl.tmajk.jira_selenium.scripts.pages.TfMain;
import pl.tmajk.jira_selenium.scripts.pages.TfReports;


public class TfTestCases {
	private WebDriver driver;
	@BeforeMethod
	
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver", "/home/tomek/b2bnet/SELENIUM_practice/geckodriver");
		driver = new FirefoxDriver();
		
	}
	
	@Test
	public void jiraLoginTest() throws Exception {
		TfLogin jiraLogin = new TfLogin(driver);
		Assert.assertTrue(jiraLogin.logIn());
		System.out.println("Login Poprawny :)");
		
		Thread.sleep(3000);
	}
	
	@Test
	public void tfReportsListPassed() throws Exception {
		TfLogin jiraLogin = new TfLogin(driver);
		Assert.assertTrue(jiraLogin.logIn());
		System.out.println("Login Poprawny :)");

		Thread.sleep(3000);
		
		TfMain tfMain = new TfMain(driver);
		tfMain.goToReports();
		
		TfReports tfReports = new TfReports(driver);
		List<WebElement> testReportList = tfReports.getPassedReportsList();
		
		Integer howManyPassed = 0;
		for (WebElement testReport : testReportList){
			System.out.println(testReport.getText());
			++howManyPassed;
		}
		System.out.println("Znaleziono " + howManyPassed + " raportów w statusie Pozytywny.");
		
		Assert.assertTrue(howManyPassed > 0);
	}
		
	@AfterMethod
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
