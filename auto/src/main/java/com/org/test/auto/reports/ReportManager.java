package com.org.test.auto.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportManager {
	
	public static final ExtentReports extentReports = new ExtentReports();
    public synchronized static ExtentReports createExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
        reporter.config().setReportName("Automation Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Blog Name", "Automation Tester");
        extentReports.setSystemInfo("Author", "Karthick");
        return extentReports;
    }

}
