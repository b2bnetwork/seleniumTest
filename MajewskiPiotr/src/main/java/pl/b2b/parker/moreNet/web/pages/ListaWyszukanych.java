package pl.b2b.parker.moreNet.web.pages;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pl.b2b.parker.moreNet.web.util.Item;
import pl.b2b.parker.moreNet.web.util.Tools;

public class ListaWyszukanych {

	WebDriver driver;
	// obiekt pomocniczy do przekazania wiekszej ilosci danych do porownania
	List<Item> listaObiektow = new ArrayList<Item>();

	@FindBy(xpath = "//*[@id='content']/div/div[2]/div[3]/div[3]/div[*]")
	List<WebElement> listaWyszukanych;

	@FindBy(linkText = "Dodaj do koszyka")
	List<WebElement> listaObiektówDodajDoKoszyka;

	public ListaWyszukanych(WebDriver driver) {
		this.driver = driver;
	}

	public List<Item> ListaZnaleznionych() {

		for (WebElement webElement : listaWyszukanych) {
			String nazwa = webElement.findElement(By.className("full-name")).getText();
			String cena = webElement.findElement(By.className("price-brutto")).getText();
			listaObiektow.add(new Item(nazwa, cena));

		}

		return listaObiektow;
	}
	
	
	
	public void DodajDoKoszyka(int numerZListy) {
		System.out.println(listaObiektówDodajDoKoszyka.size());

		System.out.println(listaObiektówDodajDoKoszyka.get(numerZListy).getTagName());
		System.out.println(listaObiektówDodajDoKoszyka.get(numerZListy).getAttribute("class"));
		
		
		Tools.clickJS(listaObiektówDodajDoKoszyka.get(numerZListy),driver);
	}
}
