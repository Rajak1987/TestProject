package runners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


//import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalTests_Driver/DockCommitment.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
		,plugin = {"junit:Folder_Name/cucumber.json"}
		
		
		)
public class AndroidDriverTestRunner {
	
	public static AppiumDriverLocalService service;
	
	@BeforeClass
	public static void beforeScenario(){
		System.out.println("Before scenario");
		try {
		FileInputStream in = new FileInputStream("configs//Configuration.properties");
		Properties props = new Properties();
		props.load(in);
		in.close();

		FileOutputStream out = new FileOutputStream("configs//Configuration.properties");
		props.setProperty("portNumber", "4722");
		props.setProperty("sheet", "AndroidTablet_Sheet");
		props.store(out, null);
		out.close();
		}catch(Exception e){
			System.out.println(e);
		}
		

	/*service = AppiumDriverLocalService
				.buildService(new AppiumServiceBuilder()
						.usingDriverExecutable(new File("/usr/local/bin/node"))
						.withAppiumJS(
								new File(
										"/usr/local/lib/node_modules/appium/build/lib/main.js"))
						.withIPAddress("127.0.0.1").usingPort(4723));

		service.start(); */
	
	}
	@AfterClass
	public static void afterScenario() {
		System.out.println("After scenario");
		//service.stop();
		
	} 
}
