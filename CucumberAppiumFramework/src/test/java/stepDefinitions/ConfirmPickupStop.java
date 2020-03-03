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
import pageObjects.OfferedPage;
import pageObjects.SearchPage;
import pageObjects.StopOverviewPage;
import utility.DeviceSetup1;

public class ConfirmPickupStop {

	Hooks hook=new Hooks();
	DeviceSetup1 dobj =new DeviceSetup1();
	AppiumDriver<WebElement> appiumDriver= hook.getAppiumDriver();
	PageObjectManager pageObjectManager=new PageObjectManager(appiumDriver);
	UtilityManager utilityManager=new UtilityManager(appiumDriver);
	SearchPage searchPage= pageObjectManager.getSearchPage();
	StopOverviewPage stopOverviewPage=pageObjectManager.getStopOverviewPage();
	CommonElementsPage commonElementsPage=pageObjectManager.getCommonElementsPage();
	OfferedPage offeredPage= pageObjectManager.getOfferedPage();
	WebDriverWait mywait=new WebDriverWait(appiumDriver, 60);
	

/******
 * 
 *Scenario:Driver should be able to confirm the pickup stop
 */
	@Given("^Driver selects \"([^\"]*)\" assignment in offered tab$")
	public void driver_selects_assignment_in_offered_tab(String assignmentId) {
		/*hook=new Hooks();
		appiumDriver = hook.getAppiumDriver();
		pageObjectManager=new PageObjectManager(appiumDriver);
		utilityManager=new UtilityManager(appiumDriver);
		searchPage = pageObjectManager.getSearchPage();
		offeredPage = pageObjectManager.getOfferedPage();
		stopOverviewPage=pageObjectManager.getStopOverviewPage();
		commonElementsPage=pageObjectManager.getCommonElementsPage();*/
		mywait.until(ExpectedConditions.elementToBeClickable(searchPage.tab_Offered));
		searchPage.clickOn_OfferedTab();
		//searchPage.setSearch(assignmentId);
		//searchPage.clickOn_SearchByLoadId();
		searchPage.clickOn_LoadId(assignmentId);
		mywait.until(ExpectedConditions.visibilityOf(offeredPage.btn_Accept));
	}
	@When("^Driver accepts the assignment by tap on accept button$")
	public void driver_accepts_the_assignment_by_tap_on_accept_button() {

		offeredPage.clickOn_AcceptButton();
		mywait.until(ExpectedConditions.elementToBeClickable(stopOverviewPage.btn_StartDuty));
	}

	@Then("^Assignment status should be changed to Accepted$")
	public void assignment_status_should_be_changed_to_Accepted()  {

		Assert.assertEquals(true,stopOverviewPage.verify_AcceptedLabel());
	}

	@When("^Driver taps on ON DUTY button$")
	public void driver_taps_on_ON_DUTY_tab()  {

		stopOverviewPage.clickOn_StartDutyButton();
		mywait.until(ExpectedConditions.visibilityOf(stopOverviewPage.btn_YesStartDuty));
		stopOverviewPage.clickOn_StartDutyYesButton();
		mywait.until(ExpectedConditions.visibilityOf(stopOverviewPage.label_OnDuty));
	}

	@Then("^Assignment status should be chaged to ON DUTY$")
	public void assignment_status_should_be_chaged_to_ON_DUTY()  {
		
		Assert.assertEquals(true,stopOverviewPage.verify_OnDutyLabel());
	}
	@When("^Driver taps on process pickup button$")
	public void driver_taps_on_process_pickup_button()  {
	    
		stopOverviewPage.clickOn_ProcessPickup();
		mywait.until(ExpectedConditions.visibilityOf(stopOverviewPage.title_ReviewItems));
	}

	@Then("^Driver should be navigated to review Items page$")
	public void driver_should_be_navigated_to_review_Items_page() {
	    
		Assert.assertEquals(true,stopOverviewPage.verify_ReviewItemsPageTitle());
	}

	@When("^Driver should be able to launch confirm stop popover$")
	public void driver_should_be_able_to_launch_confirm_stop_popover_from_submit_button()  {
		
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
		commonElementsPage.clickOn_PickupStopConfirmStopButton();
		}
		if("ios".equalsIgnoreCase(hook.getPlatformName())){
			commonElementsPage.clickOn_ConfirmStopButton();
		}
		mywait.until(ExpectedConditions.visibilityOf(commonElementsPage.title_ConfirmStop));
	}

	@When("^Driver selects reported date and time and completes confirm stop operation by tap on Done button$")
	public void driver_selects_reported_date_and_time_and_completes_confirm_stop_operation_by_tap_on_Done_button()  {
		
		commonElementsPage.clickOn_ConfirmStopDone();
		mywait.until(ExpectedConditions.visibilityOf(stopOverviewPage.label_PickupComplete));
	}

	@Then("^Stop Status should be changed to Pickup complete$")
	public void stop_Status_should_be_changed_to_Pickup_complete()  {
	    
		Assert.assertEquals(true,stopOverviewPage.verify_PickupCompleteStatus());
	}

	
}
