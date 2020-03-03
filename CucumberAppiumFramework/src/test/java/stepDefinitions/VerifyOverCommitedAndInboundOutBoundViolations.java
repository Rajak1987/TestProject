package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.WebElement;
import managers.PageObjectManager;
import managers.UtilityManager;
import pageObjects.CommonElementsPage;
import pageObjects.CreateDockCommitmentPages;
import pageObjects.DocksPage;
import pageObjects.LoadOverviewPage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import pageObjects.StopOverviewPage;
import utility.DeviceSetup1;


public class VerifyOverCommitedAndInboundOutBoundViolations {
	
	Hooks hook=new Hooks();
	DeviceSetup1 dobj =new DeviceSetup1();
	AppiumDriver<WebElement> appiumDriver= hook.getAppiumDriver();
	PageObjectManager pageObjectManager=new PageObjectManager(appiumDriver);
	UtilityManager utilityManager=new UtilityManager(appiumDriver);
	SearchPage searchPage=pageObjectManager.getSearchPage();
	StopOverviewPage stopOverviewPage=pageObjectManager.getStopOverviewPage();
	CreateDockCommitmentPages createDockCommitmentPages=pageObjectManager.getCreateDockCommitmentPages();
	CommonElementsPage commonElementsPage=pageObjectManager.getCommonElementsPage();
	DocksPage docksPage=pageObjectManager.getDocksPage();
	LoginPage loginPage=pageObjectManager.getLoginPage();
	

	
	@When("^Select stop Milipitas store and Start time as eight am and duration as three hours and flexible on start time off and duration flexible by zero$")
	public void verifyOvercommitedViolationType() {
		
			createDockCommitmentPages.clickOn_TimePicker();
			commonElementsPage.setStartTime("8","0","PM");
			createDockCommitmentPages.clickOn_Timer();
			commonElementsPage.setDuration("3", "0");
			commonElementsPage.clickOn_NextButton();
		
	}
	@When("^Select stop Redwood store and Start time as eleven hours thirty six minutes am and duration as three hours and flexible on start time ON and duration flexible by zero$")
	public void verifyInboundOutboundViolationTypeWithExactMatch()
	{
		System.out.println("Step:4......................");
			createDockCommitmentPages.clickOn_NavigateNextStop();
			commonElementsPage.clickOn_NextButton();
		
	}
	
}


