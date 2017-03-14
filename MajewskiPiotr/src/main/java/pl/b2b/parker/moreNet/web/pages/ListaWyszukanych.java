package pl.b2b.parker.moreNet.web.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

	public List<Item> listaZnaleznionych() {
		int i = 1;
		for (WebElement webElement : listaWyszukanych) {
			String nazwa = webElement
					.findElement(By.xpath(
							"//*[@id='content']/div/div[2]/div[3]/div[3]/div[" + i + "]/div[2]/div[1]/div[1]/div[2]/a"))
					.getText();
			i++;
			String cena = webElement.findElement(By.className("price-brutto")).getText();
			listaObiektow.add(new Item(nazwa, cena));

		}

		return listaObiektow;
	}

	public void DodajDoKoszyka(int numerZListy) {

		Tools.clickJS(listaObiektówDodajDoKoszyka.get(numerZListy), driver);
	}
}
