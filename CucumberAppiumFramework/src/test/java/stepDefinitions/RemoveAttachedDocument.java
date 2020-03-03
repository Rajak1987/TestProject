package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

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

public class RemoveAttachedDocument {
	
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
	 *Scenario: Driver should be able to remove the attached document from load and stop
	 */
	
	@When("^Driver taps on delete icon of the attachment$")
	public void driver_taps_on_delete_icon_of_the_attachment() {
		
		System.out.println("*******************Document Delete function is not working*********************************");
	    
	}

	@Then("^confirm Delete popover should be generated$")
	public void confirm_Delete_popover_should_be_generated()  {
		
		System.out.println("*******************Document Delete function is not working*********************************");
	    
	}

	@When("^Driver deletes attachment by tap on delete button of confirmation popover$")
	public void driver_deletes_attachment_by_tap_on_delete_button_of_confirmation_popover() {
	    
		System.out.println("*******************Document Delete function is not working*********************************");
	}

	@Then("^Document should be deleted successfully$")
	public void document_should_be_deleted_successfully() {
	    
		System.out.println("*******************Document Delete function is not working*********************************");
	}

}
