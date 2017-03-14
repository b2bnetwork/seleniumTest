package wrzuta.test.lib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class lib {
	public void waitForPageToLoad(int milliseconds,WebDriver driver) throws InterruptedException
	{
		Thread.sleep(150);
		for (int i = 0; i < milliseconds; i++){
			if(((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete"))
				break;			
			Thread.sleep(1);

			}}
		public void waitForPageToLoad(WebDriver driver) throws InterruptedException
		{
			Thread.sleep(150);
			for (int i = 0; i < 5000; i++){
				if(((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete"))
					break;			
				Thread.sleep(1);

				}
}}
