package pageObjects;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class RegistrationPage {
	 
	 public RegistrationPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	 
	 /*
	  *************** Locators *****************
	  */
	 
	 @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Sign up')]") 
	 public WebElement label_Signup;
	 @FindBy(how = How.XPATH, using = "//input[@type='text'][@name='usernamesignup']") 
	 private WebElement txtbx_UserName;
	 @FindBy(how = How.ID, using = "emailsignup") 
	 private WebElement txtbx_Email;
	 @FindBy(how = How.ID, using = "passwordsignup") 
	 private WebElement txtbx_Password;
	 @FindBy(how = How.ID, using = "passwordsignup_confirm") 
	 private WebElement txtbx_ConfirmPassword;
	 @FindBy(how = How.XPATH, using = "//input[@value='Sign up']") 
	 private WebElement btn_Signup;
	 @FindBy(how = How.XPATH, using = "//a[text()='Demo 1']") 
	 private WebElement btn_Demo1;
	 
	 /*
	  *************** Methods *****************
	  */
	 
	 
	 public boolean verify_SignUpHeader() {
			try {
			return label_Signup.isDisplayed();
			}catch(NoSuchElementException e){
		        return false;
		    }
		}
	 public void enter_UserName(String username) {
		 txtbx_UserName.sendKeys(username);
		 }
	 public void enter_Email(String email) {
		 txtbx_Email.sendKeys(email);
		 }
	 public void enter_Password(String password) {
		 txtbx_Password.sendKeys(password);
		 }
	 public void enter_confirmPassword(String confirmPassword) {
		 txtbx_ConfirmPassword.sendKeys(confirmPassword);
		 }
	 public void clickOn_SignUp() {
		 btn_Signup.click();
	 }
	 public void clickOn_Demo1() {
		 btn_Demo1.click();
	 }
}
