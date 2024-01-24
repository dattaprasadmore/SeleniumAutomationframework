package com.pda.tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.pda.driver.Driver;
import com.pda.reports.ExtentReport;

public class BaseTest {

	protected BaseTest() {}

	@BeforeMethod
	protected void SetUp() throws Exception {
		Driver.initDriver();
	}

	@AfterMethod
	protected void tearDown() {
		Driver.quitDriver();
	}
}