package com.UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {

	public static void selectByVisibleText(WebElement wb, String value) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			new Select(wb).selectByVisibleText(value);
		}
	}

	public static void selectByValue(WebElement wb, String value) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			new Select(wb).selectByValue(value);
		}
	}

	public static void selectByIndex(WebElement wb, int index) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			new Select(wb).selectByIndex(index);
		}
	}

	public static String selectByVisibleTextAndCaptureSelectedValue(WebElement wb, String value) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			new Select(wb).selectByVisibleText(value);
		}

		return new Select(wb).getFirstSelectedOption().getText();
	}

	public static String selectByValueAndCaptureSelectedValue(WebElement wb, String value) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			new Select(wb).selectByValue(value);
		}

		return new Select(wb).getFirstSelectedOption().getText();
	}

	public static String selectByIndexAndCaptureSelectedValue(WebElement wb, int index) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			new Select(wb).selectByIndex(index);
		}

		return new Select(wb).getFirstSelectedOption().getText();
	}

	public static void verifySpecificValueIsPresentOrnot(WebElement wb, String value) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			List<WebElement> ls = new Select(wb).getOptions();
			for (WebElement abc : ls) {
				if (abc.getText().equalsIgnoreCase(value)) {
					System.out.println(value + "is Present");
				} else {
					System.err.println(value + "is not Present");
				}
			}
		}
	}

	public static void printAllValue(WebElement wb) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			List<WebElement> ls = new Select(wb).getOptions();

			for (WebElement abc : ls) {
				System.out.println(abc.getText());
			}
		}
	}

	public static void selectValue(List<WebElement> ls, String value) {

		for (WebElement abc : ls) {
			if (abc.getText().equalsIgnoreCase(value)) {
				abc.click();
				break;
			}
		}
	}

}
