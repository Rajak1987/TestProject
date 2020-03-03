package utility;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.WebElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import managers.FileReaderManager;

public class DeviceSetup1 {

	public static AppiumDriver<WebElement> appiumDriver;
	public static AppiumDriverLocalService service;
	private WebDriver driver;
	private DesiredCapabilities capabilities;
	
	
	

	/*public  DeviceSetup(AppiumDriver<WebElement> appiumDriver)throws Exception{ 

       this.appiumDriver = appiumDriver;

    }

try{	 */



	public AppiumDriver<WebElement> setUp(String PlatformName,String PlatformVersion, String DeviceName,String App,String Reset,String AutomationName, String NewCommandTimeout)throws Exception{
	//String RecreateChromeDriverSessions,String NewCommandTimeout,String AutoWebviewTimeout) 
		 

		service = AppiumDriverLocalService
				.buildService(new AppiumServiceBuilder()
						.usingDriverExecutable(new File("/usr/local/bin/node"))
						.withAppiumJS(
								new File(
										"/usr/local/lib/node_modules/appium/build/lib/main.js"))
						.withIPAddress(FileReaderManager.getInstance().getConfigReader().getIpAddress()).usingPort(FileReaderManager.getInstance().getConfigReader().getPortNumber()));

		service.start();
		
		

		if("ios".equalsIgnoreCase(PlatformName))
		{
			if("iPhone 7".contains(DeviceName))
			{
				capabilities = DesiredCapabilities.iphone();
			}
			if("iPad Air".equalsIgnoreCase(DeviceName))
			//if ("iPad".contains(DeviceName))
			{

				capabilities = DesiredCapabilities.ipad();
			}
			capabilities.setCapability("platformName", PlatformName);
			capabilities.setCapability("platformVersion", PlatformVersion);
			capabilities.setCapability("deviceName", DeviceName);
			capabilities.setCapability("app", App);
			capabilities.setCapability("Reset", Reset);
			capabilities.setCapability("automationName", AutomationName);
			//capabilities.setCapability("nativeWebTap", true);
			//capabilities.setCapability("startIWDP", true);
			
			//capabilities.setCapability("recreateChromeDriverSessions",RecreateChromeDriverSessions);
			//capabilities.setCapability("autoWebviewTimeout", AutoWebviewTimeout);
			//capabilities.setCapability("MobileCapabilityType.PLATFORM_VERSION", PlatformVersion);
			//capabilities.setCapability(CapabilityType.BROWSER_NAME, "safari");
			//capabilities.setCapability("appWaitPackage","com.jda.trackandtrace" );
			//capabilities.setCapability("appPackage", AppPackage);
			//capabilities.setCapability("appWaitActivity", "com.jda.mobility.login.LoginActivity");
			//capabilities.setCapability("appWaitDuration","30000");
			//capabilities.setCapability("appActivity", AppActivity);
			capabilities.setCapability("newCommandTimeout", NewCommandTimeout);
			
			URL url = new URL("http", FileReaderManager.getInstance().getConfigReader().getIpAddress(), FileReaderManager.getInstance().getConfigReader().getPortNumber(), "/wd/hub");
			//driver = new RemoteWebDriver(url, capabilities );
			appiumDriver = new IOSDriver<WebElement>(url, capabilities);
			appiumDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
			//return appiumDriver;
		}
		else 
			if("Android".equalsIgnoreCase(PlatformName))
			{
				capabilities = DesiredCapabilities.android();
				capabilities.setCapability("platformName", PlatformName);
				capabilities.setCapability("platformVersion", PlatformVersion);
				capabilities.setCapability("deviceName", DeviceName);
				capabilities.setCapability("app", App);
				capabilities.setCapability("Reset", Reset);
				capabilities.setCapability("automationName", AutomationName);
				//capabilities.setCapability("noSign", NoSign);
				//capabilities.setCapability("recreateChromeDriverSessions",RecreateChromeDriverSessions);
				capabilities.setCapability("newCommandTimeout",NewCommandTimeout);
				//capabilities.setCapability("chromedriverExecutableDir", ChromedriverExecutableDir);
				//capabilities.setCapability("udid",UDID);
				//capabilities.setCapability("autoWebview", AutoWebview);
				//capabilities.setCapability("autoWebviewTimeout", AutoWebviewTimeout);
				//capabilities.setCapability("clearSystemFiles",ClearSystemFiles);
				//capabilities.setCapability("browserName", "Safari");
				//capabilities.setCapability("appWaitPackage","com.jda.trackandtrace" );
				//capabilities.setCapability("MobileCapabilityType.PLATFORM_VERSION", PlatformVersion);
				//capabilities.setCapability("appPackage", "com.jda.trackandtrace");
				//capabilities.setCapability("appWaitActivity", "com.jda.mobility.login.LoginActivity");
				//capabilities.setCapability("appWaitDuration","30000");
				//capabilities.setCapability("appActivity", "com.jda.mobility.login.LoginActivity");
				//capabilities.setCapability("newCommandTimeout", Integer.parseInt(NewCommandTimeout));
				
				URL url = new URL("http", FileReaderManager.getInstance().getConfigReader().getIpAddress(),FileReaderManager.getInstance().getConfigReader().getPortNumber(), "/wd/hub");
				//driver = new RemoteWebDriver(url, capabilities );
				appiumDriver = new AndroidDriver<WebElement>(url, capabilities);
				appiumDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				
			}
			else
			{
				System.out.println("Incorrect platform details");
			}
		return appiumDriver;
	}
	
	

	public void tearDown() {
		try {
			appiumDriver.quit();
			//service.stop();
		}catch(NullPointerException e)
		{
			System.out.println("object is already null");
		}
	}
}



