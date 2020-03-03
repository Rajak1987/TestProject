package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ExcelFileReader;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.LoginPage;
import testContext.TestContext;

public class Steps_LoginPage {
	
	LoginPage loginPage;
	TestContext testContext;
	WebDriverWait mywait;
	
	
	public Steps_LoginPage(TestContext context) {
		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginPage();
		
	}
	
	@Given("^Open app url$")
	public void openAppUrl() throws Throwable {
		//System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
				//webDriverManager = new WebDriverManager();
				//driver = webDriverManager.getDriver();
				//driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
				//pageObjectManager = new PageObjectManager(driver);
				//mywait=new WebDriverWait(driver, 60);
				//loginPage=pageObjectManager.getLoginPage();
				mywait=new WebDriverWait(testContext.getWebDriverManager().getDriver(), 60);
				loginPage.navigateTo_HomePage();
				mywait.until(ExpectedConditions.visibilityOf(loginPage.label_Login));
				Assert.assertEquals(true,loginPage.validate_LoginHeader());
	}
	
//	@Then("^Login page should be displayed$")
//	public void login_page_should_be_displayed() throws Throwable {
//	    
//		Assert.assertEquals(true,loginPage.validate_LoginHeader());
//	}
//
//
//	@When("^enter valid \"([^\"]*)\" and \"([^\"]*)\" and click login$")
//	public void enter_valid_and_and_click_login(String UserName, String Password) throws Throwable {
//	    
//		loginPage.enter_UserId("UserName");
//		loginPage.enter_Password("Password");
//		loginPage.clickOn_Login();
//	}

	@Then("^User should be looged into app successfully$")
	public void user_should_be_looged_into_app_successfully() throws Throwable {
		
		Assert.assertEquals(true,loginPage.validate_TransportationManagerLabel());
		
	}
	@When("^User accepts terms of use$")
	public void acceptTerms()
	{
		try {
			Thread.sleep(20000);
		}catch(Exception e) {
			System.out.println(e);
		}
		loginPage.clickOn_accept();
	}

}
