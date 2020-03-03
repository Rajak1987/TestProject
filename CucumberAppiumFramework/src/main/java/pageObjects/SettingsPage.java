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

public class SettingsPage {
	
	AppiumDriver<WebElement> driver;
	ConfigFileReader configFileReader;
	WebDriverWait mywait;
	Hooks hook=new Hooks();
	
	
	public SettingsPage(AppiumDriver<WebElement> driver) {
	    this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
		mywait=new WebDriverWait(driver,10);
		
	}
	
	/**
	 ******************************************************Locators**********************************************
	 */
	
	/*@AndroidFindBy(accessibility="menu")
		@iOSFindBy(accessibility="menu")
	WebElement icon_Hamburger; */
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"menu\"]"),
		//@FindBy(xpath="//android.view.View[@content-desc=\"menu\"]")	,
		//@FindBy(id="ext-button-16"),
        	@FindBy(xpath = "//android.view.View[@content-desc=\"menu\"]")})
	public WebElement icon_Hamburger;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name=\"Log out\"]"),
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView")})
	private WebElement tab_UserSettings;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name=\"Log out\"]"), 
		@FindBy(id="com.jda.trackandtrace:id/logoutContainer"),
		@FindBy(id = "com.jda.trackandtrace:id/logoutLabel")})
	private WebElement icon_Logout;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Log out\"]"),
		@FindBy(id = "android:id/alertTitle")})
	private WebElement popup_Logout;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name=\"OK\"]"),
		@FindBy(id = "android:id/button1")})
	private WebElement btn_LogoutOk;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name=\"Cancel\"]"),
		@FindBy(id = "android:id/button2")})
	private WebElement btn_LogoutCancel;
	
	/**
	 ******************************************************Functions**********************************************
	 */

	public void clickOn_HamburgerIcon() {
		
		if("ios".equalsIgnoreCase(hook.getPlatformName())){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//System.out.println(tab_Docks.getLocation());
		Point location = icon_Hamburger.getLocation();
		Dimension size=icon_Hamburger.getSize();
		double x=icon_Hamburger.getLocation().getX() + size.getWidth()/2.0;
		double y=icon_Hamburger.getLocation().getY() + size.getHeight()/2.0;
			HashMap<String, Double> point = new HashMap<String, Double>();
			point.put("x", x);
			point.put("y", y);
			System.out.println(point);
			js.executeScript("mobile: tap", point);
		}
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
			icon_Hamburger.click();
		}
			try { Thread.sleep(1000);}
			catch (InterruptedException e) {}
		
		
		//icon_Hamburger.click();
	 }
	public void clickOn_userSettingsTab() {
		tab_UserSettings.click();
		try { Thread.sleep(3000);}
		catch (InterruptedException e) {}
	 }
	
	public void clickOn_LogoutIcon() {
		icon_Logout.click();
		try { Thread.sleep(1000);}
		catch (InterruptedException e) {}
	 }
	public void clickOn_LogoutOk() {
		btn_LogoutOk.click();
	 }
	public void clickOn_logoutCancel() {
		btn_LogoutCancel.click();
		try { Thread.sleep(1000);}
		catch (InterruptedException e) {}
	 }
	
	public void logoutApp() {
		
		
		//mywait.until(ExpectedConditions.elementToBeClickable(icon_Hamburger));
		clickOn_HamburgerIcon();
		clickOn_LogoutIcon();
		//WebDriverWait mywait2=new WebDriverWait(driver,10);
		mywait.until(ExpectedConditions.elementToBeClickable(popup_Logout));
		clickOn_LogoutOk();
	}
	
}

