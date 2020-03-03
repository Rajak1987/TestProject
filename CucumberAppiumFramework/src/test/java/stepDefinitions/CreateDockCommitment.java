package stepDefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.WebElement;
import io.appium.java_client.TouchAction;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.UtilityManager;
import pageObjects.SearchPage;
import pageObjects.StopOverviewPage;
import utility.DeviceSetup1;
import utility.TakeScreenShot;
import pageObjects.CommonElementsPage;
import pageObjects.CreateDockCommitmentPages;
import pageObjects.DocksPage;
import pageObjects.LoadOverviewPage;
import pageObjects.LoginPage;


public class CreateDockCommitment {

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
	LoadOverviewPage loadOverviewPage=pageObjectManager.getLoadOverviewPage();
	WebDriverWait mywait=new WebDriverWait(appiumDriver, 60);
	//appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	@Given("^Driver selects \"([^\"]*)\" assignment in accepted tab$")
	public void driver_selects_assignment_in_accepted_tab(String assignmentId) throws Exception{

		System.out.println("Step:1.........................");
		/*System.out.println("Available Contexts......."+appiumDriver.getContextHandles());
			Set <String> contexts = appiumDriver.getContextHandles();
			for(String s:contexts)
			{
			if(s.contains("WEBVIEW"))
			{
				appiumDriver.context(s);
				System.out.println("Current Context..............." +appiumDriver.getContext());
				System.out.println("Mobile Web View found");
				break;


			}
			} */
		//searchPage.setSearch(assignmentId);
		//searchPage.clickOn_SearchByLoadId();
		
		if(searchPage.verify_DriverTitle())
		{
			//mywait.until(ExpectedConditions.visibilityOf(searchPage.tab_Accepted));
			searchPage.clickOn_LoadId(assignmentId);
			mywait.until(ExpectedConditions.visibilityOf(stopOverviewPage.btn_StartDuty));
		}
		else {
			if(searchPage.verify_CarrierTitle()) {
			//mywait.until(ExpectedConditions.visibilityOf(searchPage.title_Carrier));
			searchPage.clickOn_AcceptedTab();
			}
			mywait.until(ExpectedConditions.visibilityOf(searchPage.txtbx_Search));
			searchPage.clickOn_LoadId(assignmentId);
			mywait.until(ExpectedConditions.visibilityOf(loadOverviewPage.tab_LoadOverview));
			}
	}
	@Given("^Driver navigates to dock commitments page from docks tab$")
	public void driver_navigates_to_new_dock_commitment_page_from_docks_tab() {
		/*System.out.println("Available Contexts......."+appiumDriver.getContextHandles());
			Set <String> contexts = appiumDriver.getContextHandles();
			for(String s:contexts)
			{
			if(s.contains("WEBVIEW"))
			{
				appiumDriver.context(s);
				System.out.println("Current Context..............." +appiumDriver.getContext());
				System.out.println("Mobile Web View found");

			}
			}  */
		stopOverviewPage.clickOn_DocksTab();
		mywait.until(ExpectedConditions.visibilityOf(docksPage.label_DocksForStops));

		/*System.out.println("Available Contexts......."+appiumDriver.getContextHandles());
			Set <String> contexts = appiumDriver.getContextHandles();
			for(String s:contexts)
			{
			if(s.contains("WEBVIEW"))
			{
				appiumDriver.context(s);
				System.out.println("Current Context..............." +appiumDriver.getContext());
				System.out.println("Mobile Web View found");

			}
			} 
			/*System.out.println("Available Contexts......."+appiumDriver.getContextHandles());
			Set<String> handles=appiumDriver.getContextHandles();
			List<String> handlesList=new ArrayList(handles);
			String webView=handlesList.get(1);
			appiumDriver.context(webView); */
		
	}
	@When("^Driver navigates to create new dock commitment page from create icon$")
	public void Driver_navigates_to_create_new_dock_commitments_page_from_create_icon() {
		
		docksPage.clickOn_CreateIcon();
	}
	@When("^Selecte stop Hanford store and provide Start Time as eight am and Duration as zero$")
	public void selecte_stop_Hanford_store_and_provide_Start_Time_as_eight_am_and_Duration_as_zero()  {

		System.out.println("Step:2.........................");
		createDockCommitmentPages.clickOn_TimePicker();
		mywait.until(ExpectedConditions.visibilityOf(commonElementsPage.btn_Cancel));
		commonElementsPage.setStartTime("8","0","AM");
		createDockCommitmentPages.clickOn_Timer();
		commonElementsPage.setDuration("0", "0");
		/*commonElementsPage.setHourValue();
		commonElementsPage.selectEightHour();
		commonElementsPage.selectZeroMinute();
		commonElementsPage.selectAm();
		commonElementsPage.clickOn_Ok();
		createDockCommitmentPages.clickOn_Timer();
		commonElementsPage.selectMinute();
		commonElementsPage.selectZeroMinute();
		commonElementsPage.selectHour();
		commonElementsPage.selectZeroMinute();
		commonElementsPage.clickOn_Ok(); */
	}
	@Then("^Duration should not be zero popup should be generated$")
	public void duration_should_not_be_zero_popup_should_be_generated()  {

		System.out.println("Step:3.........................");
		Assert.assertEquals(true,commonElementsPage.verify_PopupLabel());
		commonElementsPage.clickOn_Ok();
	}
	@When("^Provide Duration as two hours and also Duartion Flexible By two hours$")
	public void provide_Duration_as_two_hours_and_also_Duartion_Flexible_By_two_hours() {

		System.out.println("Step:4.........................");
		System.out.println("This step has dependency on duration slider");
		/*createDockCommitmentPages.clickOn_Timer();
		commonElementsPage.setDuration("02","00");
		System.out.println("Available Contexts.............."+appiumDriver.getContextHandles());//WEBVIEW_19678.1
		Set <String> contexts = appiumDriver.getContextHandles();
		for(String s:contexts)
		{
		if(s.contains("WEBVIEW"))
		{
			appiumDriver.context(s);
			System.out.println("Current Context..............." +appiumDriver.getContext());
			System.out.println("Mobile Web View found");

		}
		} 
		commonElementsPage.setDurationFlexibility("2:00");
		/*(new TouchAction(appiumDriver))
				.press({x: 176, y: 540})
				.moveTo({x: 110: y: 2})
		  .release()
		  .perform()
		 // (new TouchAction(appiumDriver)).tap(338, 303).perform(); 
		(new TouchAction(appiumDriver)).tap(286, 539).perform();

		(new TouchAction(appiumDriver))
		.press( 176,  540)
		.moveTo(110,2)
		.release()
		.perform();*/


		/*commonElementsPage.selectHour();
		commonElementsPage.selectTwoHour();
		commonElementsPage.clickOn_Ok(); */
	}
	@Then("^Duration Flexibility should be less than Duration popup should be generated$")
	public void duration_Flexibility_should_be_less_than_Duration_popup_should_be_generated() {

		System.out.println("Step:5.........................");
		System.out.println("This step has dependency on duration slider");
		/*Assert.assertEquals(true,commonElementsPage.verify_PopupLabel());
		commonElementsPage.clickOn_Ok();*/
	}
	@When("^Provide start time as five am and duration as ten hours and duration flexible by zero hours and flexible on start time as ON and click on Next button$")
	public void provide_start_time_as_five_am_and_duration_as_two_hours_and_flexible_on_start_time_as_Off()  {

		System.out.println("Step:6.........................");
		System.out.println("This step has dependency on duration slider");
		createDockCommitmentPages.clickOn_TimePicker();
		commonElementsPage.setStartTime("5","0","AM");
		createDockCommitmentPages.clickOn_Timer();
		commonElementsPage.setDuration("10","0");
		createDockCommitmentPages.clickOn_FlexibleOnStartTime();
		commonElementsPage.clickOn_NextButton();
	}
	@Then("^No dock slots available please relax your criteria popup should be genearated$")
	public void no_dock_slots_available_please_relax_your_criteria_popup_should_be_genearated()  {

		System.out.println("Step:7.........................");
		System.out.println("This step has dependency on duration slider");
		Assert.assertEquals(true,commonElementsPage.verify_PopupLabel());
		commonElementsPage.clickOn_Ok();
	}
	@When("^Provide start time as five pm$")
	public void provide_start_time_as_five_pm()  {

		System.out.println("Step:8.........................");
		createDockCommitmentPages.clickOn_TimePicker();
		commonElementsPage.setStartTime("5","0","PM");
	}
	@Then("^Duration should fall in the same day popup should be generated$")
	public void duration_should_fall_in_the_same_day_popup_should_be_generated()  {

		System.out.println("Step:9.........................");
		Assert.assertEquals(true,commonElementsPage.verify_PopupLabel());
		commonElementsPage.clickOn_Ok();

	}
	@When("^Provide start time as eight am and duration as two hours and flexible on start time as ON and duration flexible by zero hour and proceed to select time slot screen from next button$")
	public void provide_start_time_as_eight_am_and_flexible_on_start_time_as_ON_and_duration_flexible_by_one_hour_and_proceed_to_select_time_slot_screen_from_next_button()  {

		System.out.println("Step:10.........................");
		System.out.println("This step has dependency on duration slider still we can create commitment by skipping few fields");
		createDockCommitmentPages.clickOn_TimePicker();
		commonElementsPage.setStartTime("8","0","AM");
		createDockCommitmentPages.clickOn_Timer();
		commonElementsPage.setDuration("2","0");
		//commonElementsPage.setDurationFlexibility("1:00"); 

		/*commonElementsPage.selectHour();
		commonElementsPage.selectEightHour();
		commonElementsPage.selectAm();
		commonElementsPage.clickOn_Ok();
		createDockCommitmentPages.clickOn_FlexibleOnStartTime();
		(new TouchAction(appiumDriver)).tap(FileReaderManager.getInstance().getConfigReader().getSlider1_x(), FileReaderManager.getInstance().getConfigReader().getDurationSlider_y()).perform();*/
		createDockCommitmentPages.clickOn_FlexibleOnStartTime();
		commonElementsPage.clickOn_NextButton();

	}
	@Then("^Found both exact and closed match$")
	public void found_both_exact_and_closed_match()  {

		System.out.println("Step:11.........................");
		//System.out.println("This step has dependency on duration slider");
		System.out.println("Second Screen ..............");
		Assert.assertEquals(true,createDockCommitmentPages.verify_TimeSlot());
	}
	@When("^select exact match and proceed to dock confirmation screen from next button$")
	public void select_exact_match_and_proceed_to_dock_confirmation_screen_from_next_button()  {

		System.out.println("Step:12.........................");
		System.out.println("Third Screen ..............");
		createDockCommitmentPages.selectTimeSlot();
		commonElementsPage.clickOn_NextButton();
	}
	@When("^Confirm the dock commitment from submit button$")
	public void confirm_the_dock_commitment_from_submit_button() {

		System.out.println("Step:13.........................");
		System.out.println("Confirm Screen ..............");
		commonElementsPage.clickOn_Submit();
	}
	@Then("^success popup message should be generated$")
	public void success_popup_message_should_be_generated()  {

		System.out.println("Step:14.........................");
		System.out.println("Success Screen ..............");
		Assert.assertEquals(true,commonElementsPage.verify_SuccessPopupLabel());
		commonElementsPage.clickOn_Ok();

	}
	@When("^control should be navigated to docks tab screen from popup OK button$")
	public void control_should_be_navigated_to_docks_tab_screen_from_popup_OK_button()  {

		System.out.println("Step:15.........................");	
		System.out.println("Create Screen ..............");
		Assert.assertEquals(true, docksPage.verify_DocksForStopsLabel());
	}
}






