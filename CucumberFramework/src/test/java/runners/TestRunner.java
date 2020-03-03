package runners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "Features/Registration2.feature"
 ,glue= {"stepDefinitions"}
 ,monochrome=true,
 plugin= {"pretty","html:target/MyReports/cucumberReport.html"}
 )
public class TestRunner { 
	
	
}

