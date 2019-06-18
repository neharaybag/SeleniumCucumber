package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	private static WebDriver driver;

	public DriverFactory() {
		
	}

	public WebDriver getDriver() {
		
		return driver;
	}

	public WebDriver createDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	
	public void quit()
	{
		driver.close();
	}

}
