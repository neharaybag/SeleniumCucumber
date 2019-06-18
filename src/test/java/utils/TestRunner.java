package utils;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



@CucumberOptions(
      	strict = true,
      	monochrome = true,
      	features = {"src/test/java/cucumberFeatureFiles/"},
      	glue =  {"stepDefinations"}
      
        )

public class TestRunner extends AbstractTestNGCucumberTests {
	
	
	
}
