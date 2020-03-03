package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;

public class LoginPage {
	
 WebDriver driver;
	 
	 public LoginPage(WebDriver driver) {
		 this.driver=driver;
	     PageFactory.initElements(driver, this);
	 }
	 /*
	  *************** Locators *****************
	  */
	//*[@id="login"]/form/h1/text()
	 
	 @FindAll({@FindBy(how = How.XPATH, using = "//span[text()='Login']"),
			@FindBy(xpath = "//*[@id=\"login\"]/form/h1/text()")})
		public WebElement label_Login;
	 @FindAll({@FindBy(how = How.XPATH, using = "//input[@type='text'][@name='loginUser']"),
			@FindBy(xpath = "//input[@id='username']")})
		public WebElement txtbx_UserId;
	 @FindAll({@FindBy(how = How.XPATH, using = "//input[@type='text'][@name='loginUser']"),
			@FindBy(xpath = "//input[@id='password']")})
		public WebElement txtbx_Password;
	 @FindAll({@FindBy(how = How.XPATH, using = "//input[@type='password'][@name='dspLoginPassword']"),
			@FindBy(xpath = "//input[@type='submit']")})
		public WebElement btn_Login;
	 
	 
//	 @FindBy(how = How.XPATH, using = "//input[@type='text'][@name='loginUser']") 
//	 private WebElement txtbx_UserId;
//	 @FindBy(how = How.XPATH, using = "//input[@type='password'][@name='dspLoginPassword']") 
//	 private WebElement txtbx_Password;
//	 @FindBy(how = How.XPATH, using = "//a[contains(text(),'Login')]") 
//	 private WebElement btn_Login;
	 @FindBy(how = How.XPATH, using = "//span[text()='Login']") 
	 public WebElement label_Transportationmanager;
	 @FindBy(how = How.XPATH, using = "//button[@class=\"btn btn-primary px-5 col\"][text()=' ACCEPT ']") 
	 public WebElement btn_accept;
	
	 
	 /*
	  *************** Actions*****************
	  */
	 
	 public void enter_UserId(String UserId) {
		 txtbx_UserId.sendKeys(UserId);
		 }
	 public void enter_Password(String Password) {
		 txtbx_Password.sendKeys(Password);
		 }
	 public boolean validate_LoginHeader() {
		 return label_Login.isDisplayed();
		 }
	 public void clickOn_Login() {
		 btn_Login.click();
	 }
	 public boolean validate_TransportationManagerLabel() {
		 
		 return label_Transportationmanager.isDisplayed();
	 }
	 public void clickOn_accept(){
		
		/*WebElement elm= driver.findElement(By.tagName("html"));
		elm.sendKeys(Keys.END);*/
		 JavascriptExecutor je = (JavascriptExecutor)driver;
		 WebElement elm=driver.findElement(By.xpath("//*[@id=\"eula-content\"]/div[1]/ol/li[28]/p"));
		 
		 je.executeScript("arguments[0].scrollIntoView();", elm);
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		 btn_accept.click();
	 }
	 
	 
	 /*
	  *************** Methods *****************
	  */
	 
	 public void navigateTo_HomePage() {
		 
		 driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		 
	 }
	 
	/* public void verify_LoginPage() {
		 
		 Assert.assertEquals(true,validate_LoginHeader());
	 }
	 
	 public void verify_HomePage() {
		 
		 Assert.assertEquals(true,validate_TransportationManagerLabel());
		 
	 } */
	 

}
