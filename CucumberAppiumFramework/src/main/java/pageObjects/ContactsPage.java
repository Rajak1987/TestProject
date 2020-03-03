package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import managers.UtilityManager;
import utility.MobileGestureCommand;

public class ContactsPage {

	AppiumDriver<WebElement> driver;
	//ConfigFileReader configFileReader;
	UtilityManager utilityManager=new UtilityManager(driver);
	MobileGestureCommand mobileGestureCommand=utilityManager.getMobileGestureCommand();
	
	public ContactsPage(AppiumDriver<WebElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}
	
	/**
	 ******************************************************Locators**********************************************
	 */
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name=\"SMS 234567\"]"),
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button[1]")})
	public WebElement option_Sms;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name=\"Call 234567\"]"),
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button[2]")})
	public WebElement option_Call;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name=\"Email: mobile_user@jda.com\"]"),
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button[3]")})
	public WebElement option_Email;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"XXXX\"]"),
		@FindBy(id = "android:id/title")})
	public WebElement option_Messanger;
	
	@FindAll({@FindBy(how = How.ID, using = "android:id/button_once"),
		@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"XXXX\"]")})
	public WebElement option_JustOnce;
	
	@FindAll({@FindBy(how = How.ID, using = "//XCUIElementTypeStaticText[@name=\"Messages\"]"),
		@FindBy(id = "com.google.android.apps.messaging:id/compose_message_text")})
	public WebElement txtbx_Message;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]"),
		@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"XXXX\"]")})
	public WebElement icon_Back;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.TextView[@content-desc=\"Create new contact\"]"),
		@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"XXXX\"]")})
	public WebElement btn_CreateNewContact;
	
	@FindAll({@FindBy(how = How.ID, using = "com.google.android.gm:id/welcome_tour_title"),
		@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"XXXX\"]")})
	public WebElement label_WelcomeToGmail;
	
	@FindAll({@FindBy(how = How.ID, using = "com.android.dialer:id/floating_action_button"),
		@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"XXXX\"]")})
	public WebElement icon_DailPad;
	
	@FindAll({@FindBy(how = How.ID, using = "com.android.dialer:id/emptyListViewAction"),
		@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"XXXX\"]")})
	public WebElement label_AddFavorite;

	/**
	 ******************************************************Functions**********************************************
	 */
	
	public void selectSmsOption() {
		option_Sms.click();
	}
	public void selectCallOption() {
		option_Call.click();
	}
	public void selectEmailOption() {
		option_Email.click();
	}
	public boolean verify_ContactsPopover() {
		return option_Sms.isDisplayed();
	}
	public void selectMessanger() {
		option_Messanger.click();
	}
	public void selectJustOnce() {
		option_JustOnce.click();
	}
	public boolean verify_MessageScreen() {
		return txtbx_Message.isDisplayed();
	}
	public boolean verify_DailPadScreen() {
		return btn_CreateNewContact.isDisplayed();
	}
	public boolean verify_GmailScreen() {
		return label_WelcomeToGmail.isDisplayed();
	}
}
