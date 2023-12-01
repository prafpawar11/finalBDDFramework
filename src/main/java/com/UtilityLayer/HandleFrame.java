package com.UtilityLayer;

import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class HandleFrame extends BaseClass {

	public static void frame(String idorName) {
		getDriver().switchTo().frame(idorName);
	}

	public static void frame(WebElement wb) {
		getDriver().switchTo().frame(wb);
	}

	public static void frame(int index) {
		getDriver().switchTo().frame(index);
	}

	public static void parentFrame() {
		getDriver().switchTo().parentFrame();
	}

	public static void topFrame() {
		getDriver().switchTo().defaultContent();
	}

}
