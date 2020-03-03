package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.touch.TouchActions;


import dataProviders.ConfigFileReader;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.WebElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.TouchAction;

import managers.FileReaderManager;

public class UserSettingsPage {
	

	AppiumDriver<WebElement> driver;
	ConfigFileReader configFileReader;
	WebDriverWait mywait;
	
	
	public UserSettingsPage(AppiumDriver<WebElement> driver) {
	    this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}
	
	/**
	 ******************************************************Locators**********************************************
	 */
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name=\"Submit\"]"),
		@FindBy(id = "profile-image-camera")})
	private WebElement icon_camera;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name=\"Log in\"]"),
		@FindBy(xpath = "//*[contains(text(), 'Back')]")})
	private WebElement btn_Back;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeSwitch"),
		@FindBy(id = "//*[contains(text(), 'Cancel')]")})
	private WebElement btn_Cancel;
	
	@FindAll({@FindBy(how = How.XPATH, using =  "//XCUIElementTypeButton[@name=\"Continue\"]"),
		@FindBy(id = "//*[contains(text(), 'Save')]")})
	private WebElement btn_Save;
	
	@FindAll({@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewFlipper/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.view.View[4]/android.view.View/android.widget.EditText"),
		@FindBy(id = "license-number-field")})
	private WebElement txtbx_License;
	
	@FindAll({@FindBy(how = How.ID, using = "dot-field"),
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewFlipper/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.view.View[6]/android.view.View/android.widget.EditText"),
		@FindBy(name = "Not with TMUSER-QA2017?")})
	private WebElement txtbx_DotId;
	
	@FindAll({@FindBy(how = How.ID, using = "tractor-number-field"),
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewFlipper/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.view.View[8]/android.view.View/android.widget.EditText"),
		@FindBy(name = "Not with TMUSER-QA2017?")})
	private WebElement txtbx_TractorNumber;
	
	@FindAll({@FindBy(how = How.ID, using = "geo-data-toggle-button"),
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewFlipper/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.view.View[10]/android.view.View/android.view.View/android.view.View"),
		@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")})
	private WebElement tbtn_SendMyLocation;
	
	/**
	 ******************************************************Functions**********************************************
	 */
	
	public void setLicenseNumber(String strLicense) {
		TouchAction action = new TouchAction(driver);
		action.longPress(txtbx_License);
		action.perform();
		txtbx_License.sendKeys(strLicense);
	 }
	
	public void setDotId(String strDotId) {
		
		TouchAction action = new TouchAction(driver);
		action.longPress(txtbx_DotId);
		action.perform();
		txtbx_DotId.sendKeys(strDotId);
	 }
	public void setTractorNumber(String strTractorNumber) {
		TouchAction action = new TouchAction(driver);
		action.longPress(txtbx_TractorNumber);
		action.perform();
		txtbx_TractorNumber.sendKeys(strTractorNumber);
	 }
	public void clickOn_CameraIcon() {
		icon_camera.click();
		 try { Thread.sleep(1000);}
			catch (InterruptedException e) {}
	 }
	public void clickOn_Back() {
		 btn_Back.click();
		 try { Thread.sleep(5000);}
			catch (InterruptedException e) {}
	 }
	public void clickOn_Cancel() {
		 btn_Cancel.click();
	 }
	public void clickOn_Save() {
		 btn_Save.click();
		 try { Thread.sleep(30000);}
			catch (InterruptedException e) {}
	 }
	public void clickOn_SendMyLocationButton() {
		tbtn_SendMyLocation.click();
		 try { Thread.sleep(30000);}
			catch (InterruptedException e) {}
	 }
	
	
	
}


