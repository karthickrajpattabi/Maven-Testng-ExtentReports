package com.org.test.auto.BaseTest;

import org.testng.annotations.BeforeSuite;

import com.org.test.auto.utility.DriverManager;

public class BaseTest {
	
	@BeforeSuite
	public void setWebDriver() {
		DriverManager.getInstance().setDriver("chrome");
	}

}
