package com.UtilityLayer;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.BaseLayer.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenersSetUp extends BaseClass implements ITestListener {

	ExtentReports extentReports;
	ExtentTest extentTest;

	@Override
	public void onStart(ITestContext context) {
		extentReports = ExtentReportSetUp.setUp(context.getSuite().getName());

	}

	@Override
	public void onTestStart(ITestResult result) {
		extentTest = extentReports.createTest("Test Cases started is " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, "Test cases Pass is " + result.getMethod().getMethodName());

		try {
			extentTest.addScreenCaptureFromPath(
					ExtentReportSetUp.takeScreenshot("PassScreenshot", result.getMethod().getMethodName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.log(Status.FAIL, "Test Case Fail is " + result.getMethod().getMethodName());

		try {
			extentTest.addScreenCaptureFromPath(
					ExtentReportSetUp.takeScreenshot("FailScreemshot", result.getMethod().getMethodName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.SKIP, "Test cases skip is " + result.getMethod().getMethodName());
	}

	@Override
	public void onFinish(ITestContext context) {
		extentReports.flush();
	}

}
