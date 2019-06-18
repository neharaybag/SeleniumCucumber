package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps extends DriverFactory {
	
	HomePage homePage;
	LoginPage loginPage;
	
	
	@Given("User navigates to Strava")
	public void user_navigates_to_Strava() {
	    // Write code here that turns the phrase above into concrete actions
	    homePage = new HomePage();
	}

	@Given("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		loginPage = homePage.clickOnLogin();
	}

	@Given("user enters username as {string}")
	public void user_enters_correct_username(String username) {
	    // Write code here that turns the phrase above into concrete actions
	    loginPage.enterUserName(username);
	}

	@Given("user enters password as {string}")
	public void user_enters_correct_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
	    loginPage.enterPassword(password);
	}

	@When("user login to strava")
	public void user_login_to_strava() {
	    // Write code here that turns the phrase above into concrete actions
	    loginPage.clickOnLogin();
	}

	@Then("user should be naviageted to home page")
	public void user_should_be_naviageted_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
