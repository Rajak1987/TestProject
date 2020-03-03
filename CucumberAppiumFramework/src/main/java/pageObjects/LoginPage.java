package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
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
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import managers.FileReaderManager;
import managers.PageObjectManager;
import stepDefinitions.Hooks;

public class LoginPage {
	
	
	AppiumDriver<WebElement> driver;
	Hooks hook=new Hooks();
	ConfigFileReader configFileReader;
	PageObjectManager pageObjectManager;
	WebDriverWait mywait;
	SearchPage searchPage;
	
	
	public LoginPage(AppiumDriver<WebElement> driver) {
	    this.driver=driver;
	    PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	     mywait=new WebDriverWait(driver, 120);
	}
	
	/**
	 ******************************************************Locators**********************************************
	 */
	
	@AndroidFindBy(id = "com.jda.trackandtrace:id/customerIdField")
	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")
    private WebElement txtbx_Customerid;
	
	/*@FindAll({@FindBy(how = How.ID, using = "com.jda.trackandtrace:id/customerIdField"),
        			@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private List <WebElement> txtbx_Customerid;*/
	
	/*@AndroidFindBy(id="com.jda.trackandtrace:id/username")
    @iOSFindBy(xpath="//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    private WebElement txtbx_Username;*/
	
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField/XCUIElementTypeTextField"),
		@FindBy(xpath="//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField"),
		//@FindBy(xpath="//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField"),
		@FindBy(id="com.jda.trackandtrace:id/username")})
	private WebElement txtbx_Username;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField/XCUIElementTypeSecureTextField"),
		@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField"),
		@FindBy(id= "com.jda.trackandtrace:id/password")})
	private WebElement txtbx_Password;
	
	@FindAll({@FindBy(how = How.ID, using = "com.jda.trackandtrace:id/submitButton"),
		@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Submit\"]")})
	private WebElement btn_Submit;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name=\"Log in\"]"),
		@FindBy(id = "com.jda.trackandtrace:id/login")})
	private WebElement btn_Login;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeSwitch"),
		@FindBy(id = "com.jda.trackandtrace:id/analytics_selection_switch")})
	private WebElement rbtn_Analytics;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name=\"Continue\"]"),
		@FindBy(id = "com.jda.trackandtrace:id/analytics_continue_button")})
	private WebElement btn_Continue;
	
	@FindAll({@FindBy(how = How.ID, using = "com.jda.trackandtrace:id/customer"),
		@FindBy(name = "Not with TMUSER-QA2017?")})
	private WebElement lnk_Cpsid;

	/**
	 ******************************************************Functions**********************************************
	 */
	
	public void setCustomerId(String strCustid) {
		 txtbx_Customerid.sendKeys(strCustid);
	 }
	
	public void setUsername(String strUsername) {
		 txtbx_Username.sendKeys(strUsername);
	 }
	public void setPassword(String strPassword) {
		 txtbx_Password.sendKeys(strPassword);
	 }
	public void clickOn_Submit() {
		 btn_Submit.click();
		 try { Thread.sleep(5000);}
			catch (InterruptedException e) {}
	 }
	public void clickOn_Login() {
		 btn_Login.click();
		 if("Android".equalsIgnoreCase(hook.getPlatformName())){
			 try { Thread.sleep(60000);}
				catch (InterruptedException e) {}
			 }
			 if("ios".equalsIgnoreCase(hook.getPlatformName())){
				 try { Thread.sleep(20000);}
					catch (InterruptedException e) {}
				 } 
			
	 }
	public void clickOn_Analytics() {
		 rbtn_Analytics.click();
	 }
	public void clickOn_Continue() {
		 btn_Continue.click();
		 if("Android".equalsIgnoreCase(hook.getPlatformName())){
		 try { Thread.sleep(100000);}
			catch (InterruptedException e) {}
		 }
		 if("ios".equalsIgnoreCase(hook.getPlatformName())){
			 try { Thread.sleep(20000);}
				catch (InterruptedException e) {}
			 } 
		 }
		 
	 
	public void loginApp()
	{
		setCustomerId(FileReaderManager.getInstance().getConfigReader().getCustomerId());
		clickOn_Submit();
		mywait.until(ExpectedConditions.elementToBeClickable(btn_Login)); 
		//driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		setUsername(FileReaderManager.getInstance().getConfigReader().getUsername());
		setPassword(FileReaderManager.getInstance().getConfigReader().getPassword());
		clickOn_Login();
		//clickOn_Analytics();
		//clickOn_Continue();
		
		

	}
}
