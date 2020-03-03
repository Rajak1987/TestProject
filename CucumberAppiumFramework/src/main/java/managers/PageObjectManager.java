package managers;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.WebElement;
import pageObjects.CommonElementsPage;
import pageObjects.ContactsPage;
import pageObjects.CreateDockCommitmentPages;
import pageObjects.DocksPage;
import pageObjects.DocumentsPage;
import pageObjects.LoadOverviewPage;
import pageObjects.LoginPage;
import pageObjects.OfferedPage;
import pageObjects.SearchPage;
import pageObjects.SettingsPage;
import pageObjects.StopOverviewPage;
import pageObjects.StopsPage;
import pageObjects.UpdateDockCommitmentPage;
import pageObjects.UserSettingsPage;
import pageObjects.ProcessDeliveryPage; 



public class PageObjectManager {

	AppiumDriver<WebElement> driver;
	LoginPage loginPage;
	SearchPage searchPage;
	SettingsPage settingsPage;
	StopOverviewPage stopOverviewPage;
	CreateDockCommitmentPages createDockCommitmentPages;
	CommonElementsPage commonElementsPage;
	DocksPage docksPage;
	UpdateDockCommitmentPage updateDockCommitmentPage;
	UserSettingsPage userSettingsPage;
	OfferedPage offeredPage;
	ProcessDeliveryPage processDeliveryPage;
	DocumentsPage documentsPage;
	ContactsPage contactsPage;
	LoadOverviewPage loadOverviewPage;
	StopsPage stopsPage;
	


	public PageObjectManager(AppiumDriver<WebElement> driver) {
		this.driver = driver;
	}

	public LoginPage getLoginPage() {
		return (loginPage == null) ? new LoginPage(driver) : loginPage;
	}
	public SearchPage getSearchPage() {
		return (searchPage == null) ? new SearchPage(driver) : searchPage;
	}
	public SettingsPage getSettingsPage() {
		return (settingsPage == null) ? new SettingsPage(driver) : settingsPage;
	}
	public StopOverviewPage getStopOverviewPage() {
		return (stopOverviewPage == null) ? new StopOverviewPage(driver) : stopOverviewPage;
	}
	public CreateDockCommitmentPages getCreateDockCommitmentPages() {
		return (createDockCommitmentPages == null) ? new CreateDockCommitmentPages(driver) : createDockCommitmentPages;
	}
	public CommonElementsPage getCommonElementsPage() {
		return (commonElementsPage == null) ? new CommonElementsPage(driver) : commonElementsPage;
	}
	public DocksPage getDocksPage() {
		return (docksPage == null) ? new DocksPage(driver) : docksPage;
	}
	public UpdateDockCommitmentPage getUpdateDockCommitmentPage() {
		return (updateDockCommitmentPage == null) ? new UpdateDockCommitmentPage(driver) : updateDockCommitmentPage;
	}
	public UserSettingsPage getUserSettingsPage() {
		return (userSettingsPage == null) ? new UserSettingsPage(driver) : userSettingsPage;
	}
	public OfferedPage getOfferedPage() {
		return (offeredPage == null) ? new OfferedPage(driver) : offeredPage;
	}
	public ProcessDeliveryPage getProcessDeliveryPage() {
		return (processDeliveryPage == null) ? new ProcessDeliveryPage(driver) : processDeliveryPage;
	}
	public DocumentsPage getDocumentsPage() {
		return (documentsPage == null) ? new DocumentsPage(driver) : documentsPage;
	}
	public ContactsPage getContactsPage() {
		return (contactsPage == null) ? new ContactsPage(driver) : contactsPage;
	}
	public LoadOverviewPage getLoadOverviewPage() {
		return (loadOverviewPage == null) ? new LoadOverviewPage(driver) : loadOverviewPage;
	}
	public StopsPage getStopsPage() {
		return (stopsPage == null) ? new StopsPage(driver) : stopsPage;
	}
	
}
