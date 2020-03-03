package stepDefinitions;

import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.WebElement;
import managers.PageObjectManager;
import managers.UtilityManager;
import pageObjects.CommonElementsPage;
import pageObjects.CreateDockCommitmentPages;
import pageObjects.DocksPage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import pageObjects.SettingsPage;
import pageObjects.StopOverviewPage;
import pageObjects.UserSettingsPage;
import utility.DeviceSetup1;

public class UserSettings {

	AppiumDriver<WebElement> appiumDriver;
	DeviceSetup1 dobj =new DeviceSetup1();
	SettingsPage settingsPage;
	UserSettingsPage userSettingsPage;
	CommonElementsPage commonElementsPage;
	PageObjectManager pageObjectManager;
	ConfigFileReader configFileReader;
	Hooks hook;
	WebDriverWait mywait;
	UtilityManager utilityManager;
	Set <String> availableContexts;


	@Given("^Driver navigates to user settings page$")
	public void driver_navigates_to_user_settings_page() throws Throwable {
		System.out.println("Step:1.........................");
		hook = new Hooks();
		appiumDriver = hook.getAppiumDriver();
		pageObjectManager=new PageObjectManager(appiumDriver);
		userSettingsPage=pageObjectManager.getUserSettingsPage();
		settingsPage=pageObjectManager.getSettingsPage();
		commonElementsPage=pageObjectManager.getCommonElementsPage();
		settingsPage.clickOn_HamburgerIcon();
		settingsPage.clickOn_userSettingsTab();
	}

	@When("^Driver chooses gallery by tap on camera icon$")
	public void driver_chooses_gallery_by_tap_on_camera_icon() {
		System.out.println("Available Contexts......."+appiumDriver.getContextHandles());
		availableContexts = appiumDriver.getContextHandles();
		System.out.println("Total No of Context Found Before reaching WebView = "+ availableContexts.size());
		System.out.println("Context Name is "+ availableContexts);
		for(String context:availableContexts)
		{
			if(context.contains("WEBVIEW"))
			{
				System.out.println("Current Name is..............." +context);
				appiumDriver.context(context);
				break;
			}
		}
		
		userSettingsPage.clickOn_CameraIcon();
		commonElementsPage.selectGallery();
	}

	@When("^Driver selects photos option to open stored images$")
	public void driver_selects_photos_option_to_open_stored_images() {
		for(String context : availableContexts) {
			if(context.contains("NATIVE")){
				System.out.println("We are Back to " + context);
				appiumDriver.context(context);

			}
		}
		commonElementsPage.selectPhotosDrive();
		commonElementsPage.clickOn_PhotosFile();
	}

	@When("^Driver selects photo and saved$")
	public void driver_selects_photo_and_saved() {

		System.out.println("Available Contexts......."+appiumDriver.getContextHandles());
		availableContexts = appiumDriver.getContextHandles();
		System.out.println("Total No of Context Found Before reaching WebView = "+ availableContexts.size());
		System.out.println("Context Name is "+ availableContexts);
		for(String context:availableContexts)
		{
			if(context.contains("WEBVIEW"))
			{
				System.out.println("Current Name is..............." +context);
				appiumDriver.context(context);
				break;
			}
		}
		commonElementsPage.clickOn_Select();
		userSettingsPage.clickOn_Save();

	}

	/*@Then("^success popup message should be generated$")
	public void success_popup_message_should_be_generated() {
		Assert.assertEquals(true,commonElementsPage.verify_SuccessPopupLabel());
		commonElementsPage.clickOn_Ok();
	}*/

	@When("^Driver chooses camera by tap on camera icon$")
	public void driver_chooses_camera_by_tap_on_camera_icon() {

		userSettingsPage.clickOn_CameraIcon();
		commonElementsPage.selectCapture();

	}

	@When("^Driver captures image and selected$")
	public void driver_captures_image_and_selected() {

		for(String context : availableContexts) {
			if(context.contains("NATIVE")){
				System.out.println("We are Back to " + context);
				appiumDriver.context(context);

			}
		}
		commonElementsPage.clickOn_CameraShutterButton();
		availableContexts = appiumDriver.getContextHandles();
		System.out.println("Total No of Context Found Before reaching WebView = "+ availableContexts.size());
		System.out.println("Context Name is "+ availableContexts);
		for(String context:availableContexts)
		{
			if(context.contains("WEBVIEW"))
			{
				System.out.println("Current Name is..............." +context);
				appiumDriver.context(context);
				break;
			}
		}

		commonElementsPage.clickOn_Select();

	}

	@When("^Driver saves selected image$")
	public void driver_saves_selected_image()  {
		userSettingsPage.clickOn_Save();
	}

	@When("^Driver long press on License number field and enter \"(.*)\"$")
	public void driver_long_press_on_License_number_field_and_enter_LIC(String licnum) {
		userSettingsPage.setLicenseNumber(licnum);

	}

	@When("^Driver long press on DOT ID field and enter \"(.*)\"$")
	public void driver_long_press_on_DOT_ID_field_and_enter_DOT(String dotid) {
		userSettingsPage.setDotId(dotid);

	}

	@When("^Driver long press on tractor number field and enter \"(.*)\"$")
	public void driver_long_press_on_tractor_number_field_and_enter_TN(String tn) {
		userSettingsPage.setTractorNumber(tn);

	}

	@When("^Driver saves those canges by tap on save button$")
	public void driver_saves_those_canges_by_tap_on_save_button() {
		userSettingsPage.clickOn_Save();
	}

}
