package stepDefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.UtilityManager;
import pageObjects.CommonElementsPage;
import pageObjects.DocumentsPage;
import pageObjects.SearchPage;
import pageObjects.StopOverviewPage;
import pageObjects.StopsPage;
import utility.DeviceSetup1;

public class DriverUpdateEtaForStop {

	Hooks hook=new Hooks();
	DeviceSetup1 dobj =new DeviceSetup1();
	AppiumDriver<WebElement> appiumDriver= hook.getAppiumDriver();
	PageObjectManager pageObjectManager=new PageObjectManager(appiumDriver);
	UtilityManager utilityManager=new UtilityManager(appiumDriver);
	StopOverviewPage stopOverviewPage=pageObjectManager.getStopOverviewPage();
	CommonElementsPage commonElementsPage=pageObjectManager.getCommonElementsPage();
	StopsPage stopsPage=pageObjectManager.getStopsPage();
	SearchPage searchPage=pageObjectManager.getSearchPage();
	WebDriverWait mywait=new WebDriverWait(appiumDriver, 120);
	
	/******
	 * 
	 *Scenario: Driver should be able to update the ETA for stop
	 */

	@When("^User taps on Update ETA option in stop kebab menu$")
	public void driver_taps_on_Update_ETA_option_in_stop_kebab_menu()  {
		try {
			stopOverviewPage.clickOn_Stop1KebabMenu();
			stopOverviewPage.selectUpdateEta();
			if(commonElementsPage.verify_AlwaysAllowbutton()) {
				commonElementsPage.clickOn_AlwaysAllowButton();
				commonElementsPage.clickOn_Ok();
			}
		/*if("ios".equalsIgnoreCase(hook.getPlatformName())){
				commonElementsPage.clickOn_AlwaysAllowButton();
				commonElementsPage.clickOn_Ok();
			}*/
			mywait.until(ExpectedConditions.visibilityOf(stopOverviewPage.title_ETA));
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}

	@Then("^ETA popover should be generated$")
	public void eta_popover_should_be_generated()  {
		try {
			Assert.assertEquals(true,stopOverviewPage.verify_EtaPopoverTitle());
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}

	@When("^User should be able to select data and time$")
	public void driver_should_be_able_to_select_data_and_time()  {
		try {
			stopOverviewPage.clickOn_DataTimeValue();
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
			mywait.until(ExpectedConditions.visibilityOf(commonElementsPage.btn_Set));
			commonElementsPage.clickOn_SetButton();
		}
		if("ios".equalsIgnoreCase(hook.getPlatformName())){
			
			mywait.until(ExpectedConditions.visibilityOf(commonElementsPage.btn_Done));
			commonElementsPage.clickOn_Done();
		}
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}

	}

	@When("^User should be able to select Traffic congestion reason code and submit$")
	public void driver_should_be_able_to_select_Accident_reason_code_and_submit()  {

		try {
			mywait.until(ExpectedConditions.visibilityOf(stopOverviewPage.title_ETA));
			stopOverviewPage.selectTrafficCongestion();
			commonElementsPage.clickOn_Done();
			if(searchPage.verify_DriverTitle()){
			mywait.until(ExpectedConditions.visibilityOf(stopOverviewPage.field_ConfirmedEta));
			}
			else {
				mywait.until(ExpectedConditions.visibilityOf(stopsPage.label_UpdateEta));
			}
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}

	}

	@Then("^Confirmed ETA field should be updated successfully$")
	public void confirmed_ETA_field_should_be_updated_successfully()  {
		try {
			Assert.assertEquals(true,stopOverviewPage.verify_ConfirmedEtaField());

		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}


}
