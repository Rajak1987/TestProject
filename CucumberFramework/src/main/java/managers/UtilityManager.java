package managers;

//import java.util.HashMap;

//import org.openqa.selenium.JavascriptExecutor;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

import utility.DbQuery;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.WebElement;
//import utility.MobileGestureCommand;
import utility.TakeScreenShot;

public class UtilityManager {
	
	WebDriver driver;
	TakeScreenShot takeScreenShot;
	DbQuery dbQuery;
	//MobileGestureCommand mobileGestureCommand;


	public UtilityManager(WebDriver driver) {
		this.driver = driver;
	}

	public TakeScreenShot getTakeScreenShot() {
		return (takeScreenShot == null) ? new TakeScreenShot(driver) : takeScreenShot;
	}
	public DbQuery getDbQuery() {
		return (dbQuery == null) ? new DbQuery() : dbQuery;
	}
	
	/*public MobileGestureCommand getMobileGestureCommand()
	{
		return (mobileGestureCommand == null) ? new MobileGestureCommand(driver) : mobileGestureCommand;
	}*/

}
