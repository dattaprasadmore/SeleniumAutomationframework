package com.pda.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.pda.driver.Driver;
import com.pda.reports.ExtentReport;

public class BaseTest {

	protected BaseTest() {}
	
	@BeforeSuite
	public void beforeSuite() {
		ExtentReport.initReport();
	}
	
	@AfterSuite
	public void afterSuite() throws IOException{
		ExtentReport.flushReports();
	}

	@BeforeMethod
	protected void SetUp() throws Exception {
		Driver.initDriver();
	}

	@AfterMethod
	protected void tearDown() {
		Driver.quitDriver();
	}
}