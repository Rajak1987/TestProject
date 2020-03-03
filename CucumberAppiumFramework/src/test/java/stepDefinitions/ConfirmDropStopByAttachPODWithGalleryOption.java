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
import pageObjects.OfferedPage;
import pageObjects.ProcessDeliveryPage;
import pageObjects.SearchPage;
import pageObjects.StopOverviewPage;
import utility.DeviceSetup1;

public class ConfirmDropStopByAttachPODWithGalleryOption {

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
	 *Scenario:Driver should be able to confirm the drop stop by attaching hard copy of POD document from gallery option
	 */

	@When("^Driver should be able to open gallery from gallery option$")
	public void driver_should_be_able_to_open_gallery_from_gallery_option()  {
		try {
		commonElementsPage.selectGallery();
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
			mywait.until(ExpectedConditions.visibilityOf(commonElementsPage.option_PhotosDrive));
		}
		}
		catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}

	}

	@When("^Driver should be able to select image from gallery$")
	public void driver_should_be_able_to_select_google_photos_driver()  {

		try {
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
			commonElementsPage.selectPhotosDrive();
		}
		mywait.until(ExpectedConditions.visibilityOf(commonElementsPage.file_GooglePhotos));
		commonElementsPage.clickOn_PhotosFile();
		mywait.until(ExpectedConditions.visibilityOf(commonElementsPage.images_GooglePhotos));
		commonElementsPage.selectPhoto();
		try { Thread.sleep(3000);}
		catch (InterruptedException e) {}
		}
		catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
 
	}
	@When("^Driver selects gallery image and taps on Attach POD button$")
	public void driver_selects_gallery_image_and_taps_on_attach_pod_button() {
		
		try {	
		processDeliveryPage.clickOn_AttachPod();
			mywait.until(ExpectedConditions.visibilityOf(commonElementsPage.label_SuccessPopup));
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}

	}
	@Then("^Gallery document should be uploaded successfully$")
	public void Captured_document_should_be_uploaded_successfully()  {
		
		try {
			Assert.assertEquals(true,commonElementsPage.verify_SuccessPopupLabel());
			commonElementsPage.clickOn_Ok();
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}

	}
	}


