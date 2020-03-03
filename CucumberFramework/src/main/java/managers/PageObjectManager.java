package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.RegistrationPage;
import pageObjects.SamplePage;
import pageObjects.TablePage;
import pageObjects.EcommersePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
 

public class PageObjectManager {
	
	 private WebDriver driver;
	 private RegistrationPage registrationPage;
	 private HomePage homePage;
	 private LoginPage loginPage;
	 private EcommersePage ecommersePage;
	 private TablePage tablePage;
	 private SamplePage samplePage;

	 
	 public PageObjectManager(WebDriver driver) {
		 
		 this.driver = driver;
		 
		 }
	 public HomePage getHomePage(){
		 
		 return (homePage == null) ? homePage = new HomePage(driver) : homePage;
		 
		 }
	 public RegistrationPage getRegistrationPage(){
		 
		 return (registrationPage == null) ? registrationPage = new RegistrationPage(driver) : registrationPage;
		 
		 }
	 public LoginPage getLoginPage(){
		 
		 return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
		 
		 }
	 public EcommersePage getEcommersePage(){
	 
	 return (ecommersePage == null) ? ecommersePage = new EcommersePage(driver) : ecommersePage;
	 
	 }
	 public TablePage getTablePage(){
		 
		 return (tablePage == null) ? tablePage = new TablePage(driver) : tablePage;
		 
		 }
	 public SamplePage getSamplePage(){
		 
		 return (samplePage == null) ? samplePage = new SamplePage(driver) : samplePage;
		 
		 }
		
}
