package com.org.test.auto.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.org.test.auto.basepage.BasePage;

public class LoginPage extends BasePage{
	
	
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
	}
	
	By user = By.xpath("//input[@id='username']");
	By pass = By.xpath("//input[@id='password']");
	By submitbutton = By.xpath("//button[@id='submit']");
	
	public void loginuser(String username,String password) {
		getElement(user).sendKeys(username);
		getElement(pass).sendKeys(password);
		getElement(submitbutton).click();
	}
	
	public void isLogged() {
		Assert.assertEquals(getElement(By.xpath("//h1[@class='post-title']")).getText().trim(), "Logged In Successfully", "Wrong Message");
	}
	
	
	

}	

