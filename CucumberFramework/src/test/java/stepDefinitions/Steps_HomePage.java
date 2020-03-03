package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ExcelFileReader;
import enums.Context;
import managers.FileReaderManager;
import managers.UtilityManager;
import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testContext.TestContext;

public class Steps_HomePage {
	
	TestContext testContext;
	HomePage homePage;
	WebDriverWait mywait;
	ExcelFileReader excelFileReader = FileReaderManager.getInstance().getExcelReader();
	
	 public Steps_HomePage(TestContext context) {
		 testContext = context;
		 homePage = testContext.getPageObjectManager().getHomePage();
		 }
	 
		@Given("^user is on homepage$")
		public void user_is_on_homepage() throws Throwable {
			try {
				
				//testContext.getWebDriverManager().getDriver().manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
				mywait=new WebDriverWait(testContext.getWebDriverManager().getDriver(), 60);
				homePage.navigateTo_HomePage();
				
//				mywait.until(ExpectedConditions.visibilityOf(homePage.label_LoginHeader));
//				Assert.assertEquals(true,homePage.verify_LoginHeader());
				
			}catch(Exception e)
			{
				System.err.println(e);
				//utilityManager.getTakeScreenShot();
			}
	
		}
		@When("^click Join us to create a new user account$")
		public void click_Join_us_to_create_a_new_user_account() throws Throwable {
			try {	
				homePage.clickOn_JoinusLink();	
			}catch(Exception e)
			{
				System.err.println(e);
			}
		}

	 
	 @Then("^user is created successfully$")
		public void user_is_created_successfully() throws Throwable {
			
				
				mywait.until(ExpectedConditions.visibilityOf(homePage.label_LoginHeader));
				Assert.assertEquals(true,homePage.verify_LoginHeader());
			
	
		}
	 
	 @Then("^Login page should be displayed$")
		public void login_page_should_be_displayed() throws Throwable {
		    
			Assert.assertEquals(true,homePage.verify_LoginHeader());
		}


		/*@When("^enter valid \"([^\"]*)\" and \"([^\"]*)\" and click login$")
		public void enter_valid_and_and_click_login(String UserName, String Password) throws Throwable {
			//UserName = (String)testContext.scenarioContext.getContext(Context.USER_NAME);
			Steps_RegistrationPage regPageSteps = new Steps_RegistrationPage();
			UserName = regPageSteps.getActualTestData();
			System.out.println(UserName);
			//homePage.enter_UserName(excelFileReader.getExcelData(UserName));
			homePage.enter_UserName(UserName);
			homePage.enter_Password(excelFileReader.getExcelData(Password));
			homePage.clickOn_Login();
		}*/
		
	
}
