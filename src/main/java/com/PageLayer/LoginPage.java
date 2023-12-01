package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.UtilityLayer.UtilsClass;

public class LoginPage extends BaseClass {

	//1. locate the web element with the help of @FindBy annotation and we store global
	// private WebElement variables
	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement loginButton;

	// 2. initialize the Object Repository with the help of Page Factory class in
	// current class constructor and we use initElements method to initialize the local variables.

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	//3. we write associated functionality method without entering the test data.
	
	public void loginFunctionality(String uname, String pass)
	{
		UtilsClass.sendKeys(username, uname);
		UtilsClass.sendKeys(password, pass);
		UtilsClass.click(loginButton);
	}
	
	
	
}
