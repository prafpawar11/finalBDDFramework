package StepDefination;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.HomePage;

import io.cucumber.java.en.Then;

@Test(groups = { "HomePage", "EndToEndTesting" }, dependsOnGroups = { "LoginPage" })
public class HomePageTest extends BaseClass {
	static HomePage homePage;

	@Then("user validate home page logo")
	public void user_validate_home_page_logo() {
		homePage = new HomePage();
		Assert.assertTrue(homePage.checklogoStatus());
	}

	@Then("user validate home page title")
	public void user_validate_home_page_title() {
		Assert.assertEquals(homePage.getTitle(), "OrangeHRM");
	}

	@Then("user validate home page url")
	public void user_validate_home_page_url() {
		Assert.assertEquals(homePage.getCurrenturl().endsWith("dashboard/index"), true);
	}

}
