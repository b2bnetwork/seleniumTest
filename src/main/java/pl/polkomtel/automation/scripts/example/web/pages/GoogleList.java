package pl.polkomtel.automation.scripts.example.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pl.polkomtel.automation.core.PageObject;

public class GoogleList extends PageObject {
    private WebDriver driver;

    public GoogleList(WebDriver driver) {
        this.driver = driver;
    }

    public void kliknijWPierwszyWynik() throws Exception {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class = '_NId'][1]//a")).click();
        Thread.sleep(5000);
    }
}
