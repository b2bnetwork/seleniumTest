package pl.tmajk.jira_selenium.scripts.tests;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
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
		List<WebElement> testReportList = tfReports.getReportsList("Success");
		Integer howManyPassed = howManyReports(testReportList);
		Assert.assertTrue(howManyPassed > 0);
		System.out.println("Znaleziono " + howManyPassed + "raportów pozytywnych.");
		
	}
	
	@Test
	public void tfReportsListFailed() throws Exception {
		TfLogin jiraLogin = new TfLogin(driver);
		Assert.assertTrue(jiraLogin.logIn());
		System.out.println("Login Poprawny :)");

		Thread.sleep(3000);
		TfMain tfMain = new TfMain(driver);
		tfMain.goToReports();
		
		TfReports tfReports = new TfReports(driver);
		List<WebElement> testReportList = tfReports.getReportsList("Fail");
		Integer howManyFailed = howManyReports(testReportList);
		Assert.assertTrue(howManyFailed > 0);
		System.out.println("Znaleziono " + howManyFailed + "raportów negatywnych.");
		
	}
	
	
	private Integer howManyReports(List<WebElement> reportList){
		Integer howMany = 0;
		for (WebElement testReport : reportList){
			System.out.println(testReport.getText());
			++howMany;
		}
		return howMany;
	}
	
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
