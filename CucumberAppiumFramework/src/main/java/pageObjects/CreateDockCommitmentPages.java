package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import managers.FileReaderManager;
import stepDefinitions.Hooks;

public class CreateDockCommitmentPages {
	AppiumDriver<WebElement> driver;
	//ConfigFileReader configFileReader;
	Hooks hook=new Hooks();
	
	
	public CreateDockCommitmentPages(AppiumDriver<WebElement> driver) {
	    this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}
	
	/**
	 ******************************************************Locators**********************************************
	 */
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"navigate_before\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"navigate_before\"]"),
		@FindBy(id="stopLeftNavbutton")})
	private WebElement icon_NavigateBeforeStop;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"navigate_next\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"navigate_next\"]"),
		@FindBy(id="stopRightNavbutton")})
	private WebElement icon_NavigateNextStop;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"event\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"event\"]"),
		@FindBy(id="datePickerImage")})
	private WebElement icon_DatePicker;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"query_builder\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"query_builder\"]")})
	private WebElement icon_TimePicker;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"timer\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"timer\"]")})
	private WebElement icon_Timer;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"09:00 - 11:00\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"09:00 - 11:00\"]")})
	private WebElement btn_TimeSlot;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeTextField[@name=\"Customer Id\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"MOBDCHAN-DOCK1\"]")})
	private WebElement label_DockId;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name='Flexible on Start Time']/following-sibbling::*[1]"),
		@FindBy(id="dock-toggle-button"),
		@FindBy(id="ext-element-720"),
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewFlipper/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[16]/android.view.View/android.view.View"),
		@FindBy(id = "dock-toggle-button")})
	private WebElement btn_FlexibleOnStartTime;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[3]"),
		@FindBy(id="android:id/button1")})
	 WebElement field_Duration;
	
	/**
	 ******************************************************Functions**********************************************
	 */
	
	public void clickOn_NavigateBeforeStop() {
		//(new TouchAction(driver)).tap(FileReaderManager.getInstance().getConfigReader().getNavigateNextStop_x(), FileReaderManager.getInstance().getConfigReader().getNavigateStop_y()).perform();
		icon_NavigateBeforeStop.click();
	}
	
	public void clickOn_NavigateNextStop() {
		//(new TouchAction(driver)).tap(FileReaderManager.getInstance().getConfigReader().getNavigateNextStop_x(), FileReaderManager.getInstance().getConfigReader().getNavigateStop_y()).perform();
		icon_NavigateNextStop.click();
	}
	
	public boolean verify_TimeSlot() {
		return btn_TimeSlot.isDisplayed();
	}
	public boolean verify_DockId() {
		return label_DockId.isDisplayed();
	}
	public void clickOn_DatePicker() {
		 //(new TouchAction(driver)).tap(FileReaderManager.getInstance().getConfigReader().getDockIcons_x(), FileReaderManager.getInstance().getConfigReader().getDatePicker_y()).perform();
		icon_DatePicker.click();
		try { Thread.sleep(1000);}
		catch (InterruptedException e) {}
	 }
	public void clickOn_TimePicker() {
		//(new TouchAction(driver)).tap(FileReaderManager.getInstance().getConfigReader().getDockIcons_x(), FileReaderManager.getInstance().getConfigReader().getTimePicker_y()).perform();
		icon_TimePicker.click();
		try { Thread.sleep(2000);}
		catch (InterruptedException e) {}
	 }
	public void clickOn_Timer() {
		//(new TouchAction(driver)).tap(FileReaderManager.getInstance().getConfigReader().getDockIcons_x(), FileReaderManager.getInstance().getConfigReader().getTimer_y()).perform();
		
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
			driver.findElementByAccessibilityId("timer").click();
		}
		else {
		icon_Timer.click();
		}
		try { Thread.sleep(1000);}
		catch (InterruptedException e) {}
	 }
	public void clickOn_FlexibleOnStartTime() {
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
			(new TouchAction(driver)).tap(FileReaderManager.getInstance().getConfigReader().getPixelC_FlexibleOnStartTime_x(), FileReaderManager.getInstance().getConfigReader().getPixelC_FlexibleOnStartTime_y()).perform();
		}
		if("ios".equalsIgnoreCase(hook.getPlatformName())){
			(new TouchAction(driver)).tap(FileReaderManager.getInstance().getConfigReader().getIphone7_FlexibleOnStartTime_x(), FileReaderManager.getInstance().getConfigReader().getIphone7_FlexibleOnStartTime_y()).perform();
		}
		
	//btn_FlexibleOnStartTime.click();
	}
	
	public void selectTimeSlot() {
		btn_TimeSlot.click();
	}
	public void swipeDockspage() {
		(new TouchAction(driver)).moveTo((WebElement)label_DockId );
	}
	
	public String getDuraionValue() {
		return field_Duration.getAttribute("value");
		
	}
	
	
	
	
	
}


