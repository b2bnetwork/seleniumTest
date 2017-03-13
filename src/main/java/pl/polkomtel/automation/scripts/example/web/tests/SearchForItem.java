package pl.polkomtel.automation.scripts.example.web.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import pl.polkomtel.automation.core.Dict;
import pl.polkomtel.automation.core.TestFactory;
import pl.polkomtel.automation.scripts.example.web.pages.GoogleList;
import pl.polkomtel.automation.scripts.example.web.pages.GoogleMain;

public class SearchForItem {
    private WebDriver driver;
    private GoogleMain googleMain;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\target\\classes\\geckodriver.exe");
        driver = new FirefoxDriver();
        googleMain = new GoogleMain(driver);
    }

    @Test
    @TestFactory(value = "Szukaj w google", description = "Test wyszukujący podaną w argumencie frazę i klika w pierwszy wynik")
    @Parameters("fraza")
    public void kliknijWPierwszyWynikWyszukiwaniaDlaPodanejFrazy(@Dict({"Vip", "Witaj"}) String fraza) throws Exception {
        googleMain.wpiszTekstWPoleSzukaj(fraza);
        googleMain.kliknijPrzyciskSzukaj();
        GoogleList googleList = new GoogleList(driver);
        googleList.kliknijWPierwszyWynik();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}


