package com.pda.reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {

	private ExtentManager() {}
	
	static ThreadLocal<ExtentTest> extTest = new ThreadLocal<>();
	
	static ExtentTest getExtentTest() { // static access --> it can be only access within the package --> Private package
		return extTest.get();
	}
	
	static void setExtentTest(ExtentTest test) {
		extTest.set(test);
	}
	
	static void unload() {
		extTest.remove();
	}
}