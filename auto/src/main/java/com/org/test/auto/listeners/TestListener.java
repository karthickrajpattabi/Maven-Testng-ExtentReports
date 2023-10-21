package com.org.test.auto.listeners;

import java.util.Objects;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.org.test.auto.reports.ReportManager;
import com.org.test.auto.reports.ReportTestManager;
import com.org.test.auto.utility.DriverManager;

public class TestListener implements ITestListener{
	
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}
	
    @Override
    public void onFinish(ITestContext context) {
    	// TODO Auto-generated method stub
    	ReportManager.extentReports.flush();
    }
    
    
    @Override
    public void onTestFailure(ITestResult result) {
    	// TODO Auto-generated method stub
    	WebDriver driver = DriverManager.getInstance().getDriver();
        //Take base64Screenshot screenshot for extent reports
        String base64Screenshot =
            "data:image/png;base64," + ((TakesScreenshot) Objects.requireNonNull(driver)).getScreenshotAs(OutputType.BASE64);
        //ExtentReports log and screenshot operations for failed tests.
        ReportTestManager.getTest().log(Status.FAIL, "Test Failed",
        		ReportTestManager.getTest().addScreenCaptureFromBase64String(base64Screenshot).getModel().getMedia().get(0));
        //Do tier down operations for ExtentReports reporting!
        
    }
    
    @Override
    public void onTestSuccess(ITestResult result) {
    	// TODO Auto-generated method stub
    	ReportTestManager.getTest().log(Status.PASS, "Test passed");
    }

}
