package stepDefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.UtilityManager;
import pageObjects.CommonElementsPage;
import pageObjects.OfferedPage;
import pageObjects.ProcessDeliveryPage;
import pageObjects.SearchPage;
import pageObjects.StopOverviewPage;
import utility.DeviceSetup1;

public class ConfirmDropStopByAttachPODWithCaptureOption {
	
	Hooks hook=new Hooks();
	DeviceSetup1 dobj =new DeviceSetup1();
	AppiumDriver<WebElement> appiumDriver= hook.getAppiumDriver();
	PageObjectManager pageObjectManager=new PageObjectManager(appiumDriver);
	UtilityManager utilityManager=new UtilityManager(appiumDriver);
	SearchPage searchPage= pageObjectManager.getSearchPage();
	StopOverviewPage stopOverviewPage=pageObjectManager.getStopOverviewPage();
	CommonElementsPage commonElementsPage=pageObjectManager.getCommonElementsPage();
	OfferedPage offeredPage= pageObjectManager.getOfferedPage();
	ProcessDeliveryPage processDeliveryPage=pageObjectManager.getProcessDeliveryPage();
	WebDriverWait mywait=new WebDriverWait(appiumDriver, 60);

/******
 * 
 *Scenario:Driver should be able to confirm the drop stop by attaching hardcopy of POD document from camera capture option
 */

	@Given("^Driver selects \"([^\"]*)\" assignment in ON DUTY card$")
	public void driver_selects_assignment_in_offered_tab(String assignmentId) {
		if("ios".equalsIgnoreCase(hook.getPlatformName())){
		searchPage.clickOn_OnDutyLoadId(assignmentId);
		}
		mywait=new WebDriverWait(appiumDriver, 60);
		mywait.until(ExpectedConditions.visibilityOf(stopOverviewPage.label_OnDuty));
	}
	
	@When("^Driver taps on process delivery button$")
	public void driver_taps_on_process_delivery_tab()  {
	    
		if("ios".equalsIgnoreCase(hook.getPlatformName())){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("direction", "down");
		appiumDriver.executeScript("mobile: scroll", params);
		}
		stopOverviewPage.clickOn_ProcessDeliveryButton();
		mywait.until(ExpectedConditions.visibilityOf(stopOverviewPage.title_DeliveryOptionsPopover));
	}

	@Then("^delivery options popover should be generated$")
	public void delivery_options_popover_should_be_generated()  {
	    
		Assert.assertEquals(true,stopOverviewPage.verify_DeliveryOptionsPopoverTitle());
	}

	@When("^Driver chooses Attach POD option and proceed to process delivery page$")
	public void driver_chooses_Attach_POD_option_and_proceed_to_process_delivery_page()  {
	    
		stopOverviewPage.selectAttachPodOption();
		stopOverviewPage.clickOn_ProceedButton();
		mywait.until(ExpectedConditions.visibilityOf(processDeliveryPage.title_ProcessDeliveryPage));
	}

	@When("^Driver taps on plus icon$")
	public void driver_taps_on_plus_icon()  {
		
		processDeliveryPage.clickOn_plusIcon();
		mywait.until(ExpectedConditions.elementToBeClickable(commonElementsPage.option_Capture));
	}

	@Then("^Attach Document options popover should be generated$")
	public void attach_Document_opotions_opover_should_be_generated()  {
	   
		
		Assert.assertEquals(true,commonElementsPage.verify_AttachDocumentPopoverTitle());
	
	}

	@When("^Driver should be able to open camera from cature option$")
	public void driver_should_be_able_to_open_camera_from_cature_option()  {
		
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
		commonElementsPage.selectCapture();
		mywait.until(ExpectedConditions.visibilityOf(commonElementsPage.sbtn_Camera));
		}
		if("ios".equalsIgnoreCase(hook.getPlatformName())){
			System.out.println("**********************iOS simulator doesnot support camera*******************");
		}
	}

	@When("^Driver should be able to capture photo$")
	public void driver_should_be_able_to_capture_photo()  {
		
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
		commonElementsPage.clickOn_CameraShutterButton();
		commonElementsPage.clickOn_CameraDone();
		mywait.until(ExpectedConditions.visibilityOf(processDeliveryPage.btn_AttachPod));
		}
		if("ios".equalsIgnoreCase(hook.getPlatformName())){
			System.out.println("**********************iOS simulator doesnot support camera*******************");
			(new TouchAction(appiumDriver)).tap(FileReaderManager.getInstance().getConfigReader().getIphone7_AttachDocumentPopoverClosebutton_X(), FileReaderManager.getInstance().getConfigReader().getIphone7_AttachDocumentPopoverClosebutton_Y()).perform();
		}
	}

	@When("^Driver selects captured image and taps on Attach POD button$")
	public void driver_selects_image_and_taps_on_Attach_POD_button()  {
		//processDeliveryPage.setAttachPodDescription("Camera Attachment");
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
		processDeliveryPage.clickOn_AttachPod();
		mywait.until(ExpectedConditions.visibilityOf(commonElementsPage.label_SuccessPopup));
		}
		if("ios".equalsIgnoreCase(hook.getPlatformName())){
			System.out.println("**********************iOS simulator doesnot support camera*******************");
		}
	}

	@Then("^Captured document should be uploaded successfully$")
	public void Captured_document_should_be_uploaded_successfully()  {
		
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
		Assert.assertEquals(true,commonElementsPage.verify_SuccessPopupLabel());
		commonElementsPage.clickOn_Ok();
		mywait.until(ExpectedConditions.visibilityOf(commonElementsPage.btn_Submit));
		}
		if("ios".equalsIgnoreCase(hook.getPlatformName())){
			System.out.println("**********************iOS simulator doesnot support camera*******************");
			}
	}

	@When("^Driver should be able to launch confirm stop popover from submit button$")
	public void driver_should_be_able_to_launch_confirm_stop_popover_from_submit_button()  {
	   
		
		commonElementsPage.clickOn_Submit();
		mywait.until(ExpectedConditions.visibilityOf(commonElementsPage.title_ConfirmStop));
		
	}

	@Then("^Stop Status should be changed to delivery complete$")
	public void stop_Status_should_be_changed_to_POD_complete()  {
	    
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
		Assert.assertEquals(true,stopOverviewPage.verify_DeliveryCompleteStatus());
		}
		if("ios".equalsIgnoreCase(hook.getPlatformName())){
			System.out.println("**********************iOS simulator doesnot support camera*******************");
		}
	}

}
