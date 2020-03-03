package stepDefinitions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
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
import pageObjects.UpdateDockCommitmentPage;
import utility.DeviceSetup1;

public class UpdateDockCommitment {
	
	
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
	UpdateDockCommitmentPage updateDockCommitmentPage = pageObjectManager.getUpdateDockCommitmentPage();
	LoginPage loginPage=pageObjectManager.getLoginPage();
	LoadOverviewPage loadOverviewPage=pageObjectManager.getLoadOverviewPage();
	WebDriverWait mywait=new WebDriverWait(appiumDriver, 60);
	
	@When("^Select stop US Coast Fremont by tap on stop type icon and click on update icon$")
	public void select_stop_US_Coast_Fremont_by_tap_on_stop_type_icon_and_verify_update_icon_should_be_displayed()  {
		System.out.println("Step:2.........................");
		
		docksPage.selectPickupStop();
		docksPage.clickOn_UpdateIcon();
		
	    	}

	@Then("^control should be navigated to update dock commitment page$")
	public void control_should_be_navigated_to_update_dock_commitment_page()  {
		
		System.out.println("Step:3.........................");
		Assert.assertEquals(true,updateDockCommitmentPage.verify_PageTitle());
	    
	}

	@When("^update start date as current date and time$")
	public void update_start_date_as_current_date_and_time()  {
		System.out.println("Step:4.........................");
		updateDockCommitmentPage.clickOn_StartDate();
		commonElementsPage=pageObjectManager.getCommonElementsPage();
		commonElementsPage.clickOn_Done();
	}

	@Then("^verify that the end date should be auto updated as start date plus duration$")
	public void verify_that_the_end_date_should_be_auto_updated_as_start_date_plus_duration() {
		System.out.println("Step:5.........................");
		SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
		Date d1=null;
		Date d2=null;
		try {
	         d1 = format.parse(updateDockCommitmentPage.getStartDate());
	         d2 = format.parse(updateDockCommitmentPage.getEndDate());
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
		long diff = d2.getTime() - d1.getTime();
		long diffHours = diff / (60 * 60 * 1000);
		System.out.println(diffHours);
		String durationValue=updateDockCommitmentPage.getDuration();
		long durationValue1=0;
		if("02:00".equalsIgnoreCase(durationValue)) {
			 durationValue1=2;
		}
		System.out.println(durationValue1);
		Assert.assertEquals(diffHours,durationValue1);
		}

	@When("^click on submit button$")
	public void click_on_submit_button()  {
		System.out.println("Step:6.........................");
		commonElementsPage.clickOn_Submit();
		commonElementsPage.verify_SuccessPopupLabel();
		commonElementsPage.clickOn_Ok();
		
	}

	@Then("^control should be navigated to docks page$")
	public void control_should_be_navigated_to_docks_page() {
		System.out.println("Step:7.........................");
		Assert.assertEquals(true,docksPage.verify_DocksForStopsLabel());
		
	}
	
}
