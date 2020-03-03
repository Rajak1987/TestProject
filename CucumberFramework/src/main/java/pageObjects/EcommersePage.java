package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;
import utility.WaitUtility;

public class EcommersePage {


	WebDriver driver;
	JavascriptExecutor js; 

	public EcommersePage(WebDriver driver) {
		this.driver=driver;
		js= (JavascriptExecutor)driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 *************** Locators *****************
	 */

	@FindBy(how = How.TAG_NAME, using = "html") 
	public WebElement elem;
	@FindBy(how = How.XPATH, using = "//span[text()='Power banks']") 
	public WebElement label_PowerBanks;
	@FindBy(how = How.XPATH, using = "//*[@class='_3ac-']") 
	public WebElement link_SignIn;
	@FindBy(how = How.XPATH, using = "//a[@title='Close']") 
	public WebElement icon_Close;


	/*
	 *************** Methods *****************
	 */
	public void navigateTo_HomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getEcommerseUrl());
		WaitUtility.untilPageLoadComplete(driver);
	}
	/*public void scrollDownatEnd(){
			 js.executeScript("arguments[0].scrollIntoView(true)", label_PowerBanks);
			 //js.executeScript("scroll(0,240)");
			 //elem.sendKeys(Keys.END);
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 public void scrollUpatBegin(){
			 elem.sendKeys(Keys.HOME);
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 } */
	public void clickOn_SignIn() {

		link_SignIn.click();
		WaitUtility.untilJqueryIsDone(driver);

	}
	public void clickOn_CloseIcon() {

		icon_Close.click();
		WaitUtility.untilJqueryIsDone(driver);


	}

}
