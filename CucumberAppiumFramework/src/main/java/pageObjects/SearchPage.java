package pageObjects;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import managers.FileReaderManager;
import stepDefinitions.Hooks;

public class SearchPage {
	
	
	AppiumDriver<WebElement> driver;
	Hooks hook=new Hooks();
	WebDriverWait mywait;
	//ConfigFileReader configFileReader;
	//Actions actions;
	
	
	public SearchPage(AppiumDriver<WebElement> driver) {
	    this.driver=driver;
	    PageFactory.initElements(new AppiumFieldDecorator(driver,5, TimeUnit.SECONDS), this);
	   //actions=new Actions(driver);
	     mywait=new WebDriverWait(driver,120);
	    
	}
	
	/**
	 ******************************************************Locators**********************************************
	 */
	
	/*@AndroidFindBy(id="ext-element-101")
    @iOSFindBy(xpath="//XCUIElementTypeButton[@label='Log In']")
    WebElement txtbx_Search; */
	
	/*@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.EditText[@content-desc=\"Search\"]"),
		@FindBy(how=How.ID, using= "search-box")})
	private WebElement txtbx_Search; 
	
	/*@AndroidFindBy(id="driver-load-accepted")
	@iOSFindBy(id="driver-load-accepted")
	WebElement tab_Accepted;
	
	@AndroidFindBy(id="driver-load-offered")
	@iOSFindBy(id="driver-load-offered")
	WebElement tab_Offered;
	
	@AndroidFindBy(id="search-box")
	@iOSFindBy(id="search-box")
	WebElement txtbx_Search;
	
	@AndroidFindBy(id="search-button-1")
	@iOSFindBy(id="search-button-1")
	WebElement btn_SearchByLoadId;
	
	@AndroidFindBy(id="search-button-2")
	@iOSFindBy(id="search-button-2")
	WebElement btn_SearchByReferenceNumber;*/
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeSearchField[@value=\"Search\"]"),
		//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewFlipper/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]"),
		//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewFlipper/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText"),
		@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSearchField"),
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewFlipper/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.EditText\n" + 
				"")})
	public WebElement txtbx_Search;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Offered\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Offered\"]")})
	public WebElement tab_Offered;
	
	@FindAll({@FindBy(how = How.XPATH, using = "(//XCUIElementTypeStaticText[@name=\"Accepted\"])[1]"),
		@FindBy(xpath = "(//android.view.View[@content-desc=\"Accepted\"])[1]")})
	public WebElement tab_Accepted;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Search By Load Id\"]"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Search By Load Id\"]")})
	private WebElement btn_SearchByLoadId;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Search By Reference Number\"]"),
		//@FindBy(id="search-button-2"),
		@FindBy(xpath = "//android.view.View[@content-desc=\"Search By Reference Number\"]")})
	private WebElement btn_SearchbyRef;
	
	@FindBy(how = How.ID, using = "loadListId_list0")
	private WebElement Id_Load;
	
	@FindAll({@FindBy(how = How.XPATH, using = "(//XCUIElementTypeStaticText[@name=\"Offered\"])[2]"),
		@FindBy(xpath = "(//android.view.View[@content-desc=\"Offered\"])[2]")})
	public WebElement label_OfferedStatus;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Driver\"]"),
		@FindBy(xpath="(//android.view.View[@content-desc=\"Driver\"])[2]"),
		@FindBy(xpath = "(//android.view.View[@content-desc=\"Driver\"])[3]")})
	public WebElement title_Driver;
	
	@FindAll({@FindBy(how = How.XPATH, using = "(//XCUIElementTypeStaticText[@name=\"Employees\"]"),
		@FindBy(xpath = "(//android.view.View[@content-desc=\"Employee\"]")})
	public WebElement title_Employee;
	
	@FindAll({@FindBy(how = How.XPATH, using =  "//XCUIElementTypeStaticText[@name=\"Carriers\"]"),
		@FindBy(xpath = "(//android.view.View[@content-desc=\"Carrier\"])[3]")})
	public WebElement title_Carrier;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Tendered\"]"),
		@FindBy(xpath = "(//android.view.View[@content-desc=\"Tendered\"])[1]")})
	public WebElement tab_Tendered;
	
	
	/* @FindAll({@FindBy(how = How.XPATH, using = "android.view.View[@content-desc=\"Load 83208\"]"),
		@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Log in\"]")})
	private WebElement label_LoadId; */
	
	/**
	 ******************************************************Functions**********************************************
	 */

	public void clickOn_TenderedTab(){
		
		tab_Tendered.click();
		try { Thread.sleep(5000);}
		catch (InterruptedException e) {}
		
	}
	public void setSearch(String strLoadid) {
		
		/*actions.moveToElement(txtbx_Search);
		actions.click();
		actions.sendKeys(strLoadid);
		actions.build().perform();*/
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("txtbx_Search.sendKeys(strLoadid)"); */
		if("ios".equalsIgnoreCase(hook.getPlatformName())){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Point location = txtbx_Search.getLocation();
		Dimension size=txtbx_Search.getSize();
		double x=txtbx_Search.getLocation().getX() + size.getWidth()/2.0;
		double y=txtbx_Search.getLocation().getY() + size.getHeight()/2.0;
				HashMap<String, Double> point = new HashMap<String, Double>();
				point.put("x", x);
				point.put("y", y);
				js.executeScript("mobile: tap", point); 
		}	
		/*if("Android".equalsIgnoreCase(hook.getPlatformName())){
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Point location = txtbx_Search.getLocation();
			Dimension size=txtbx_Search.getSize();
			double x=txtbx_Search.getLocation().getX() + size.getWidth()/2.0;
			double y=txtbx_Search.getLocation().getY() + size.getHeight()/2.0;
					HashMap<String, Double> point = new HashMap<String, Double>();
					point.put("x", x);
					point.put("y", y);
					js.executeScript("mobile: tap", point); 
			}	*/
				
				
		txtbx_Search.sendKeys(strLoadid);
		 
	 }
	
	public void clickOn_SearchByLoadId() {
		btn_SearchByLoadId.click();
		try { Thread.sleep(5000);}
		catch (InterruptedException e) {}
	 }
	public void clickOn_SearchByReferenceNumber() {
		btn_SearchbyRef.click();
		try { Thread.sleep(1000);}
		catch (InterruptedException e) {}
	 }
	public void clickOn_AcceptedTab() {
		 tab_Accepted.click();
		 try { Thread.sleep(5000);}
			catch (InterruptedException e) {}
	 }
	public void clickOn_OfferedTab() {
		 tab_Offered.click();
		 mywait.until(ExpectedConditions.visibilityOf(label_OfferedStatus));
	 }
	public void clickOn_LoadId(String LoadId) {
		
		System.out.println(hook.getPlatformName());
		
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
			
			WebElement e1=driver.findElementByAccessibilityId("Load "+LoadId);
			e1.click();
			/*txtbx_Search.sendKeys(LoadId);
			try { Thread.sleep(3000);}
			catch (InterruptedException e) {}
			Id_Load.click();
			WebElement e1=driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Load "+LoadId+"\"])[1]"));
			e1.click(); */
			/*mywait.until(ExpectedConditions.visibilityOf(btn_SearchByLoadId));
			    Set<String> contextNames = driver.getContextHandles();
			    System.out.println("Available Contexts-------------------------"+contextNames);
			    String lastestContextView = (String) contextNames.toArray()[contextNames.size()-1];

			    if (lastestContextView.contains("WEBVIEW") ){
			        driver.context(lastestContextView);
			    }
			
			btn_SearchByLoadId.click();
			    driver.findElementById("search-button-1");
			WebElement element = driver.findElementByAccessibilityId("Search By Load Id");
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			WebElement e1=driver.findElementByAccessibilityId("Search By Load Id");
			e1.click();*/
			
			/*;
			  WebElement e1=driver.findElementByAccessibilityId("Load "+LoadId);
			e1.click();*/
			
			
			//mywait.until(ExpectedConditions.visibilityOf(btn_SearchByLoadId));
			/*btn_SearchByLoadId.click();
			try { Thread.sleep(3000);}
			catch (InterruptedException e) {}
			/*WebElement e1=driver.findElementByAccessibilityId("Load "+LoadId);
			e1.click();
			Id_Load.click();*/
			
		}
		if("ios".equalsIgnoreCase(hook.getPlatformName())){
			txtbx_Search.sendKeys(LoadId);
			btn_SearchByLoadId.click();
			try { Thread.sleep(3000);}
			catch (InterruptedException e) {}
			WebElement e1=driver.findElementByAccessibilityId("Load "+LoadId);
			e1.click();
		}
		
	 }
public void clickOn_OnDutyLoadId(String LoadId) {
		
		System.out.println(hook.getPlatformName());
		
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
			WebElement e1=driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Load "+LoadId+"\"])[1]"));
			//WebElement e1=driver.findElementByAccessibilityId("Load "+LoadId);
			//Id_Load.click();
			e1.click();
			//(//android.view.View[@content-desc="Load 83208"])[1]
			//(//android.view.View[@content-desc="Load 83208"])[1]
			
		}
		if("ios".equalsIgnoreCase(hook.getPlatformName())){
			WebElement e1=driver.findElementByAccessibilityId("Load "+LoadId);
			e1.click();
		}
		try { Thread.sleep(5000);}
		catch (InterruptedException e) {}
	 }
public boolean verify_DriverTitle() {
	try {
	return title_Driver.isDisplayed();
	}catch(NoSuchElementException e){
        return false;
    }
	
}
public boolean verify_EmployeeTitle() {
	
	return title_Employee.isDisplayed();
}
public boolean verify_CarrierTitle() {
	try {
	return title_Carrier.isDisplayed();
	}
	catch(NoSuchElementException e){
        return false;
    }
}
	
	
}

