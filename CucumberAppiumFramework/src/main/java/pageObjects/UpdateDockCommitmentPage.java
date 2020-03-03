package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.WebElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UpdateDockCommitmentPage {
	AppiumDriver<WebElement> driver;
	
	public UpdateDockCommitmentPage(AppiumDriver<WebElement> driver) {
	    this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}
	
	/**
	 ******************************************************Locators**********************************************
	 */
	
	@FindAll({@FindBy(how = How.XPATH, using = "(//XCUIElementTypeStaticText[@name=\"event\"])[1]"),
		@FindBy(xpath = "(//android.view.View[@content-desc=\"event\"])[1]")})
	private WebElement icon_StartDate;
	
	@FindAll({@FindBy(how = How.XPATH, using = "(//XCUIElementTypeStaticText[@name=\"event\"])[2]"),
		@FindBy(xpath = "(//android.view.View[@content-desc=\"event\"])[1]")})
	private WebElement icon_EndDate;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[1]"),
		@FindBy(xpath = "(//android.view.View[@content-desc=\"Update Dock Commitment\"])")})
	private WebElement field_StartDate;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[2]"),
		@FindBy(xpath = "(//android.view.View[@content-desc=\"Update Dock Commitment\"])")})
	private WebElement field_EndDate;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"02:00\"]"),
		@FindBy(xpath = "(//android.view.View[@content-desc=\"Update Dock Commitment\"])")})
	private WebElement field_Duration;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Update Dock Commitment\"]"),
		@FindBy(xpath = "(//android.view.View[@content-desc=\"Update Dock Commitment\"])")})
	private WebElement title_UpdatePage;
	
	/**
	 ******************************************************Functions**********************************************
	 */
	
	public void clickOn_StartDate() {
		icon_StartDate.click();
		try { Thread.sleep(3000);}
		catch (InterruptedException e) {}
	}
	public void clickOn_EndDate() {
		icon_EndDate.click();
		try { Thread.sleep(3000);}
		catch (InterruptedException e) {}
	}
	
	public String getStartDate() {
		return field_StartDate.getAttribute("value");
	}
	
	public String getEndDate() {
		return field_EndDate.getAttribute("value");
	}
	public String getDuration() {
		return field_Duration.getAttribute("value");
	}
	public boolean verify_PageTitle() {
		return title_UpdatePage.isDisplayed();
	}
}
