package stepDefinitions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ExcelFileReader;
import enums.Context;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.UtilityManager;
import managers.WebDriverManager;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testContext.TestContext;
import utility.DbQuery;

import java.util.concurrent.TimeUnit;



public class Steps_RegistrationPage {

	
//	WebDriver driver;
//	WebDriverManager webDriverManager;
//	WebDriverWait mywait;
//	PageObjectManager pageObjectManager;
//	FileReaderManager fileReaderManager;
//	RegistrationPage registrationPage;
//	UtilityManager utilityManager;
//	HomePage homePage;
//	
//	 
//	@Given("^user is on homepage$")
//	public void user_is_on_homepage() throws Throwable {
//		try {
//			//webDriverManager = new WebDriverManager();
//			//driver = webDriverManager.getDriver();
//			pageObjectManager = new PageObjectManager(driver);
//			homePage=pageObjectManager.getHomePage();
//			//utilityManager = new UtilityManager(driver);
//			driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
//			mywait=new WebDriverWait(driver, 60);
//			homePage.navigateTo_HomePage();
//			mywait.until(ExpectedConditions.visibilityOf(homePage.label_LoginHeader));
//			Assert.assertEquals(true,homePage.verify_LoginHeader());
//		}catch(Exception e)
//		{
//			System.err.println(e);
//			//utilityManager.getTakeScreenShot();
//		}
//
//	}
//	@When("^click Join us to create a new user account$")
//	public void click_Join_us_to_create_a_new_user_account() throws Throwable {
//		try {	
//			homePage.clickOn_JoinusLink();	
//		}catch(Exception e)
//		{
//			System.err.println(e);
//			//utilityManager.getTakeScreenShot();
//		}
//	}
	
	TestContext testContext;
	RegistrationPage registrationPage;
	HomePage homePage;
	WebDriverWait mywait;
	ExcelFileReader excelFileReader = FileReaderManager.getInstance().getExcelReader();
	static String ACTUAL_TESTDATA;
	
	 
	 public Steps_RegistrationPage(TestContext context) {
	 testContext = context;
	 registrationPage = testContext.getPageObjectManager().getRegistrationPage();
	 homePage = testContext.getPageObjectManager().getHomePage();
	 mywait = new WebDriverWait(testContext.getWebDriverManager().getDriver(), 60);
	 }
	public Steps_RegistrationPage() {
		// TODO Auto-generated constructor stub
	}
	@Then("^Signup page should be opened$")
	public void signup_page_should_be_opened() throws Throwable {
		
		try {
			mywait.until(ExpectedConditions.visibilityOf(homePage.label_LoginHeader));
			Assert.assertEquals(true,homePage.verify_LoginHeader());
			}catch(Exception  e){
				System.out.println(e.getCause());
				System.out.println(e.getMessage());
				e.printStackTrace();
	
				try {
					mywait.until(ExpectedConditions.visibilityOf(registrationPage.label_Signup));

					Assert.assertEquals(true,registrationPage.verify_SignUpHeader());

				}catch(Exception e1){
					System.out.println(e.getCause());
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}

	}

	@When("^enter valid user details and submit$")
	public void enter_valid_user_details_and_submit(DataTable userdetails) throws Throwable {
		try {

			List<Map<String,String>> data = userdetails.asMaps(String.class,String.class);
			registrationPage.enter_UserName(data.get(0).get("UserName")); 
			registrationPage.enter_Email(data.get(0).get("email"));
			registrationPage.enter_Password(data.get(0).get("password"));
			registrationPage.enter_confirmPassword(data.get(0).get("confirmPassword"));
			registrationPage.clickOn_Demo1();
	


		}catch(Exception e){
			System.err.println(e);
			
		}
	}
	@When("^enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and submit$")
	public void enter_valid_user_details_and_submit(String UserName, String Email, String Password, String ConfirmPassword ) throws Throwable {
		try {

			//List<Map<String,String>> data = userdetails.asMaps(String.class,String.class);
			Email = excelFileReader.getExcelData(Email);
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy_HHmmss");  
		    Date date = new Date();   
			String DateTime = formatter.format(date).toString();
			String Username = Email.substring(0,Email.indexOf("@")) ;
			String Domain = Email.substring(Email.indexOf("@"));
			String Actual_Email = Username+DateTime+Domain;
			System.out.println(Actual_Email);
			registrationPage.enter_UserName(excelFileReader.getExcelData(UserName)); 
			registrationPage.enter_Email(Actual_Email);
			ACTUAL_TESTDATA = Actual_Email;
			testContext.scenarioContext.setContext(Context.USER_NAME, Actual_Email);
			System.out.println((String)testContext.scenarioContext.getContext(Context.USER_NAME));
			registrationPage.enter_Password(excelFileReader.getExcelData(Password));
			registrationPage.enter_confirmPassword(excelFileReader.getExcelData(ConfirmPassword));
			registrationPage.clickOn_Demo1();
	


		}catch(Exception e){
			//utilityManager.getTakeScreenShot();
			System.err.println(e);
			
		}
	}
	
//	@Then("^user is created successfully$")
//	public void user_is_created_successfully() throws Throwable {
//		try {
//			
//			mywait.until(ExpectedConditions.visibilityOf(homePage.label_LoginHeader));
//			Assert.assertEquals(true,homePage.verify_LoginHeader());
//		}catch(Exception e){
//			//utilityManager.getTakeScreenShot();
//			System.err.println(e);
//			System.exit(1);
//		}
//
//	}
	@Then ("^Get value from db$")
	public void getValueFromDb() throws Throwable{
		try {
			//utilityManager = new UtilityManager(testContext.getWebDriverManager().getDriver());
			DbQuery dbQuery=testContext.getUtilityManager().getDbQuery();
			dbQuery.getConnection();
			String result =dbQuery.executeSqlQuery("90997");
			System.out.println("Result is............"+result);
			dbQuery.closeConnection();
			System.out.println("DB Connection is closed...............................");
			//webDriverManager.quitDriver();
			System.out.println("Web Driver is closed...............................");

		}catch(Exception e){
			//utilityManager.getTakeScreenShot();
			System.err.println(e);
			
		}
	}
	public String getActualTestData() {
		
		return ACTUAL_TESTDATA;
	}
	@When("^enter valid \"([^\"]*)\" and \"([^\"]*)\" and click login$")
	public void enter_valid_and_and_click_login(String UserName, String Password) throws Throwable {
		//UserName = (String)testContext.scenarioContext.getContext(Context.USER_NAME);
		
		UserName = ACTUAL_TESTDATA;
		System.out.println(UserName);
		//homePage.enter_UserName(excelFileReader.getExcelData(UserName));
		homePage.enter_UserName(UserName);
		homePage.enter_Password(excelFileReader.getExcelData(Password));
		homePage.clickOn_Login();
	}
	

}
