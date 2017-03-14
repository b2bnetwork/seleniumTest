package pl.b2b.parker.moreNet.web.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import pl.b2b.parker.moreNet.web.pages.GlownaMoreleNet;
import pl.b2b.parker.moreNet.web.pages.ListaWyszukanych;
import pl.b2b.parker.moreNet.web.util.Item;

public class WyszukajProdukt_Test {
	WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\DevTools\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.morele.net");
	}
	@Test
	public void WyszukajItem() {
		GlownaMoreleNet glownaStrona = PageFactory.initElements(driver, GlownaMoreleNet.class);
		glownaStrona.wpiszSzukanyProdukt("Lenovo");
		glownaStrona.kliknijLupe();
		ListaWyszukanych lista = PageFactory.initElements(driver, ListaWyszukanych.class);

		List<Item> znaleziono = lista.listaZnaleznionych();
	
		Assert.assertTrue(znaleziono.size() > 0);
	}
	@Test
	public void WybierzItem() throws InterruptedException {
		GlownaMoreleNet glownaStrona = PageFactory.initElements(driver, GlownaMoreleNet.class);
		glownaStrona.wpiszSzukanyProdukt("Lenovo");
		glownaStrona.kliknijLupe();
		ListaWyszukanych lista = PageFactory.initElements(driver, ListaWyszukanych.class);
		lista.DodajDoKoszyka(3);
		
		Thread.sleep(2000);
		String expectedURL = "https://www.morele.net/koszyk/";
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, URL);
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
