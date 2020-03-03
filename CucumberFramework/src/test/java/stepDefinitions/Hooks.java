package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//import managers.UtilityManager;
//import managers.WebDriverManager;
import testContext.TestContext;
//import utility.DbQuery;

public class Hooks {

	TestContext testContext;
	
	public Hooks(TestContext context) {
		 testContext = context;
		 }

	@Before
	 public void BeforeSteps(Scenario scenario) {
		System.out.println(".................Before hook.............................");
		if (scenario.getName().equals("Table scenario")) {
			

		Reporter.assignAuthor("SampleAutomation - Rajak Basha");

	}
	}
	@After(order = 1)
	 public void afterScenario(Scenario scenario) {
	 if (scenario.isFailed()) {
	 String screenshotName = scenario.getName().replaceAll(" ", "_");
	 try {
	 //This takes a screenshot from the driver at save it to the specified location
	 File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
	 
	 //Building up the destination path for the screenshot to save
	 //Also make sure to create a folder 'screenshots' with in the cucumber-report folder
	 File destinationPath = new File("/Users/1020122/eclipse-workspace1/CucumberFramework/target/cucumber-reports/screenshots/" + screenshotName + ".png");
	 
	 //Copy taken screenshot from source location to destination location
	 Files.copy(sourcePath, destinationPath);   
	 
	 //This attach the specified screenshot to the test
	 Reporter.addScreenCaptureFromPath(destinationPath.toString());
	 } catch (IOException e) {
	 } 
	 }
	 }
//	@After(order=1)
//	public void afterScenario(Scenario scenario) {
//		System.out.println("..............Before After hook.............................");
//		 if (scenario.isFailed()) {
//			 try {
//		testContext.getUtilityManager().getTakeScreenShot();
//		System.out.println("...........ScreenShot is taken...................");
//		
//	}catch (Exception e) {
//	 } 
//	}
//}

	@After(order=0)
	public void tearDown() {

		testContext.getWebDriverManager().quitDriver();
		System.out.println("After hook.............................");


	}

}

