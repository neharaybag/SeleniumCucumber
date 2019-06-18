package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnBoardingPage extends BasePage{
	
	public OnBoardingPage() {
		super();
	 
	}
	
	@FindBy(linkText = "Dashboard")
	WebElement lnkDashboard;
	
	public boolean verifyDhashboard()
	{
		return isElementDisplayed(lnkDashboard);
	}

}
