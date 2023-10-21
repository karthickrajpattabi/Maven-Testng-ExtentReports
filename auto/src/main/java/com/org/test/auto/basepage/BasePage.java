package com.org.test.auto.basepage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	private WebDriverWait  webdriverwait;
	
	private WebDriver driver;
	
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.webdriverwait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	
	public WebElement getElement(By ele) {
		
		return webdriverwait.until(ExpectedConditions.presenceOfElementLocated(ele));
		
	}
	

}
