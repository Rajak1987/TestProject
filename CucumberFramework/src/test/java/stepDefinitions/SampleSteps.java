package stepDefinitions;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import pageObjects.LoginPage;
import pageObjects.SamplePage;
import testContext.TestContext;

public class SampleSteps {

	SamplePage samplePage;
	TestContext testContext;
	WebDriverWait mywait;

	public SampleSteps(TestContext context) {
		testContext = context;
		samplePage = testContext.getPageObjectManager().getSamplePage();

	}
	@When("^Download and validate a file$")
	public void DwonloadFile() throws Throwable {
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		if(samplePage.getDwonloadButton() != null) {

			samplePage.getDwonloadButton().click();
		}

		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}

//		File dir1 = new File("A Sample PDF.pdf");
//		//String source_absolute_path = dir1.getAbsolutePath();
//		String originalPath = dir1.getCanonicalPath();
//		
//		Files.move(Paths.get(originalPath), Paths.get(FileReaderManager.getInstance().getConfigReader().getFileDwonloadPath()), StandardCopyOption.REPLACE_EXISTING);
		
		  
		String home = System.getProperty("user.home");
		String fileName = "A Sample PDF";
		File dir = new File(home+"/Downloads/"); 
		//File dir = new File(FileReaderManager.getInstance().getConfigReader().getFileDwonloadPath());
       
		File[] dir_contents = dir.listFiles();

		for (int i = 0; i < dir_contents.length; i++) {
			if (dir_contents[i].getName().contains("A Sample PDF")) {
				Assert.assertTrue("Failed to download Expected document", dir_contents[i].getName().contains("A Sample"));
				break;
			}
		}
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
