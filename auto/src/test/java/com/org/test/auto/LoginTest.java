package com.org.test.auto;

import java.time.Duration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.org.test.auto.listeners.TestListener;
import com.org.test.auto.pom.LoginPage;
import com.org.test.auto.reports.ReportTestManager;
import com.org.test.auto.utility.DriverManager;

@Listeners(TestListener.class)
public class LoginTest {
	
	
	@BeforeTest
	public void SetForTest() {
		DriverManager.getInstance().setDriver("chrome");
		DriverManager.getInstance().getDriver().get("https://practicetestautomation.com/practice-test-login");
		DriverManager.getInstance().getDriver().manage().window().maximize();
		DriverManager.getInstance().getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
	}
	
	@Test
	public void loginTest() {
		ReportTestManager.startTest("Verify Valid User Login", "this test to verify user login is sucessfully");
		LoginPage lp = new LoginPage(DriverManager.getInstance().getDriver());
		lp.loginuser("student", "Password123");
		lp.isLogged();
		
	}
	
	@AfterTest
	public void RemoveForTest() {
		DriverManager.getInstance().removeDriver();
	}

}
