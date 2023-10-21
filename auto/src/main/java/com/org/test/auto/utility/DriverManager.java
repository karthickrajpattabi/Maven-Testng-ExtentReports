package com.org.test.auto.utility;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	
	private static DriverManager instance= null;
	
	private WebDriver driver;
	
	private DriverManager() {
		
	}
	
	public static DriverManager getInstance() {
		if(instance == null) {
			instance = new DriverManager();
		}
		return instance;
	}
	
	public void setDriver(String browser) {
		
		
			driver = new BrowserDriver().getDriver(browser);
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void removeDriver() {
		
		if(driver != null) {
			driver.quit();
		}
		
	}

	
	
}
