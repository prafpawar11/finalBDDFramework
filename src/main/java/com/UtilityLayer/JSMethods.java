package com.UtilityLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class JSMethods extends BaseClass {

	public static void click(WebElement wb) {
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", wb);
	}

	public static void sendKeys(WebElement wb, String value) {
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].value='" + value + "';", wb);
	}

	public static void alertPop(String popUp) {
		((JavascriptExecutor) getDriver()).executeScript("alert('" + popUp + "');");
	}

	public static void confirmPop(String popUp) {
		((JavascriptExecutor) getDriver()).executeScript("confirm('" + popUp + "');");
	}

	public static void promptPop(String popUp) {
		((JavascriptExecutor) getDriver()).executeScript("prompt('" + popUp + "');");
	}

	public static void openUrl(String url) {
		((JavascriptExecutor) getDriver()).executeScript("window.location='" + url + "'");
	}

	public static void openTabAndUrl(String url) {
		((JavascriptExecutor) getDriver()).executeScript("window.open('" + url + "');");
	}

	public static void refresh() {
		((JavascriptExecutor) getDriver()).executeScript("history.go(0);");
	}

	public static void forward(String Stepforward) {
		((JavascriptExecutor) getDriver()).executeScript("history.go(+" + Stepforward + ");");
	}

	public static void backward(String Stepback) {
		((JavascriptExecutor) getDriver()).executeScript("history.go(-" + Stepback + ");");
	}

	public static String getTitle() {
		return ((JavascriptExecutor) getDriver()).executeScript("return document.title").toString();
	}

	public static String geturl() {
		return ((JavascriptExecutor) getDriver()).executeScript("return document.URL").toString();
	}

	public static void scrollDownToElement(WebElement wb) {
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", wb);
	}

}
