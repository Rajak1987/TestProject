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
import managers.FileReaderManager;
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
		System.out.println(scenario.getName());
		//if (scenario.getName().equals("SuccessfulRegistration")) {
			
			//Reporter.assignAuthor("SampleAutomation - Rajak Basha");

	//}
	}
	@After(order = 1)
	 public void afterScenario(Scenario scenario) {
	if (scenario.isFailed()) {
	try {
		WebDriver driver = testContext.getWebDriverManager().getDriver();
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}catch(Exception e) {
		e.printStackTrace();
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

