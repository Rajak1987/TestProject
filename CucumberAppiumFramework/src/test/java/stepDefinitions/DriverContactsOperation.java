package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidKeyCode;
import managers.PageObjectManager;
import managers.UtilityManager;
import pageObjects.CommonElementsPage;
import pageObjects.ContactsPage;
import pageObjects.DocumentsPage;
import pageObjects.SearchPage;
import pageObjects.StopOverviewPage;
import pageObjects.StopsPage;
import utility.DeviceSetup1;

public class DriverContactsOperation {

	Hooks hook=new Hooks();
	DeviceSetup1 dobj =new DeviceSetup1();
	AppiumDriver<WebElement> appiumDriver= hook.getAppiumDriver();
	PageObjectManager pageObjectManager=new PageObjectManager(appiumDriver);
	UtilityManager utilityManager=new UtilityManager(appiumDriver);
	StopOverviewPage stopOverviewPage=pageObjectManager.getStopOverviewPage();
	CommonElementsPage commonElementsPage=pageObjectManager.getCommonElementsPage();
	ContactsPage contactsPage=pageObjectManager.getContactsPage();
	SearchPage searchPage=pageObjectManager.getSearchPage();
	StopsPage stopsPage=pageObjectManager.getStopsPage();
	
	WebDriverWait mywait=new WebDriverWait(appiumDriver, 60);

	/******
	 * 
	 *Scenario: Driver should be able to attach the document from gallery option at load and stop
	 */
	@When("^Driver taps on Contacts option in stop kebab menu$")
	public void driver_taps_on_Contacts_option_in_stop_kebab_menu()  {
		try {
			stopOverviewPage.clickOn_Stop1KebabMenu();
			stopOverviewPage.selectContacts();
			mywait.until(ExpectedConditions.visibilityOf(contactsPage.option_Sms));
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}

	@Then("^Contacts popover should be generated$")
	public void contacts_popover_should_be_generated()  {

		try {
			Assert.assertEquals(true,contactsPage.verify_ContactsPopover());
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}

	@When("^Driver selects sms option$")
	public void driver_selects_sms_option()  {
		try {
			contactsPage.selectSmsOption();
			if("Android".equalsIgnoreCase(hook.getPlatformName())){
				mywait.until(ExpectedConditions.visibilityOf(contactsPage.option_Messanger));
				contactsPage.selectMessanger();
				contactsPage.selectJustOnce();
			}
			mywait.until(ExpectedConditions.visibilityOf(contactsPage.txtbx_Message));
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}

	@Then("^Driver should be navigated to messanger screen$")
	public void driver_should_be_navigated_to_messanger_screen()  {
		try {
			Assert.assertEquals(true,contactsPage.verify_MessageScreen());
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}

	@When("^Driver navigates back to stop overview screen from messanger$")
	public void driver_navigates_back_to_stop_overview_screen_from_messanger()  {
		try {
			if("Android".equalsIgnoreCase(hook.getPlatformName())){
				appiumDriver.navigate().back();
			}if("ios".equalsIgnoreCase(hook.getPlatformName())){
				commonElementsPage.clickOn_ReturnToTMUserButton();
			}
			if(searchPage.verify_DriverTitle()){
			mywait.until(ExpectedConditions.visibilityOf(stopOverviewPage.btn_StartDuty));
			}
			else {
			mywait.until(ExpectedConditions.visibilityOf(stopsPage.label_Contact));
			}
			
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}

	}

	@When("^Driver selects call option$")
	public void driver_selects_call_option()  {

		try {
			if("Android".equalsIgnoreCase(hook.getPlatformName())){
				contactsPage.selectCallOption();
				mywait.until(ExpectedConditions.visibilityOf(contactsPage.btn_CreateNewContact));
			}
			if("ios".equalsIgnoreCase(hook.getPlatformName())){
				contactsPage.selectEmailOption();
				System.out.println("*********************ios doesnot support this feature in simulator*************");
			}
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}

	}

	@Then("^Driver should be navigated to dialpad screen$")
	public void driver_should_be_navigated_to_dialpad_screen()  {

		try {
			if("Android".equalsIgnoreCase(hook.getPlatformName())){
				Assert.assertEquals(true,contactsPage.verify_DailPadScreen());
			}
			if("ios".equalsIgnoreCase(hook.getPlatformName())){
				System.out.println("*********************ios doesnot support this feature in simulator*************");
			}
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}

	@When("^Driver navigates back to stop overview screen from dialpad$")
	public void driver_navigates_back_to_stop_overview_screen_from_dialpad()  {
		try {
			if("Android".equalsIgnoreCase(hook.getPlatformName())){
				appiumDriver.navigate().back();
				mywait.until(ExpectedConditions.visibilityOf(contactsPage.icon_DailPad));
				appiumDriver.navigate().back();
				mywait.until(ExpectedConditions.visibilityOf(contactsPage.label_AddFavorite));
				appiumDriver.navigate().back();
				if(searchPage.verify_DriverTitle()){
					mywait.until(ExpectedConditions.visibilityOf(stopOverviewPage.btn_StartDuty));
					}
					else {
					mywait.until(ExpectedConditions.visibilityOf(stopsPage.label_Contact));
					}
			}
			if("ios".equalsIgnoreCase(hook.getPlatformName())){
				//mywait.until(ExpectedConditions.visibilityOf(stopOverviewPage.btn_StartDuty));
				System.out.println("*********************ios doesnot support this feature in simulator*************");
			}
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}

	@When("^Driver selects email option$")
	public void driver_selects_email_option()  {

		try {
			if("Android".equalsIgnoreCase(hook.getPlatformName())){
				contactsPage.selectEmailOption();
				mywait.until(ExpectedConditions.visibilityOf(contactsPage.label_WelcomeToGmail));
			}
			if("ios".equalsIgnoreCase(hook.getPlatformName())){
				contactsPage.selectEmailOption();
				System.out.println("*********************ios doesnot support this feature in simulator*************");
			}

		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}

	@Then("^Driver should be navigated to gmail screen$")
	public void driver_should_be_navigated_to_gmail_screen()  {
		try {
			if("Android".equalsIgnoreCase(hook.getPlatformName())){
				Assert.assertEquals(true,contactsPage.verify_GmailScreen());
			}
			if("ios".equalsIgnoreCase(hook.getPlatformName())){
				System.out.println("*********************ios doesnot support this feature in simulator*************");
			}
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}

	@When("^Driver navigates back to stop overview screen from gmail$")
	public void driver_navigates_back_to_stop_overview_screen_from_gmail()  {

		try {
			if("Android".equalsIgnoreCase(hook.getPlatformName())){
				appiumDriver.navigate().back();
				if(searchPage.verify_DriverTitle()){
					mywait.until(ExpectedConditions.visibilityOf(stopOverviewPage.btn_StartDuty));
					}
					else {
					mywait.until(ExpectedConditions.visibilityOf(stopsPage.label_Contact));
					}
			}
			if("ios".equalsIgnoreCase(hook.getPlatformName())){
				System.out.println("*********************ios doesnot support this feature in simulator*************");
			}
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}

}
