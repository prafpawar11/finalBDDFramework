package StepDefination;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

@Test(groups = { "LoginPage", "EndToEndTesting" })
public class LoginPageTest extends BaseClass {
	private LoginPage loginPage;

	@Given("user is on login page and open url in {string} browser")
	public void user_is_on_login_page_and_open_url_in_browser(String browsername) {
		initialization(browsername);
	}

	@When("user enter valid username and password and click on login button")
	public void user_enter_valid_username_and_password_and_click_on_login_button() {
		loginPage = new LoginPage();
		loginPage.loginFunctionality(prop.getProperty("situsername"), prop.getProperty("sitpassword"));
	}

//	@AfterTest
//	public void tearDown() {
//		// getDriver().close();
//	}

}
