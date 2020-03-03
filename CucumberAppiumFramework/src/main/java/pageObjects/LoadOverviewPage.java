package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import managers.UtilityManager;
import stepDefinitions.Hooks;
import utility.MobileGestureCommand;

public class LoadOverviewPage {

	AppiumDriver<WebElement> driver;
	//ConfigFileReader configFileReader;
	UtilityManager utilityManager=new UtilityManager(driver);
	MobileGestureCommand mobileGestureCommand=utilityManager.getMobileGestureCommand();
	Hooks hook=new Hooks();




	public LoadOverviewPage(AppiumDriver<WebElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}

	/**
	 ******************************************************Locators**********************************************
	 */
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Load Overview\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Load Overview\"]")})
	public WebElement tab_LoadOverview;

	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Stops\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Stops\"]")})
	public WebElement tab_Stops;

	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Shipments\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Shipments\"]")})
	public WebElement tab_Shipments;

	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Tracking Details\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Tracking Details\"]")})
	public WebElement tab_TrackingDetails;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Respond To Tender\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Respond To Tender\"]")})
	public WebElement link_RespondToTender;
	
	@FindAll({@FindBy(how = How.XPATH, using = "(//XCUIElementTypeStaticText[@name=\"Respond To Tender\"])[1]"),
		@FindBy(xpath = "(//android.view.View[@content-desc=\"Respond To Tender\"])[1]")})
	public WebElement title_RespondToTender;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Accept\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Accept\"]")})
	public WebElement rbtn_Accept;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Reject\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Reject\"]")})
	public WebElement rbtn_Reject;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"No Load Information Available\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"No Load Information Available\"]")})
	public WebElement label_NoLoadInformationAvailable;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Tender Accepted\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Tender Accepted\"]")})
	public WebElement label_TenderAccepted;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Tender Rejected\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Tender Rejected\"]")})
	public WebElement label_TenderRejected;

	/**
	 ******************************************************Functions**********************************************
	 */
	public boolean verify_TenderRejectedLable() {
		try {
		return label_TenderRejected.isDisplayed();
		}catch(NoSuchElementException e){
	        return false;
	    }
	}
	public boolean verify_TenderAcceptedLable() {
		try {
		return label_TenderAccepted.isDisplayed();
		}catch(NoSuchElementException e){
	        return false;
	    }
	}
	public boolean verify_NoLoadInformationAvailableLable() {
		try {
		return label_NoLoadInformationAvailable.isDisplayed();
		}catch(NoSuchElementException e){
	        return false;
	    }
	}
	public void clickOn_RespondToTenderLink() {
		link_RespondToTender.click();
		try { Thread.sleep(3000);}
		catch (InterruptedException e) {}
		
		
	}
	public boolean verify_RespondToTenderTitle() {
		try {
		return title_RespondToTender.isDisplayed();
		}catch(NoSuchElementException e){
	        return false;
	    }
	}
	public void selectAccept() {
		rbtn_Accept.click();
		
	}
	public void selectReject() {
		rbtn_Reject.click();
		
	}
	public void clickOn_LoadOverviewTab() {
		tab_LoadOverview.click();
	}
	public void clickOn_StopsTab() {

		tab_Stops.click();
		try { Thread.sleep(3000);}
		catch (InterruptedException e) {}
	}
	public void clickOn_ShipmentsTab() {
		tab_Shipments.click();
	}
	public void clickOn_TrackingDetailsTab() {
		tab_TrackingDetails.click();
	}

}
