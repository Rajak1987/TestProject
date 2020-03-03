package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import managers.PageObjectManager;
import managers.UtilityManager;
import pageObjects.StopOverviewPage;
import utility.DeviceSetup1;

public class ConfirmDropStopByConfirmStopOperation {
	
	Hooks hook=new Hooks();
	DeviceSetup1 dobj =new DeviceSetup1();
	AppiumDriver<WebElement> appiumDriver= hook.getAppiumDriver();
	PageObjectManager pageObjectManager=new PageObjectManager(appiumDriver);
	UtilityManager utilityManager=new UtilityManager(appiumDriver);
	StopOverviewPage stopOverviewPage=pageObjectManager.getStopOverviewPage();
	WebDriverWait mywait=new WebDriverWait(appiumDriver, 60);
	
	/******
	 * 
	 *Scenario:Driver should be able to confirm the drop stop by performing confirm stop operation
	 */
	
	@When("^Driver chooses Confirm Stop option$")
	public void driver_chooses_confirm_stop_option()  {
		
		try {
		stopOverviewPage.selectConfirmStopOption();
		stopOverviewPage.clickOn_ProceedButton();
		mywait.until(ExpectedConditions.visibilityOf(stopOverviewPage.title_ReviewItems));
		
	}catch(Exception e){
		utilityManager.getTakeScreenShot();
		System.out.println(e);
		System.exit(1);
	}

}
}
