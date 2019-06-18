package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	protected LoginPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "email")
	WebElement txtUserName;

	@FindBy(id = "password")
	WebElement txtPassword;

	@FindBy(id = "login-button")
	WebElement btnLogin;

	/***
	 * 
	 * @param username
	 */
	public void enterUserName(String username) {
		enterText(txtUserName, username);
	}

	/***
	 * 
	 * @param password
	 */
	public void enterPassword(String password) {
		enterText(txtPassword, password);
	}

	/***
	 * 
	 */
	public OnBoardingPage clickOnLogin() {
		clickOn(btnLogin);
		return new OnBoardingPage();
	}

}
