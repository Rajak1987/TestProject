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

public class DocumentsPage {

	AppiumDriver<WebElement> driver;
	//ConfigFileReader configFileReader;
	UtilityManager utilityManager=new UtilityManager(driver);
	MobileGestureCommand mobileGestureCommand=utilityManager.getMobileGestureCommand();
	
	public DocumentsPage(AppiumDriver<WebElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}
	/**
	 ******************************************************Locators**********************************************
	 */
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Stop Documents\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Stop Documents\"]")})
	public WebElement tab_StopDocuments;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Load Documents\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Load Documents\"]")})
	public WebElement tab_LoadDocuments;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Stop-06222018123907\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Mobile Distribution Center 1\"]")})
	public WebElement link_Stop1Document;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[20]/XCUIElementTypeOther[2]/XCUIElementTypeImage"),
		@FindBy(xpath = "(//android.view.View[@content-desc=\"06/22/2018 \"])[1]")})
	public WebElement icon_DeleteStop1Document;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Load-05042018142253\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Load-05042018142253\"]")})
	public WebElement link_LoadDocument;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[19]/XCUIElementTypeOther[2]/XCUIElementTypeImage"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"05/04/2018 \"]")})
	public WebElement icon_DeleteLoadDocument;
	
	/**
	 ******************************************************Functions**********************************************
	 */
	public void clickOn_StopDocumentsTab() {
		tab_StopDocuments.click();
	}
	public void clickOn_LoadDocumentsTab() {
		tab_LoadDocuments.click();
	}
	public void clickOn_Stop1DocumentLink() {
		link_Stop1Document.click();
	}
	public void clickOn_DeleteStop1DocumentIcon() {
		icon_DeleteStop1Document.click();
	}
	public void clickOn_LoadDocumentLink() {
		link_LoadDocument.click();
	}
	public void clickOn_DeleteLoadDocument() {
		icon_DeleteLoadDocument.click();
	}
	
}
