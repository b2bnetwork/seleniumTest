package pl.polkomtel.automation.scripts.example.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pl.polkomtel.automation.core.PageObject;

public class GoogleMain extends PageObject {
    private WebDriver driver;

    public GoogleMain(WebDriver driver) {
        this.driver = driver;
        driver.get("http://www.google.com/");
    }

    public void wpiszTekstWPoleSzukaj(String fraza) {
        driver.findElement(By.name("q")).sendKeys(fraza);
    }

    public void kliknijPrzyciskSzukaj() {
        driver.findElement(By.name("btnG")).click();
    }

}


