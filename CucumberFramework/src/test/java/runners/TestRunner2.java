package runners;
 
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "Features/Registration2.feature",
 glue= {"stepDefinitions"},
 plugin = { "pretty","html:target/cucumber-reports","json:target/cucumber.json"},
 monochrome = true
 )
  
public class TestRunner2 {
}
