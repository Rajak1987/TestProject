package stepDefinitions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.UtilityManager;
import managers.WebDriverManager;
import pageObjects.EcommersePage;


public class Steps_EcommersePage {
	
	WebDriver driver;
	WebDriverManager webDriverManager;
	//WebDriverWait mywait;
	PageObjectManager pageObjectManager;
	FileReaderManager fileReaderManager;
	EcommersePage ecommersePage;
	UtilityManager utilityManager;
	
	@Given("^User is on Amazon home page$")
	public void user_is_on_Amazon_home_page() throws Throwable {
	
			webDriverManager = new WebDriverManager();
			driver = webDriverManager.getDriver();
			pageObjectManager = new PageObjectManager(driver);
			ecommersePage=pageObjectManager.getEcommersePage();
			//utilityManager = new UtilityManager(driver);
			driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
			//mywait=new WebDriverWait(driver, 60);
			//mywait.until(ExpectedConditions.visibilityOf(homePage.label_LoginHeader));
			//Assert.assertEquals(true,homePage.verify_LoginHeader());
			ecommersePage.navigateTo_HomePage();
	   
	}

	@Then("^scroll down at the bottpm of the page and top of the page$")
	public void scroll_down_at_the_bottpm_of_the_page(){
		//ecommersePage.scrollDownatEnd();
		//ecommersePage.scrollUpatBegin();
		ecommersePage.clickOn_SignIn();
		ecommersePage.clickOn_CloseIcon();
		webDriverManager.quitDriver();
		
	   
	}

}
