package stepDefinitions;

import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.WebElement;
import io.appium.java_client.TouchAction;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.UtilityManager;
import pageObjects.CommonElementsPage;
import pageObjects.CreateDockCommitmentPages;
import pageObjects.DocksPage;
import pageObjects.LoadOverviewPage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import pageObjects.StopOverviewPage;
import utility.DeviceSetup1;
import utility.TakeScreenShot;
public class VerifyBookedWhenClosedViolation {

	
	Hooks hook=new Hooks();
	DeviceSetup1 dobj =new DeviceSetup1();
	AppiumDriver<WebElement> appiumDriver= hook.getAppiumDriver();
	PageObjectManager pageObjectManager=new PageObjectManager(appiumDriver);
	UtilityManager utilityManager=new UtilityManager(appiumDriver);
	SearchPage searchPage=pageObjectManager.getSearchPage();
	StopOverviewPage stopOverviewPage=pageObjectManager.getStopOverviewPage();
	CreateDockCommitmentPages createDockCommitmentPages=pageObjectManager.getCreateDockCommitmentPages();
	CommonElementsPage commonElementsPage=pageObjectManager.getCommonElementsPage();
	DocksPage docksPage=pageObjectManager.getDocksPage();
	LoginPage loginPage=pageObjectManager.getLoginPage();
	
	@When("^Select stop US Coast Fremont and Start time as eight am and duration as two hours and flexible on start time ON and duration flexible by zero$")
	public void verifyBookedWhenClosedViolationType()
	{
		createDockCommitmentPages.clickOn_TimePicker();
		commonElementsPage.setStartTime("8","0","AM");
		createDockCommitmentPages.clickOn_Timer();
		commonElementsPage.setDuration("2", "0");
		/*WebElement el=appiumDriver.findElementById("dock-toggle-button");
		JavascriptExecutor js = (JavascriptExecutor) appiumDriver;
		Point location = el.getLocation();
		Dimension size=el.getSize();
		double x=el.getLocation().getX() + size.getWidth()/2.0;
		double y=el.getLocation().getY() + size.getHeight()/2.0;
			HashMap<String, Double> point = new HashMap<String, Double>();
			point.put("x", x);
			point.put("y", y);
			System.out.println(point);
			js.executeScript("mobile: tap", point); */
		
		
		
		//createDockCommitmentPages.clickOn_FlexibleOnStartTime();
		//(new TouchAction(appiumDriver)).tap(FileReaderManager.getInstance().getConfigReader().getSlider00_x(), FileReaderManager.getInstance().getConfigReader().getDurationSlider_y()).perform();
		commonElementsPage.clickOn_NextButton();
		}
	}
