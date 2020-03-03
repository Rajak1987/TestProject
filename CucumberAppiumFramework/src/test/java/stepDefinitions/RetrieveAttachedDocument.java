package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import managers.PageObjectManager;
import managers.UtilityManager;
import pageObjects.CommonElementsPage;
import pageObjects.DocumentsPage;
import pageObjects.OfferedPage;
import pageObjects.SearchPage;
import pageObjects.StopOverviewPage;
import utility.DeviceSetup1;

public class RetrieveAttachedDocument {

	Hooks hook=new Hooks();
	DeviceSetup1 dobj =new DeviceSetup1();
	AppiumDriver<WebElement> appiumDriver= hook.getAppiumDriver();
	PageObjectManager pageObjectManager=new PageObjectManager(appiumDriver);
	UtilityManager utilityManager=new UtilityManager(appiumDriver);
	SearchPage searchPage= pageObjectManager.getSearchPage();
	StopOverviewPage stopOverviewPage=pageObjectManager.getStopOverviewPage();
	CommonElementsPage commonElementsPage=pageObjectManager.getCommonElementsPage();
	DocumentsPage documentsPage=pageObjectManager.getDocumentsPage();
	WebDriverWait mywait=new WebDriverWait(appiumDriver, 60);

	/******
	 * 
	 *Scenario: Driver should be able to retrieve the attached document from load and stop
	 */
	@When("^Driver opens Load Documents tab from Documents tab$")
	public void driver_opens_Load_Documents_tab_from_Documents_tab()  {

		try {

			stopOverviewPage.clickOn_DocumentsTab();
			mywait.until(ExpectedConditions.visibilityOf(documentsPage.tab_LoadDocuments));
			documentsPage.clickOn_LoadDocumentsTab();
			//mywait.until(ExpectedConditions.visibilityOf(documentsPage.icon_DeleteLoadDocument));
		}catch(Exception e)
		{
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}


	@When("^Driver taps on attached document link$")
	public void driver_taps_on_attached_document_link()  {

		System.out.println("*********************Unable to retrieve the document in virtual devices**********************");
	}

	@Then("^Document should be visible$")
	public void document_should_be_visible()  {

		System.out.println("*********************Unable to retrieve the document in virtual devices**********************");
	}

	@When("^Driver opens Stop Documents tab from Documents tab$")
	public void driver_opens_Stop_Documents_tab_from_Documents_tab() {
		try {
			stopOverviewPage.clickOn_DocumentsTab();
			mywait.until(ExpectedConditions.visibilityOf(documentsPage.tab_LoadDocuments));
			documentsPage.clickOn_StopDocumentsTab();
			//mywait.until(ExpectedConditions.visibilityOf(documentsPage.icon_DeleteLoadDocument));
		}catch(Exception e)
		{
			utilityManager.getTakeScreenShot();
			System.out.println(e);
			System.exit(1);
		}
	}
}
