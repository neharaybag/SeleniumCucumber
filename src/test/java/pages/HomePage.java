package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage() {
		super();
	  driver.get(baseUrl);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css = "a.btn-login.btn")
	WebElement btnlogin;
	
	private String baseUrl = "https://www.strava.com/";
	
	public LoginPage clickOnLogin()
	{
		clickOn(btnlogin);
		return new LoginPage();
	}

}
