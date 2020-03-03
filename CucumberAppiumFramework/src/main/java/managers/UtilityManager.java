package managers;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.WebElement;
import utility.MobileGestureCommand;
import utility.TakeScreenShot;

public class UtilityManager {
 
	AppiumDriver<WebElement> driver;
	TakeScreenShot takeScreenShot;
	MobileGestureCommand mobileGestureCommand;


	public UtilityManager(AppiumDriver<WebElement> driver) {
		this.driver = driver;
	}

	public TakeScreenShot getTakeScreenShot() {
		return (takeScreenShot == null) ? new TakeScreenShot(driver) : takeScreenShot;
	}
	
	public MobileGestureCommand getMobileGestureCommand()
	{
		return (mobileGestureCommand == null) ? new MobileGestureCommand(driver) : mobileGestureCommand;
	}
}