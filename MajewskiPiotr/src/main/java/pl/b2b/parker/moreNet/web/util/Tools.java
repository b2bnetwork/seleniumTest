package pl.b2b.parker.moreNet.web.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tools {
	
	public static void clickJS(WebElement element, WebDriver driver) {
	       
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	   }
}
