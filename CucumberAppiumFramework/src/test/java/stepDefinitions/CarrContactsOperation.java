package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import managers.PageObjectManager;
import managers.UtilityManager;
import pageObjects.CommonElementsPage;
import pageObjects.ContactsPage;
import pageObjects.LoadOverviewPage;
import pageObjects.StopOverviewPage;
import pageObjects.StopsPage;
import utility.DeviceSetup1;

public class CarrContactsOperation {
	
	Hooks hook=new Hooks();
	DeviceSetup1 dobj =new DeviceSetup1();
	AppiumDriver<WebElement> appiumDriver= hook.getAppiumDriver();
	PageObjectManager pageObjectManager=new PageObjectManager(appiumDriver);
	UtilityManager utilityManager=new UtilityManager(appiumDriver);
	StopOverviewPage stopOverviewPage=pageObjectManager.getStopOverviewPage();
	CommonElementsPage commonElementsPage=pageObjectManager.getCommonElementsPage();
	LoadOverviewPage loadOverviewPage=pageObjectManager.getLoadOverviewPage();
	StopsPage stopsPage=pageObjectManager.getStopsPage();
	ContactsPage contactsPage=pageObjectManager.getContactsPage();
	WebDriverWait mywait=new WebDriverWait(appiumDriver, 120);

	/******
	 * 
	 *Scenario: This feature explains the Contacts operation available for pickup and drop stops for carrier and employee personas
	 */
	@When("^User opens location details from location link$")
	public void user_opens_location_details_from_location_link()  {
	    try {
		stopsPage.clickOn_LocationLink();
		mywait.until(ExpectedConditions.visibilityOf(stopsPage.label_Contact));
	}catch(Exception e){
		utilityManager.getTakeScreenShot();
		System.out.println(e);
		System.exit(1);
	}
	}

	@When("^User taps on contacts option$")
	public void user_taps_on_contacts_option()  {
		try {
		stopsPage.clickOn_ContactLink();
		mywait.until(ExpectedConditions.visibilityOf(contactsPage.option_Sms));
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}


}
