package com.pda.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pda.driver.Driver;

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
