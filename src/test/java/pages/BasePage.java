package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DriverFactory;

public abstract class BasePage {
	
	protected WebDriver driver;
	
    public BasePage()
    {
    	this.driver = new DriverFactory().getDriver();
    	PageFactory.initElements(driver, this);
    }
	
    
    /***
     * 
     * @param element
     */
	public void clickOn(WebElement element)
	{
		waitUntilElementClickable(element, 10);
		element.click();;
	}
	
	
	public void enterText(WebElement element, String text)
	{
		waitUntilElementVisible(element, 10);
		element.sendKeys(text);
	}
	
	/***
	 * 
	 * @param locator
	 * @return
	 */
	public WebElement findElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	
	/**
	 * 
	 * @param element
	 * @param maxWaitTimeInSeconds
	 */
	protected void waitUntilElementClickable(WebElement element, int maxWaitTimeInSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, maxWaitTimeInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));		
	}
	
	/***
	 * 
	 * @param element
	 * @param maxWaitTimeInSeconds
	 */
	protected void waitUntilElementVisible(WebElement element, int maxWaitTimeInSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, maxWaitTimeInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	/***
	 * 
	 * @param element
	 * @return
	 */
	protected boolean isElementDisplayed(WebElement element)
	{
		return element.isDisplayed();
	}

}
