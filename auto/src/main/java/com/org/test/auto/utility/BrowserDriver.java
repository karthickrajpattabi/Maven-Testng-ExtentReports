package com.org.test.auto.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriver implements IWebDriver{

	@Override
	public WebDriver getDriver(String browser) {
		WebDriver driver = null;
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			return driver;
			
			
			
		case "firefox":
			
			driver = new FirefoxDriver();
			return driver;
			

		default:
			throw new IllegalArgumentException("browser type is wrong");
			
		}
		
	}

	
	

}
