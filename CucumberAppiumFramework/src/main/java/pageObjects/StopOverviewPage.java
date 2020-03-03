package pageObjects;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
//import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSFindBy;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.UtilityManager;
import stepDefinitions.Hooks;
import utility.MobileGestureCommand;

public class StopOverviewPage {
	AppiumDriver<WebElement> driver;
	//ConfigFileReader configFileReader;
	UtilityManager utilityManager=new UtilityManager(driver);
	MobileGestureCommand mobileGestureCommand=utilityManager.getMobileGestureCommand();
	Hooks hook=new Hooks();
	
	


	public StopOverviewPage(AppiumDriver<WebElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}
	
	
	
	/**
	 ******************************************************Locators**********************************************
	 */
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Stops\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Stops\"]")})
	public WebElement tab_Stop;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Start Duty\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Start Duty\"]")})
	public WebElement btn_StartDuty;
	
	@FindAll({@FindBy(how = How.XPATH, using = "(//XCUIElementTypeStaticText[@name=\"Start Duty\"])[1]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Start Duty\"])[1]")})
	public WebElement title_StartDuty;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"No\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"No\"]")})
	private WebElement btn_NoStartDuty;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Yes\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Yes\"]")})
	public WebElement btn_YesStartDuty;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"ON-DUTY\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"ON-DUTY\"]")})
	public WebElement label_OnDuty;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Process Delivery\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Process Delivery\"]")})
	private WebElement btn_processDelivery;//
	
	@FindAll({@FindBy(how = How.XPATH, using =  "//XCUIElementTypeStaticText[@name=\"Delivery Options\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Delivery Options\"]")})
	public WebElement title_DeliveryOptionsPopover;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Digital Signature\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Digital Signature\"]")})
	private WebElement rbtn_DigitalSignature;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Attach POD\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Attach POD\"]")})
	private WebElement rbtn_AttachPod;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Confirm Stop\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Confirm Stop\"]")})
	private WebElement rbtn_ConfirmStop;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Proceed\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Proceed\"]")})
	private WebElement btn_Proceed;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"DELIVERED\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"DELIVERED\"]")})
	private WebElement label_Delivered;
	
	/*@AndroidFindBy(accessibility="Docks")
		@iOSFindBy(accessibility="Docks")
	WebElement tab_Docks;*/
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Docks\"]"),
		@FindBy(id="docks"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Docks\"]")})
	 WebElement tab_Docks;

	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Documents\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Documents\"]")})
	private WebElement tab_Documents;
	
	@FindAll({@FindBy(how = How.XPATH, using =  "//XCUIElementTypeStaticText[@name=\"ACCEPTED\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"ACCEPTED\"]")})
	public WebElement label_Accepted;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Process Pick-Up\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Process Pick-Up\"]")})
	private WebElement btn_ProcessPickup;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Review Items\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Review Items\"]")})
	public WebElement title_ReviewItems;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Pickup complete\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Pickup complete \"]")})
	public WebElement label_PickupComplete;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"menu\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Delivery complete \"]")})
	public WebElement label_DeliveryComplete;
	
	@FindAll({@FindBy(how = How.XPATH, using = "(//XCUIElementTypeStaticText[@name=\"uE518\"])[1]"),
		@FindBy(xpath = "(//android.view.View[@content-desc=\"\"])[1]")})
	public WebElement icon_kebabMenuLoad;
	
	@FindAll({@FindBy(how = How.XPATH, using =  "(//XCUIElementTypeStaticText[@name=\"uE518\"])[2]"),
		@FindBy(xpath = "(//android.view.View[@content-desc=\"\"])[2]")})
	public WebElement icon_kebabMenuStop1;
	
	@FindAll({@FindBy(how = How.XPATH, using = "(//XCUIElementTypeStaticText[@name=\"uE518\"])[3]"),
		@FindBy(xpath = "(//android.view.View[@content-desc=\"\"])[3]")})
	public WebElement icon_kebabMenuStop2;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Attach Document\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Attach Document\"]")})
	public WebElement menuItem_AttachDocument;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Update ETA\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Update ETA\"]")})
	public WebElement menuItem_UpdateEta;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Contacts\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Contacts\"]")})
	public WebElement menuItem_Contacts;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"07/11/2018 17:40\"]"),
		@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Date/Time\"]/following-sibling::*[1]"),
		@FindBy(xpath="//android.view.View[@content-desc=\"Date/Time\"]/following-sibling::*[1]")})
	public WebElement field_DateTimeValue;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Revised ETA\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Revised ETA\"]")})
	public WebElement rbtn_RevisedEta;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Traffic congestion\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Traffic congestion\"]")})
	public WebElement rbtn_TrafficCongestion;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"ETA\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"ETA\"]")})
	public WebElement title_ETA; //
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Confirmed ETA:\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Confirmed ETA:\"]")})
	public WebElement field_ConfirmedEta;
	
	
	/**
	 ******************************************************Functions**********************************************
	 */
	
	public void selectTrafficCongestion() {
		rbtn_TrafficCongestion.click();
	}
	public void selectRevisedEta() {
		rbtn_RevisedEta.click();
	}
	public boolean verify_ConfirmedEtaField() {
		return field_ConfirmedEta.isDisplayed();
	}
	
	public boolean verify_EtaPopoverTitle() {
		return title_ETA.isDisplayed();
	}
	
	public void selectUpdateEta() {
		menuItem_UpdateEta.click();
	}
	public void selectContacts() {
		menuItem_Contacts.click();
	}
	public void clickOn_DataTimeValue(){
		if("ios".equalsIgnoreCase(hook.getPlatformName())){
			(new TouchAction(driver)).tap(FileReaderManager.getInstance().getConfigReader().getIphone7_UpdateEtaDateTime_X(), FileReaderManager.getInstance().getConfigReader().getIphone7_UpdateEtaDateTime_Y()).perform();
		}
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
		field_DateTimeValue.click();
		}
	}
	public void clickOn_DocumentsTab() {
		tab_Documents.click();
	}
	public void selectAttachDocumentMenuItem() {
		menuItem_AttachDocument.click();
	}
	public void clickOn_LoadKebabMenu() {
		//icon_kebabMenuLoad.click();
		if("ios".equalsIgnoreCase(hook.getPlatformName())){
		(new TouchAction(driver)).tap(FileReaderManager.getInstance().getConfigReader().getIphone7_LoadKebabMenu_X(), FileReaderManager.getInstance().getConfigReader().getIphone7_LoadKebabMenu_Y()).perform();
		}
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
		(new TouchAction(driver)).tap(FileReaderManager.getInstance().getConfigReader().getPixelC_LoadKebabMenu_X(), FileReaderManager.getInstance().getConfigReader().getPixelC_LoadKebabMenu_Y()).perform();	
		}
	}
	public void clickOn_Stop1KebabMenu() {
		//icon_kebabMenuStop1.click();
		if("ios".equalsIgnoreCase(hook.getPlatformName())){
		(new TouchAction(driver)).tap(FileReaderManager.getInstance().getConfigReader().getIphone7_Stop1KebabMenu_X(), FileReaderManager.getInstance().getConfigReader().getIphone7_Stop1KebabMenu_Y()).perform();
		}
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
		(new TouchAction(driver)).tap(FileReaderManager.getInstance().getConfigReader().getPixelC_Stop1KebabMenu_X(), FileReaderManager.getInstance().getConfigReader().getPixelC_Stop1KebabMenu_Y()).perform();	
		}
	}
	public boolean verify_DeliveryOptionsPopoverTitle() {
		return title_DeliveryOptionsPopover.isDisplayed();
	}
	public void clickOn_StartDutyButton() {
		btn_StartDuty.click();
	}
	public void clickOn_StartDutyYesButton() {
		
		btn_YesStartDuty.click();
	}
		
	public boolean verify_OnDutyLabel() {
		return label_OnDuty.isDisplayed();
	}
	public void clickOn_ProcessPickup() {
		btn_ProcessPickup.click();
	}
	public boolean verify_ReviewItemsPageTitle() {
		return title_ReviewItems.isDisplayed();
	}
	public boolean verify_PickupCompleteStatus() {
		return label_PickupComplete.isDisplayed();
	}
	public boolean verify_DeliveryCompleteStatus() {
		return label_DeliveryComplete.isDisplayed();
	}
	public void clickOn_ProcessDeliveryButton() {
		
		btn_processDelivery.click();
	}
	public void selectAttachPodOption() {
		
		rbtn_AttachPod.click();
	}
	public void clickOn_ProceedButton() {
		
		btn_Proceed.click();
	}
	
	public void selectConfirmStopOption() {
		
		rbtn_ConfirmStop.click();
		
		}
	public boolean verify_AcceptedLabel() {
		return label_Accepted.isDisplayed();
	}
	
	
	public void clickOn_DocksTab() {
		
		
		tab_Docks.click();
		
		//Approach:1 Failed *******************
		/*WebElement element=driver.findElementById("Docks");
		element.click();
		driver.getKeyboard().sendKeys(Keys.ENTER); */
		
		//Aproach: 2 Failed ************************
		/*JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",driver.findElementById("Docks")); */
		
		//Approach: 3&4 Failed *************************
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println(tab_Docks.getLocation());
		Point location = tab_Docks.getLocation();
		Dimension size=tab_Docks.getSize();
		double x=tab_Docks.getLocation().getX() + size.getWidth()/2.0;
		double y=tab_Docks.getLocation().getY() + size.getHeight()/2.0;
			HashMap<String, Double> point = new HashMap<String, Double>();
			point.put("x", x);
			point.put("y", y);
			js.executeScript("mobile: tap", point); */
			
		//Approach: 5 Failed ***************************
			/*WebElement input = driver.findElement(By.id("Docks"));
			new Actions(driver).moveToElement(input).click().perform(); */

			
			
			
	//mobileGestureCommand.tapElement_XCTest(tab_Docks);*/
	//js_snippet = "$('#tab_Docks').trigger('tap');";
		
		
		
		/*Point p = tab_Docks.getLocation();
		int x = p.getX();
		int y = p.getY();
		Dimension dim = tab_Docks.getSize();
		x = x + (dim.getWidth()/2);
		y = y + (dim.getHeight()/2);
		//IOSDriver<MoileElement> driver1 = (IOSDriver)driver;
		Actions actions = new Actions(driver);
		actions.moveToElement(tab_Docks,dim.getWidth()/2,dim.getHeight()/2).perform();
		driver.*/
		
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
    		System.out.println(tab_Docks.getLocation());
    //	Point location = el.getLocation();
    		Dimension size=tab_Docks.getSize();
    		double x=tab_Docks.getLocation().getX() + size.getWidth()/2.0;
    		double y=tab_Docks.getLocation().getY() + size.getHeight()/2.0;
    			HashMap<String, Double> point = new HashMap<String, Double>();
    			point.put("x", x);
    			point.put("y", y);
    			js.executeScript("mobile: tap", point);
		//mobileGestureCommand.tapElement_XCTest(tab_Docks);*/
		//js_snippet = "$('#tab_Docks').trigger('tap');";
		
		
		//driver.findElementByXpath(“element”).click();
		//driver.getKeyboard().sendKeys(Keys.ENTER);
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		Point location = element.getLocation();
		Dimension size=element.getSize();
		double x=element.getLocation().getX() + size.getWidth()/2.0;
		double y=element.getLocation().getY() + size.getHeight()/2.0;
			HashMap<String, Double> point = new HashMap<String, Double>();
			point.put("x", x);
			point.put("y", y);
			js.executeScript("mobile: tap", point); */

		
		

		//$(‘#btn_login_button’).trigger(‘tap’);
		//tab_Docks.click();
		try { Thread.sleep(2000);}
		catch (InterruptedException e) {} 
	}


}
