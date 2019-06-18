package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;

public class Hooks {
	
	
		
	    @Before
	    public void setupTest() {
	    	
	    	new DriverFactory().createDriver();
	    }

	    @After
	    public void teardown() {
	       
	    	new DriverFactory().quit();
	    }

}
