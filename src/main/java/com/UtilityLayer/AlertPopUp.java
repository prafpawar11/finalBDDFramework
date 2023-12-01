package com.UtilityLayer;

import com.BaseLayer.BaseClass;

public class AlertPopUp extends BaseClass {

	public static void clickOnOkButton() {
		getDriver().switchTo().alert().accept();
	}

	public static void clickOnCancelButton() {
		getDriver().switchTo().alert().dismiss();
	}

	public static String captureText() {
		return getDriver().switchTo().alert().getText();
	}

	public static void sendKeys(String value) {
		getDriver().switchTo().alert().sendKeys(value);
	}

	public static String captureValueAndClickOnOkButton() {
		String value = getDriver().switchTo().alert().getText();
		getDriver().switchTo().alert().accept();
		return value;
	}

	public static String captureValueAndClickOnCancelButton() {
		String value = getDriver().switchTo().alert().getText();
		getDriver().switchTo().alert().dismiss();
		return value;
	}

	public static void EnterValueAndClickOnOkButton(String value) {
		getDriver().switchTo().alert().sendKeys(value);
		getDriver().switchTo().alert().accept();
	}

	public static void EnterValueAndClickOnCancelButton(String value) {
		getDriver().switchTo().alert().sendKeys(value);
		getDriver().switchTo().alert().dismiss();

	}

}
