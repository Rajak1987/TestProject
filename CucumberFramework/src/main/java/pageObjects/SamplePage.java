package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SamplePage {
	
 WebDriver driver;
	 
	 public SamplePage(WebDriver driver) {
		 this.driver=driver;
	     PageFactory.initElements(driver, this);
	 }
	 
	 /*
	  *************** Locators *****************
	  */
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='departureCalendar']") 
	 public WebElement txtbx_DepartureDate;
	//div[@class='DayPicker-Body']
	 @FindBy(how = How.XPATH, using = "//*[@class='hypflt-calendar blueGrey padR5 ico20']") 
	 public WebElement DatePicker;
	 @FindBy(how = How.XPATH, using = "//input[@id='departureCalendar']") 
	 public WebElement DatePickerbody;
	 @FindBy(how = How.XPATH, using = "//button[@class='__2fIFR __jQQz2 __ISkXc __2ke4l __34tWD __CuGkI __3oSJa __1WO99 __2sH3k']") 
	 public WebElement button_Download;
	 
	 
	 
	 
	 /*
	  *************** Actions *****************
	  */
	 
	 public WebElement getDepartureDateField() {
		 return txtbx_DepartureDate;
		 }
	 public WebElement getDepartureDatePicker() {
		 return txtbx_DepartureDate;
		 }
	 public WebElement getDatePickerBody() {
		 return txtbx_DepartureDate;
		 }
	 public WebElement getDwonloadButton() {
		 return button_Download;
		 }
}
