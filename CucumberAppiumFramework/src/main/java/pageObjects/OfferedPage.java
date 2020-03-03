package pageObjects;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.WebElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import stepDefinitions.Hooks;

public class OfferedPage {
	
	AppiumDriver<WebElement> driver;
	ConfigFileReader configFileReader;
	WebDriverWait mywait;
	Hooks hook=new Hooks();
	
	
	public OfferedPage(AppiumDriver<WebElement> driver) {
	    this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
		mywait=new WebDriverWait(driver,10);
		
	}
	
	/**
	 ******************************************************Locators**********************************************
	 */
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Decline\"]"),
        	@FindBy(xpath = "//android.view.View[@content-desc=\"Decline\"]")})
	private WebElement btn_Decline;
	
	@FindAll({@FindBy(how = How.XPATH, xpath = "//XCUIElementTypeStaticText[@name=\"Accept\"]"),
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewFlipper/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Accept\"]")})
	public WebElement btn_Accept;
	
	@FindAll({@FindBy(how = How.XPATH, using = "(//XCUIElementTypeStaticText[@name=\"Details\"])[1]"),
    		@FindBy(xpath = "(//android.view.View[@content-desc=\"Details\"])[1]")})
	private WebElement btn_FirstStopDetails;
	
	/**
	 ******************************************************Functions**********************************************
	 */
	public void clickOn_AcceptButton(){
		btn_Accept.click();
	}
	
}
	


