package com.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.HomePage;

@Test(groups = { "HomePage", "EndToEndTesting" }, dependsOnGroups = { "LoginPage" })
public class HomePageTest extends BaseClass {
	HomePage homePage;

	@Test(priority = 1)
	public void validateHomePageLog() {
		homePage = new HomePage();
		Assert.assertTrue(homePage.checklogoStatus());
	}

	@Test(priority = 2)
	public void validateHomePageTitle() {
		Assert.assertEquals(homePage.getTitle(), "OrangeHRM");
	}

	@Test(priority = 3)
	public void validateHomePage() {
		Assert.assertEquals(homePage.getCurrenturl().endsWith("dashboard/index"), true);
	}

}
