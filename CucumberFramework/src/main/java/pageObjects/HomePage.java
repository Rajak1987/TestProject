package pageObjects;

import java.util.List;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;


public class HomePage {
	
	 WebDriver driver;
	 
	 public HomePage(WebDriver driver) {
		 this.driver=driver;
	     PageFactory.initElements(driver, this);
	 }
	 
	 /*
	  *************** Locators *****************
	  */
	 
	 @FindBy(how = How.XPATH, using = "//h1[text()='Log in']") 
	 public WebElement label_LoginHeader;
	 @FindBy(how = How.XPATH, using = "//input[@type='text'][@name='username']") 
	 private WebElement txtbx_UserName;
	 @FindBy(how = How.XPATH, using = "//input[@type='password'][@name='password']") 
	 private WebElement txtbx_password;
	 @FindBy(how = How.XPATH, using = "//input[@type='submit'][@value='Loginnn']") 
	 private WebElement btn_Login;
	 @FindBy(how = How.XPATH, using = "//a[text()='Join us']") 
	 private WebElement link_Joinus;
	 
	 /*
	  *************** Methods *****************
	  */
	 
	 public void clickOn_JoinusLink() {
		 link_Joinus.click();
		 }
	 public void navigateTo_HomePage() {
		 driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		 }
	 
	 public boolean verify_LoginHeader() {
			try {
			return label_LoginHeader.isDisplayed();
			}catch(NoSuchElementException e){
		        return false;
		    }
		}
	 public void enter_UserName(String username) {
		 txtbx_UserName.sendKeys(username);
		 }
	 public void enter_Password(String password) {
		 txtbx_password.sendKeys(password);
		 }
	 public void clickOn_Login() {
		 btn_Login.click();
		 }
}
