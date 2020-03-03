package pageObjects;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
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
import managers.UtilityManager;
import utility.MobileGestureCommand;

public class DocksPage {
	
	AppiumDriver<WebElement> driver;
	//ConfigFileReader configFileReader;
	UtilityManager utilityManager=new UtilityManager(driver);
	MobileGestureCommand mobileGestureCommand=utilityManager.getMobileGestureCommand();
	
	
	public DocksPage(AppiumDriver<WebElement> driver) {
	    this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}
	
	/**
	 ******************************************************Locators**********************************************
	 */
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Docks for Stops\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Docks for Stops\"]")})
	public WebElement label_DocksForStops;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[1]"),
		@FindBy(xpath = "//android.widget.Image[@content-desc=\"pickup_icon_new\"]")})
	 WebElement icon_Pickup;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[2]"),
		@FindBy(id = "delivery_icon_new")})
	 WebElement icon_Drop;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeTextField[@name=\"Customer Id\"]"),
		@FindBy(id = "157545collapsible")})
	 WebElement icon_firstCollapsible;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeTextField[@name=\"Customer Id\"]"),
		@FindBy(id = "157545collapsible")})
	 WebElement icon_SecondCollapsible;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"\"]"),
		//@FindBy(id="material-icons-add-material-icon-id"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"\"]")})
	public WebElement icon_Create;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[19]/XCUIElementTypeImage"),
		@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[18]/XCUIElementTypeImage"),
		@FindBy(xpath = "//android.widget.Image[@content-desc=\"clock_hover_white_24\"]")})
	 WebElement icon_Update;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[19]/XCUIElementTypeImage"),
		@FindBy(xpath = "//android.widget.Image[@content-desc=\"delete_hover_white_24\"]")})
	 WebElement icon_Delete;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeTextField[@name=\"Customer Id\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"done\"]")})
	 WebElement icon_Done;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Dock Commitment does not exist\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Dock Commitment does not exist\"]")})
	 WebElement label_DockCommitmentDoesNotExist;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Are you sure you want to delete the Dock Commitment?\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Dock Commitment does not exist\"]")})
	 WebElement label_DeletePopup;
	
	/**
	 ******************************************************Functions**********************************************
	 */
	
	public boolean verify_CreateIcon() {
		
		return icon_Create.isDisplayed();
	}
	
	public void clickOn_CreateIcon() {
		
		//mobileGestureCommand.tapElement_XCTest(icon_Create);
		icon_Create.click();
		try { Thread.sleep(5000);}
		catch (InterruptedException e) {}
	 }
	public void clickOn_UpdateIcon() {
		icon_Update.click();
		try { Thread.sleep(3000);}
		catch (InterruptedException e) {}
	}
	public void clickOn_DeleteIcon() {
		icon_Delete.click();
		try { Thread.sleep(2000);}
		catch (InterruptedException e) {}
	}
	public boolean verify_DeleteIcon() {
		return icon_Delete.isDisplayed();
	}
	public boolean verify_DocksForStopsLabel() {
		return label_DocksForStops.isDisplayed();
	}
	public boolean verify_DockCommitmentDoesNotExistStatus() {
		
		return label_DockCommitmentDoesNotExist.isDisplayed();
	}
	public void selectPickupStop() {
		
		icon_Pickup.click();
		try { Thread.sleep(2000);}
		catch (InterruptedException e) {}
		
	}
	public void selectDropStop() {
		
		/*Map<String, Object> params = new HashMap<String, Object>();
		params.put("direction", "down");
		driver.executeScript("mobile: scroll", params);*/
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> swipeObject = new HashMap<String, String>();
        swipeObject.put("direction", "down");
       swipeObject.put("element", icon_Drop.getId());
        js.executeScript("mobile:swipe", swipeObject); */
		
		//mobileGestureCommand.swipeToDirection_iOS_XCTest(icon_Drop,"d");
		icon_Drop.click();
	}
	public void selectDone() {
		icon_Done.click();
	}
	public boolean verify_DeletePopupLabel() {
		return label_DeletePopup.isDisplayed();
	}
	
	
}
