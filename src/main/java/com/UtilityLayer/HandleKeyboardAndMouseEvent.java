package com.UtilityLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseLayer.BaseClass;

public class HandleKeyboardAndMouseEvent extends BaseClass {

	public static void click(WebElement wb) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			new Actions(getDriver()).click(wb).build().perform();
		}
	}

	public static void sendKeys(WebElement wb, String value) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			new Actions(getDriver()).sendKeys(wb, value).build().perform();
		}
	}

	public static void doubleClick(WebElement wb) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			new Actions(getDriver()).doubleClick(wb).build().perform();
		}
	}

	public static void rightClick(WebElement wb) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			new Actions(getDriver()).contextClick(wb).build().perform();
		}
	}

	public static void mouseOverOnElement(WebElement wb) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			new Actions(getDriver()).moveToElement(wb).build().perform();
		}
	}

	public static void EnterUpperCaseLetter(WebElement wb, String value) {
		if (wb.isDisplayed() && wb.isEnabled()) {

			Actions act = new Actions(getDriver());
			// act.keyUp(org.openqa.selenium.Keys.SHIFT)
			act.keyDown(Keys.SHIFT).sendKeys(wb, value).keyUp(org.openqa.selenium.Keys.SHIFT).build().perform();
		}
	}

	public static void dragAndDrop(WebElement src, WebElement trg) {
		if (src.isDisplayed() && src.isEnabled()) {
			if (trg.isDisplayed() && trg.isEnabled()) {
				new Actions(getDriver()).dragAndDrop(src, trg).build().perform();

			}
		}
	}

	public static void clickAndHold(WebElement wb)
	{
		if (wb.isDisplayed() && wb.isEnabled()) {
			new Actions(getDriver()).clickAndHold(wb).build().perform();
		}
	}
	
	public static void release(WebElement wb)
	{
		if (wb.isDisplayed() && wb.isEnabled()) {
			new Actions(getDriver()).release(wb).build().perform();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
