package stepDefinitions;

import java.util.Properties;
import java.util.Set;

//import java.io.FileOutputStream;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebElement;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import dataProviders.ExcelFileReader;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.WebElement;

import managers.PageObjectManager;
import managers.UtilityManager;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import pageObjects.SettingsPage;
import utility.DeviceSetup1;
import managers.FileReaderManager;
import dataProviders.ExcelFileReader;
import dataProviders.ConfigFileReader;



public class Hooks {

	public static AppiumDriver<WebElement> appiumDriver=null;


	DeviceSetup1 dobj =new DeviceSetup1();
	PageObjectManager pageObjectManager;
	UtilityManager utilityManager;
	LoginPage loginPage;
	SettingsPage settingsPage;
	SearchPage searchPage;
	ExcelFileReader excelReader;
	public static String PlatformName;
	WebDriverWait mywait;

	@Before(order=0)

	public void preSetup() throws Exception
	{
		try {
		System.out.println("EMULATOR IS GETTING LAUNCHED WITH PROVIDED PLATFORM CONFIGURATION.............................");
		System.out.println(System.getProperty("user.dir"));
		Sheet TmuSheet = FileReaderManager.getInstance().getExcelReader().readExcel(FileReaderManager.getInstance().getConfigReader().getExcelFilePath(),FileReaderManager.getInstance().getConfigReader().getExcelFile(),FileReaderManager.getInstance().getConfigReader().getExcelSheet());
		//Sheet TmuSheet = new ExcelFileReader().readExcel(System.getProperty("user.dir")+"/configs/","platformConfiguration.xlsx","Sheet2");
		//Find number of rows in excel file
		int rowCount = TmuSheet.getLastRowNum()-TmuSheet.getFirstRowNum();
		System.out.println("rowCount:--------"+rowCount);

		/* Multiple platform details */		
		//Create a loop over all the rows of excel file to read it
		for (int i = 1; i < rowCount+1; i++) {
			//Loop over all the rows
			Row row = TmuSheet.getRow(i);
			//Check if the first cell contain a value, if yes, That means it is the new platform name

			if(row.getCell(0).toString().length()!=0){
				try {
					//Print device details on console
					System.out.println("Device Configuration Details:\n"
							+ "PLATFORM-----------------------"+row.getCell(0).toString()+",\n "
							+ "VERSION------------------------"+ row.getCell(1).toString()+",\n "
							+ "DEVICE NAME--------------------"+row.getCell(2).toString()+",\n "
							+ "APP PATH-----------------------"+ row.getCell(3).toString()+",\n "
							+ "Reset--------------------------"+row.getCell(4).toString()+",\n "
							+"AUTOMATION NAME---------------"+row.getCell(5).toString()+",\n"
							+"NEWCOMMAND TIMEOUT------------"+row.getCell(6).toString());
							
					
					PlatformName=row.getCell(0).toString();
					

					appiumDriver = dobj.setUp(row.getCell(0).toString(),row.getCell(1).toString(),row.getCell(2).toString(),row.getCell(3).toString(),row.getCell(4).toString(),row.getCell(5).toString(),row.getCell(6).toString());
					
					
				}catch(Exception e)
				{
					System.out.println("Platform Configuration details are not correct");
				}
			}
			else{
				//Print the new testcase name when it started
				System.out.println("No platform details available");
			}
		}
		}catch(Exception e) {
			System.out.println("File not found");
		}
	}
	
	public String getPlatformName() {
		return PlatformName;
	}

	@Before(order=1)
	public void loginApplication() 
	{
		try {

			System.out.println("LOGGING INTO APP WITH PROVIDED CREDENTIALS....................................");
			/* Login steps */
			pageObjectManager=new PageObjectManager(appiumDriver);
			utilityManager = new UtilityManager(appiumDriver);
			loginPage=pageObjectManager.getLoginPage();
			searchPage=pageObjectManager.getSearchPage();
			//System.out.println("Available Contexts......."+appiumDriver.getContextHandles());
			loginPage.loginApp();
			/*mywait=new WebDriverWait(appiumDriver, 120);
			mywait.until(ExpectedConditions.visibilityOf(settingsPage.icon_Hamburger));*/
			}catch(Exception e){
			System.out.println(e);
			
		}
	}

public AppiumDriver<WebElement> getAppiumDriver()
	{
	
		return appiumDriver;
	}
	
@After
	public void logoutApplication() throws Exception {
		try {
			System.out.println("LOGOUT FROM THE APP.......................................");
			settingsPage = pageObjectManager.getSettingsPage();
			settingsPage.logoutApp();
			dobj.tearDown();
		}
		catch(Exception e)
		{
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(0);
			
		}
	}



}

