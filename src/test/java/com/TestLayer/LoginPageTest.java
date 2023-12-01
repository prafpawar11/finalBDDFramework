package com.TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;

@Test(groups = { "LoginPage", "EndToEndTesting" })
public class LoginPageTest extends BaseClass {
	private LoginPage loginPage;

	@Parameters({ "browsername" })
	@BeforeTest
	public void setUp(String browsername) {
		initialization(browsername);
	}

	@Test(priority = 1)
	public void validateLoginFunctionality() {
		loginPage = new LoginPage();
		loginPage.loginFunctionality(prop.getProperty("situsername"), prop.getProperty("sitpassword"));
	}

	@AfterTest
	public void tearDown() {
		// getDriver().close();
	}

}
