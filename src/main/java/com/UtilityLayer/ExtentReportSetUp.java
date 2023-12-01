package com.UtilityLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseLayer.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportSetUp extends BaseClass {

	public static ExtentReports setUp(String reportname) {
		String path = System.getProperty("user.dir") + "\\ExtentReports\\" + reportname + date() + ".html";
		ExtentSparkReporter extentReporter = new ExtentSparkReporter(path);
		ExtentReports extentReports = new ExtentReports();
		extentReports.attachReporter(extentReporter);
		return extentReports;
	}

	public static String date() {
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
	}

	public static String takeScreenshot(String foldername, String screenshotname) throws IOException {
		File f = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "\\" + foldername + "\\" + screenshotname + date() + ".png";
		FileUtils.copyFile(f, new File(path));
		return path;
	}

}
