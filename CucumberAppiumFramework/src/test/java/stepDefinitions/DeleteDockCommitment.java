package stepDefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.WebElement;
import managers.PageObjectManager;
import managers.UtilityManager;
import pageObjects.CommonElementsPage;
import pageObjects.CreateDockCommitmentPages;
import pageObjects.DocksPage;
import pageObjects.SearchPage;
import pageObjects.StopOverviewPage;

public class DeleteDockCommitment {
	
	AppiumDriver<WebElement> appiumDriver;
	SearchPage searchPage;
	StopOverviewPage stopOverviewPage;
	CreateDockCommitmentPages createDockCommitmentPages;
	CommonElementsPage  commonElementsPage;
	DocksPage docksPage;
	PageObjectManager pageObjectManager;
	Hooks hook;
	UtilityManager utilityManager;
	WebDriverWait mywait;
	
	@Given("^Driver selects \"([^\"]*)\" and navigate to docks tab page$")
	public void Driver_selects_and_navigate_to_docks_tab_page(String assignmentId){
		
		hook = new Hooks();
		appiumDriver = hook.getAppiumDriver();
		pageObjectManager=new PageObjectManager(appiumDriver);
		utilityManager=new UtilityManager(appiumDriver);
		searchPage = pageObjectManager.getSearchPage();
		searchPage.setSearch(assignmentId);
		searchPage.clickOn_SearchByLoadId();
		searchPage.clickOn_LoadId(assignmentId);
		stopOverviewPage= pageObjectManager.getStopOverviewPage();
		stopOverviewPage.clickOn_DocksTab();
		docksPage=pageObjectManager.getDocksPage();
		createDockCommitmentPages=pageObjectManager.getCreateDockCommitmentPages();
		commonElementsPage=pageObjectManager.getCommonElementsPage();
		
	
	}
	
	@When("^Select stop Hanford store by tap on stop type icon and verify delete icon should be displayed$")
	public void select_stop_Hanford_store_by_tap_on_stop_type_icon_and_verify_delete_icon_should_be_displayed()  {
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("direction", "down");
		appiumDriver.executeScript("mobile: scroll", params);	
		docksPage.selectDropStop();
	    Assert.assertEquals(true,docksPage.verify_DeleteIcon());
		
	}
	

	@When("^click on delete icon$")
	public void click_on_delete_icon()  {
		
			docksPage.clickOn_DeleteIcon();
		
	}

	@Then("^confirm delete popup should be generated$")
	public void confirm_delete_popup_should_be_generated() {
		
		Assert.assertEquals(true,docksPage.verify_DeletePopupLabel());
		
	}

	@When("^click on delete button of popup$")
	public void click_on_delete_button_of_popup()  {
		
		
		commonElementsPage.clickOn_Delete();
		
	}

	@Then("^success message should be generated$")
	public void success_message_should_be_generated()  {
		
		Assert.assertEquals(true,commonElementsPage.verify_SuccessPopupLabel());
		
	}

	@When("^click on ok button of success popup$")
	public void click_on_ok_button_of_success_popup()  {
		
		commonElementsPage.clickOn_Ok();
	    
		
	}

	@Then("^control should be navigated to docks page and dock commitment does not exists status should be displayed for the stop$")
	public void control_should_be_navigated_to_docks_page_and_dock_commitment_does_not_exists_status_should_be_displayed_for_the_stop()  {
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("direction", "down");
		appiumDriver.executeScript("mobile: scroll", params);
		Assert.assertEquals(true, docksPage.verify_DockCommitmentDoesNotExistStatus());
		
	}

}
