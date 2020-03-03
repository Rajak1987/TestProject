package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.WebElement;
import managers.FileReaderManager;
import managers.PageObjectManager;
import pageObjects.SearchPage;

public class Sanity {
	AppiumDriver<WebElement> appiumDriver;
	SearchPage searchPage;
	PageObjectManager pageObjectManager;
	Hooks hook;
	WebDriverWait mywait;


	@Given("^User is on CPS ID page$")
	public void user_is_on_CPS_ID_page()  {
		System.out.println("Step:1.........................");
		hook = new Hooks();
		appiumDriver = hook.getAppiumDriver();
		pageObjectManager=new PageObjectManager(appiumDriver);
		searchPage = pageObjectManager.getSearchPage();
		searchPage.setSearch("83208");
		searchPage.clickOn_SearchByLoadId();
		
		

	}

	@When("^Login into app$")
	public void login_into_app()  {
		System.out.println("Step:2.........................");
	}

	@Then("^User must be login$")
	public void user_must_be_login()  {
		System.out.println("Step:3........................."); 
	}

}
