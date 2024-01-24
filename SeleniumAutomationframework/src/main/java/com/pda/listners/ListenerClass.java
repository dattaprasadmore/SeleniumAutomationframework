package com.pda.listners;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.pda.reports.ExtentLogger;
import com.pda.reports.ExtentReport;

public class ListenerClass implements ITestListener, ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		ExtentReport.initReport();
	}

	@Override
	public void onFinish(ISuite suite) {
		try {
			ExtentReport.flushReports();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentLogger.pass(result.getMethod().getMethodName() + "is passed ");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ExtentLogger.fail(result.getMethod().getMethodName() + "is failed ");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentLogger.skip(result.getMethod().getMethodName() + "is skipped ");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		ITestListener.super.onFinish(context);
	}

	
	
}
