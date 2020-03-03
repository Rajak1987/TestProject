package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import managers.PageObjectManager;
import managers.UtilityManager;
import pageObjects.CommonElementsPage;
import pageObjects.LoadOverviewPage;
import pageObjects.SearchPage;
import utility.DeviceSetup1;

public class TenderOperations {

	Hooks hook=new Hooks();
	DeviceSetup1 dobj =new DeviceSetup1();
	AppiumDriver<WebElement> appiumDriver= hook.getAppiumDriver();
	PageObjectManager pageObjectManager=new PageObjectManager(appiumDriver);
	UtilityManager utilityManager=new UtilityManager(appiumDriver);
	CommonElementsPage commonElementsPage=pageObjectManager.getCommonElementsPage();
	LoadOverviewPage loadOverviewPage=pageObjectManager.getLoadOverviewPage();
	SearchPage searchPage=pageObjectManager.getSearchPage();
	WebDriverWait mywait=new WebDriverWait(appiumDriver, 120);
	WebElement e1;

	/******
	 * 
	 *Scenario: User should be able to reject the tender
	 */

	@Given("^User selects \"([^\"]*)\" load$")
	public void user_selects_load_in_tendered_tab(String loadId)  {
		try {
			
		if(searchPage.verify_CarrierTitle()) {
			searchPage.clickOn_LoadId(loadId);
			/*e1=appiumDriver.findElementByAccessibilityId("Load "+loadId);
			mywait.until(ExpectedConditions.visibilityOf(e1));
			e1.click();
			try { Thread.sleep(5000);}
			catch (InterruptedException e) {}*/
			mywait.until(ExpectedConditions.visibilityOf(loadOverviewPage.link_RespondToTender));
		}
		else {
			
				mywait.until(ExpectedConditions.visibilityOf(searchPage.txtbx_Search));
				searchPage.clickOn_LoadId(loadId);
				mywait.until(ExpectedConditions.visibilityOf(loadOverviewPage.link_RespondToTender));
				}
			
			
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}
	@When("^User taps on respond to tender operation$")
	public void user_taps_on_respond_to_tender_operation()  {
		try {
			loadOverviewPage.clickOn_RespondToTenderLink();
			mywait.until(ExpectedConditions.visibilityOf(loadOverviewPage.title_RespondToTender));
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}
	@Then("^Respond to tender popover should be generated$")
	public void respond_to_tender_popover_should_be_generated()  {

		try {
			Assert.assertEquals(true,loadOverviewPage.verify_RespondToTenderTitle());
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}

	}

	@When("^User chooses reject option and submit$")
	public void user_chooses_reject_ooption_and_submit() {
		try {
		loadOverviewPage.selectReject();
		commonElementsPage.clickOn_Done();
		try { Thread.sleep(5000);}
		catch (InterruptedException e) {}
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
		

	}

	@Then("^Load not available to carrier and status changed as tender rejected for employee$")
	public void load_not_available_to_carrier_and_status_changed_as_tender_rejected_for_employee() {
		
		try {
			if(searchPage.verify_CarrierTitle()) {
				Assert.assertEquals(true,loadOverviewPage.verify_NoLoadInformationAvailableLable());
			}
			else {
				Assert.assertEquals(true,loadOverviewPage.verify_TenderRejectedLable());
			}
			
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}
	

	@When("^User chooses accept option and submit$")
	public void user_chooses_accept_ooption_and_submit()  {

		loadOverviewPage.selectAccept();
		commonElementsPage.clickOn_Done();
		mywait.until(ExpectedConditions.visibilityOf(loadOverviewPage.label_TenderAccepted));
	}

	@Then("^the load status should be updated as tender accepted$")
	public void the_load_status_should_be_updated_as_tender_accepted()  {

		try {
			Assert.assertEquals(true,loadOverviewPage.verify_TenderAcceptedLable());
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}

	}
}
