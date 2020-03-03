package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import managers.PageObjectManager;
import managers.UtilityManager;
import pageObjects.CommonElementsPage;
import pageObjects.DocumentsPage;
import pageObjects.StopOverviewPage;
import utility.DeviceSetup1;

public class AttachDocumentFromGallery {

	Hooks hook=new Hooks();
	DeviceSetup1 dobj =new DeviceSetup1();
	AppiumDriver<WebElement> appiumDriver= hook.getAppiumDriver();
	PageObjectManager pageObjectManager=new PageObjectManager(appiumDriver);
	UtilityManager utilityManager=new UtilityManager(appiumDriver);
	StopOverviewPage stopOverviewPage=pageObjectManager.getStopOverviewPage();
	CommonElementsPage commonElementsPage=pageObjectManager.getCommonElementsPage();
	DocumentsPage documentsPage=pageObjectManager.getDocumentsPage();
	WebDriverWait mywait=new WebDriverWait(appiumDriver, 60);

	/******
	 * 
	 *Scenario: Driver should be able to attach the document from gallery option at load and stop
	 */
	@When("^Driver taps on attach document option in load kebab menu$")
	public void driver_taps_on_attach_document_option_in_load_kebab_menu()  {

		try {

			mywait.until(ExpectedConditions.visibilityOf(stopOverviewPage.btn_StartDuty));
			stopOverviewPage.clickOn_LoadKebabMenu();
			stopOverviewPage.selectAttachDocumentMenuItem();
			mywait.until(ExpectedConditions.visibilityOf(commonElementsPage.option_Capture));
		}catch(Exception e)
		{
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}

	}

	@When("^Driver selects image and taps on Attach Document button$")
	public void driver_selects_image_and_taps_on_Attach_Document_button()  {
		try {

			//mywait.until(ExpectedConditions.visibilityOf(commonElementsPage.btn_AttachDocument));
			commonElementsPage.clickOn_AttachDocumentButton();
			mywait.until(ExpectedConditions.visibilityOf(commonElementsPage.label_SuccessPopup));

		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}

	@When("^Driver taps on attach document option in stop kebab menu$")
	public void driver_taps_on_attach_document_option_in_stop_kebab_menu()  {

		try {

			stopOverviewPage.clickOn_Stop1KebabMenu();
			stopOverviewPage.selectAttachDocumentMenuItem();
			mywait.until(ExpectedConditions.elementToBeClickable(commonElementsPage.option_Capture));
		}catch(Exception e){
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}
}
