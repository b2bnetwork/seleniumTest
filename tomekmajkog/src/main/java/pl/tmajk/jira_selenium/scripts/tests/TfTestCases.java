package pl.tmajk.jira_selenium.scripts.tests;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Keys;
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
import pl.tmajk.jira_selenium.scripts.pages.TfRequirementsEditor;
import pl.tmajk.jira_selenium.scripts.pages.TfRequrements;


public class TfTestCases {
	private WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "/home/tomek/b2bnet/SELENIUM_practice/geckodriver");
		driver = new FirefoxDriver();
	}
	/*
	@Test
	public void jiraLoginTest() throws Exception {
		logIntoTFAdmin();
		Thread.sleep(3000);
		
	}
	
	@Test
	public void tfReportsListPassed() throws Exception {
		logIntoTFAdmin();
		Thread.sleep(3000);
		
		mainScreenGoToModule("CHOOSE_REPORT");
		
		TfReports tfReports = new TfReports(driver);
		List<WebElement> testReportList = tfReports.getReportsList("Success");
		Integer howManyPassed = howManyReports(testReportList);
		Assert.assertTrue(howManyPassed > 0);
		System.out.println("Znaleziono " + howManyPassed + "raportów pozytywnych.");
		
	}
	
	@Test
	public void tfReportsListFailed() throws Exception {
		logIntoTFAdmin();
		Thread.sleep(3000);

		mainScreenGoToModule("CHOOSE_REPORT");
		
		TfReports tfReports = new TfReports(driver);
		List<WebElement> testReportList = tfReports.getReportsList("Fail");
		Integer howManyFailed = howManyReports(testReportList);
		Assert.assertTrue(howManyFailed > 0);
		System.out.println("Znaleziono " + howManyFailed + "raportów negatywnych.");
		
	}
	*/
	@Test
	public void addNewRequirement() throws Exception{
		logIntoTFAdmin();
		Thread.sleep(3000);
		
		mainScreenGoToModule("REQUIREMENTS");
		Thread.sleep(3000);
		
		TfRequrements tfRequrements = new TfRequrements(driver);
		tfRequrements.clickMenuItemByName("Nowe wymagania");
		Thread.sleep(3000);
		
		TfRequirementsEditor editor = new TfRequirementsEditor(driver);
		List<WebElement> formFields = editor.findReuqiredFormFields();
		Integer i = 1;
		for (WebElement field : formFields){
			System.out.println(field.getTagName());
			if(i==1){
			field.sendKeys("testttt");
			Thread.sleep(1500);
			}
			else if (i==2){
				field.click();
				field.sendKeys("Szkic");
				Thread.sleep(1000);
				field.sendKeys(Keys.TAB);
				Thread.sleep(1000);
			}
			else{
				field.click();
				field.sendKeys("Informacja");
				Thread.sleep(1000);
				field.sendKeys(Keys.TAB);
				Thread.sleep(1000);
			}
			++i;
		}
		
		// dodac weryfikacje czy nowy test pojawia sie w tabeli
		editor.clickSaveRequirementButton();
		Thread.sleep(3000);
	}
		
	private Integer howManyReports(List<WebElement> reportList){
		Integer howMany = 0;
		for (WebElement testReport : reportList){
			System.out.println(testReport.getText());
			++howMany;
		}
		return howMany;
	}
	
	private void logIntoTFAdmin() throws Exception{
		TfLogin jiraLogin = new TfLogin(driver);
		Assert.assertTrue(jiraLogin.logIn());
		System.out.println("Login Poprawny :)");
	}
	
	private void mainScreenGoToModule(String moduleName) throws Exception{
		TfMain tfMain = new TfMain(driver);
		tfMain.goToModule(moduleName);
	}
	
	
	
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
