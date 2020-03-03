package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import managers.PageObjectManager;
import managers.UtilityManager;
import pageObjects.CommonElementsPage;
import pageObjects.LoadOverviewPage;
import pageObjects.StopOverviewPage;
import pageObjects.StopsPage;
import utility.DeviceSetup1;

public class CarrUpdateEta {
	Hooks hook=new Hooks();
	DeviceSetup1 dobj =new DeviceSetup1();
	AppiumDriver<WebElement> appiumDriver= hook.getAppiumDriver();
	PageObjectManager pageObjectManager=new PageObjectManager(appiumDriver);
	UtilityManager utilityManager=new UtilityManager(appiumDriver);
	StopOverviewPage stopOverviewPage=pageObjectManager.getStopOverviewPage();
	CommonElementsPage commonElementsPage=pageObjectManager.getCommonElementsPage();
	LoadOverviewPage loadOverviewPage=pageObjectManager.getLoadOverviewPage();
	StopsPage stopsPage=pageObjectManager.getStopsPage();
	WebDriverWait mywait=new WebDriverWait(appiumDriver, 120);

	/******
	 * 
	 *Scenario: Carrier should be able to update the ETA for stop
	 */

	@When("^User selects stop one from stops tab$")
	public void user_selects_stop_one_from_stops_tab()  {
		try {
			loadOverviewPage.clickOn_StopsTab();
			mywait.until(ExpectedConditions.visibilityOf(stopsPage.tab_StopOne));
			stopsPage.clickOn_StopOneTab();
			mywait.until(ExpectedConditions.visibilityOf(stopsPage.label_UpdateEta));
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}

	}

	@When("^User taps on update ETA option$")
	public void user_taps_on_update_ETA_option()  {
		try {
			stopsPage.clickOn_UpdateEtaLink();
			mywait.until(ExpectedConditions.visibilityOf(stopOverviewPage.title_ETA));
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}

}
