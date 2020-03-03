package pageObjects;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import managers.FileReaderManager;
import stepDefinitions.Hooks;

public class CommonElementsPage {
	AppiumDriver<WebElement> driver;
	//ConfigFileReader configFileReader;
	Hooks hook=new Hooks();


	public CommonElementsPage(AppiumDriver<WebElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}

	/**
	 ******************************************************Locators**********************************************
	 */
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeTextField[@name=\"Customer Id\"]"),
		@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Switch to text input mode for the time input.\"]")})
	private WebElement icon_TimeInputmode;

	@FindAll({@FindBy(how = How.ID, using = "android:id/am_label"), 
		@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")})
	private WebElement label_Am;

	@FindAll({@FindBy(how = How.ID, using = "android:id/pm_label"),
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")})
	private WebElement label_Pm;

	@FindAll({@FindBy(how = How.ID, using = "android:id/input_hour"),
		@FindBy(id="android:id/hours"),
		@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[1]")})
	private WebElement txtbx_Hour;

	@FindAll({@FindBy(how = How.ID, using = "android:id/input_minute"),
		@FindBy(id="android:id/minutes"),
		@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[2]")})
	private WebElement txtbx_Minute;

	@FindBy(xpath="//XCUIElementTypeApplication[@name=\"TMUser\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[3]")
	private WebElement txtbx_DayLabel;

	@FindAll({@FindBy(how = How.ID, using = "android:id/button2"),
		@FindBy(xpath="//android.view.View[@content-desc=\"Cancel\"]"),
		@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Cancel\"]"),
		@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")})
	public WebElement btn_Cancel;

	@FindAll({@FindBy(how = How.ID, using = "android:id/button1"),
		@FindBy(xpath="//XCUIElementTypeButton[@name=\"Ok\"]"),
		@FindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")})
	public WebElement btn_Ok;

	@FindAll({@FindBy(how = How.ID, using = "android:id/button1"),
		@FindBy(xpath="//android.view.View[@content-desc=\"Done\"]"),
		@FindBy(xpath="//XCUIElementTypeButton[@name=\"Done\"]"),
		@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Done\"]")})
	public WebElement btn_Done;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//android.view.View[@content-desc=\"Done\"]"),
		@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Done\"]")})
	private WebElement btn_ConfirmStopDone;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//android.view.View[@content-desc=\"Cancel\"]"),
		@FindBy(xpath="//XCUIElementTypeButton[@name=\"Cancel\"]")})
	private WebElement btn_ConfirmStopCancel;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.ImageButton[@content-desc=\"Switch to clock mode for the time input.\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement icon_Clockmode;

	@FindAll({@FindBy(how = How.ID, using = "android:id/hours"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement Hours;

	@FindAll({@FindBy(how = How.ID, using = "android:id/minutes"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement Minutes;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"0\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement ZeroHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"1\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement OneHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"2\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement TwoHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"3\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement ThreeHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"4\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement FourHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"5\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement FiveHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"6\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement SixHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"7\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement SevenHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"8\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement EightHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"9\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement NineHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"10\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement TenHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"11\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement ElevenHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"12\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement TwelveHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"13\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement ThirteenHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"14\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement FourteenHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"15\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement FifteenHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"16\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement SixteenHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"17\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement SeventeenHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"18\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement EighteenHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"19\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement NinteenHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"20\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement TwentyHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"21\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement TwentyOneHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"22\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement TwentyTwoHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"23\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement TwentyThreeHour;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"0\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement ZeroMinute;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"5\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement FiveMinute;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"10\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement TenMinute;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"15\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement FifteenMinute;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"20\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement TwentyMinute;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"25\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement TwentyFiveMinute;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"30\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement ThirtyMinute;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"35\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement ThirtyFiveMinute;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"40\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement FourtyMinute;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"45\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement FourtyFiveMinute;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"50\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement FiftyMinute;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"55\"]"),
		@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Customer Id\"]")})
	private WebElement FiftyFiveMinute;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.view.View[@content-desc=\"Next\"]"),
		@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Next\"]")})
	private WebElement btn_Next;

	@FindAll({@FindBy(how = How.ID, using = "android:id/message"),
		@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Duration should not be zero\"]"),
		@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Duration Flexibility should be less than Duration\"]"),
		@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"No dock slots available. Please relax your criteria\"]"),
		@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Duration should fall in the same day\"]")})
	private WebElement label_Popup;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.view.View[@content-desc=\"Back\"]"),
		@FindBy(id="createDockCommitment-step1-back-btn"),
		@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Back\"]")})
	private WebElement btn_Back;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.view.View[@content-desc=\"Submit\"]"),
		@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Submit\"]")})
	public WebElement btn_Submit;

	@FindAll({@FindBy(how = How.ID, using = "android:id/button1"),
		@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Delete\"]")})
	private WebElement btn_Delete;

	@FindAll({@FindBy(how = How.ID, using = "android:id/message"),
		@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Success\"]")})
	public WebElement label_SuccessPopup;

	@FindAll({@FindBy(how = How.ID, using = "capture-image-gallery"),
		@FindBy(xpath="//android.view.View[@content-desc=\"Gallery\"]"),
		@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Gallery\"]")})
	WebElement option_Gallery;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.view.View[@content-desc=\"Capture\"]"),
		@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Capture\"]")})
	public WebElement option_Capture;

	@FindAll({@FindBy(how = How.ID, using = "com.android.camera:id/shutter_button")})
	public WebElement sbtn_Camera;

	@FindAll({@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView"),
		@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Success\"]")})
	WebElement btn_CameraCancel;

	@FindAll({@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView"),
		@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Success\"]")})
	 WebElement btn_CameraDone;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.view.View[@content-desc=\"Select\"]"),
		@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Success\"]")})
	public WebElement btn_Select;

	@FindAll({@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.TextView")})
	public WebElement option_PhotosDrive;

	@FindAll({@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout/android.widget.TextView[1]"),
		@FindBy(xpath="//XCUIElementTypeCell[@name=\"Camera Roll\"]")})
	public WebElement file_GooglePhotos;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.view.View[@content-desc=\"Photo taken on May 23, 2018 9:42:50 AM.\"]"),
		@FindBy(xpath="//XCUIElementTypeCell[@name=\"Photo, Landscape, August 09, 2012, 3:25 AM\"]")})
	public WebElement images_GooglePhotos;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.view.View[@content-desc=\"Confirm Stop\"]"),
		@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Confirm Stop\"]")})
	private WebElement btn_ConfirmStop;

	@FindAll({@FindBy(how = How.XPATH, using = "//android.view.View[@content-desc=\"Confirm Stop\"]"),
		@FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"Confirm Stop\"])[1]")})
	public WebElement title_ConfirmStop;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//android.view.View[@content-desc=\"Select\"]"),
		@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Select\"]")})
	public WebElement title_AttachDocumentPopover;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeAlert[@name=\"Allow “TMUser” to access your location?\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]"),
		@FindBy(xpath="//XCUIElementTypeButton[@name=\"Always Allow\"]")})
	public WebElement btn_AlwaysAllow;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeAlert[@name=\"Allow “TMUser” to access your location?\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]")})
	public WebElement btn_OnlyWhileUsingTheApp;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeAlert[@name=\"Allow “TMUser” to access your location?\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[5]")})
	public WebElement btn_DontAllow;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"Error\"]")})
	public WebElement title_Error;//
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeStaticText[@name=\"The user is yet to provide the permission\"]")})
	public WebElement txt_ErrorMsg;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name=\"Ok\"]")})
	public WebElement btn_ErrorOk;
	
	@FindAll({@FindBy(how = How.XPATH, using = "(//android.view.View[@content-desc=\"Attach Document\"])[2]"),
		@FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"Attach Document\"])[2]")})
	public WebElement btn_AttachDocument;
	
	@FindAll({@FindBy(how = How.ID, using = "android:id/button1"),
		@FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"XXXX")})
	public WebElement btn_Set;//
	
	@FindAll({@FindBy(how = How.XPATH, using = "//XCUIElementTypeButton[@name=\"Return to TMUser\"]")})
	public WebElement btn_ReturnToTMUser;
	
	
	/**
	 ******************************************************Functions**********************************************
	 */
	public boolean verify_AlwaysAllowbutton() {
		return btn_AlwaysAllow.isDisplayed();
	}
	public void clickOn_AlwaysAllowButton() {
		btn_AlwaysAllow.click();
	}
	public void clickOn_SetButton() {
		btn_Set.click();
	}
	public void clickOn_ReturnToTMUserButton() {
		btn_ReturnToTMUser.click();
	}
	public void clickOn_AttachDocumentButton() {
		
		if("ios".equalsIgnoreCase(hook.getPlatformName())){
		btn_AttachDocument.click();
		}
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
			(new TouchAction(driver)).tap(FileReaderManager.getInstance().getConfigReader().getPixelC_AttachDocumentButton_X(), FileReaderManager.getInstance().getConfigReader().getPixelC_AttachDocumentButton_Y()).perform();
		}
	}
	public boolean verify_AttachDocumentPopoverTitle() {
		return title_AttachDocumentPopover.isDisplayed();
	}
	public void clickOn_ConfirmStopDone() {
		btn_ConfirmStopDone.click();
	}
	public void clickOn_ConfirmStopCancel() {
		btn_ConfirmStopCancel.click();
	}
	public void clickOn_PickupStopConfirmStopButton() {
		(new TouchAction(driver)).tap(FileReaderManager.getInstance().getConfigReader().getPixelC_ConfirmStopButton_X(), FileReaderManager.getInstance().getConfigReader().getPixelC_ConfirmStopButton_Y()).perform();
		
	}
	public void clickOn_ConfirmStopButton() {
		btn_ConfirmStop.click();
	}
	public void selectPhoto(){
		images_GooglePhotos.click();
		try { Thread.sleep(2000);}
		catch (InterruptedException e) {}
	}
	public void clickOn_PhotosFile(){
		file_GooglePhotos.click();
		try { Thread.sleep(2000);}
		catch (InterruptedException e) {}
	}
	public void selectPhotosDrive(){
		option_PhotosDrive.click();
		try { Thread.sleep(2000);}
		catch (InterruptedException e) {}
	}
	public void clickOn_Select() {
		btn_Select.click();
		try { Thread.sleep(2000);}
		catch (InterruptedException e) {}
	}
	public void clickOn_CameraDone() {
		btn_CameraDone.click();
		try { Thread.sleep(2000);}
		catch (InterruptedException e) {}
	}
	public void clickOn_CameraCencel() {
		btn_CameraCancel.click();
		try { Thread.sleep(2000);}
		catch (InterruptedException e) {}
	}
	public void clickOn_CameraShutterButton() {
		sbtn_Camera.click();
		try { Thread.sleep(2000);}
		catch (InterruptedException e) {}
	}
	public void selectGallery() {
		option_Gallery.click();
		try { Thread.sleep(2000);}
		catch (InterruptedException e) {}
	}
	public void selectCapture() {
		option_Capture.click();
		try { Thread.sleep(2000);}
		catch (InterruptedException e) {}
	}

	public void uploadCapturedImage() {
		selectCapture();
		clickOn_CameraShutterButton();
		clickOn_CameraDone();
		clickOn_PhotosFile();
		selectPhoto();
	}

	public void uploadGalleryImage() {
		selectGallery();
		selectPhotosDrive();



	}

	public void selectHour() {
		Hours.click();
		try { Thread.sleep(2000);}
		catch (InterruptedException e) {}
	}
	public void setOnlyHourValue(String hour) {
		WebElement e1=driver.findElementByAccessibilityId(hour);
		e1.click();
	}
	public void selectMinute() {
		Minutes.click();
	}

	public void selectZeroHour() {
		WebElement e1=driver.findElementByAccessibilityId("1");
		e1.click();
		//OneHour.click();
	}
	public void selectOneHour() {
		WebElement e1=driver.findElementByAccessibilityId("1");
		e1.click();
		//OneHour.click();
	}
	public void selectTwoHour() {
		WebElement e1=driver.findElementByAccessibilityId("2");
		e1.click();
		//TwoHour.click();
	}
	public void selectThreeHour() {
		WebElement e1=driver.findElementByAccessibilityId("3");
		e1.click();
		//ThreeHour.click();
	}
	public void selectFourHour() {
		FourHour.click();
	}
	public void selectFiveHour() {
		WebElement e1=driver.findElementByAccessibilityId("5");
		e1.click();
		//FiveHour.click();
	}
	public void selectSixHour() {
		SixHour.click();
	}
	public void selectSevenHour() {
		SevenHour.click();
	}
	public void selectEightHour() {
		WebElement e1=driver.findElementByAccessibilityId("8");
		e1.click();
		//EightHour.click();
	}
	public void selectNineHour() {
		NineHour.click();
	}
	public void selectTenHour() {
		WebElement e1=driver.findElementByAccessibilityId("10");
		e1.click();
		//TenHour.click();
	}
	public void selectElevenHour() {
		WebElement e1=driver.findElementByAccessibilityId("11");
		e1.click();
		//ElevenHour.click();
	}
	public void selectTwelveHour() {
		TwelveHour.click();
	}

	public void selectThirteenHour() {
		ThirteenHour.click();
	}
	public void selectFourteenHour() {
		FourteenHour.click();
	}
	public void selectFifteenHour() {
		FifteenHour.click();
	}
	public void selectSixteenHour() {
		SixteenHour.click();
	}
	public void selectSeventeenHour() {
		SeventeenHour.click();
	}
	public void selectEighteenHour() {
		EighteenHour.click();
	}
	public void selectNinteenHour() {
		NinteenHour.click();
	}
	public void selectTwentyHour() {
		TwentyHour.click();
	}

	public void selectTwentyoneHour() {
		TwentyOneHour.click();
	}
	public void selectTwentytwoHour() {
		TwentyTwoHour.click();
	}
	public void selectTwentythreeHour() {
		TwentyThreeHour.click();
	}
	public void selectZeroMinute() {
		ZeroMinute.click();
	}
	public void selectFiveMinute() {
		FiveMinute.click();
	}
	public void selectTenMinute() {
		TenMinute.click();
	}
	public void FifteenMinute() {
		FifteenMinute.click();
	}
	public void selectTwentyMinute() {
		TwentyMinute.click();
	}
	public void selectTwentyFiveMinute() {
		TwentyFiveMinute.click();
	}
	public void selectThirtyMinute() {
		ThirtyMinute.click();
	}
	public void selectThirtyFiveMinute() {
		ThirtyFiveMinute.click();
	}
	public void selectFourtyMinute() {
		FourtyMinute.click();
	}
	public void selectFourtyfiveMinute() {
		FourtyFiveMinute.click();
	}
	public void selectFiftyMinute() {
		FiftyMinute.click();
	}
	public void selectFiftyfiveMinute() {
		FiftyFiveMinute.click();
	}
	public void clickOn_NextButton() {
		btn_Next.click();
		try { Thread.sleep(3000);}
		catch (InterruptedException e) {}
	}
	public void clickOn_Ok() {
		btn_Ok.click();
		try { Thread.sleep(5000);}
		catch (InterruptedException e) {}
	}
	public void clickOn_Cancel() {
		btn_Cancel.click();
		try { Thread.sleep(1000);}
		catch (InterruptedException e) {}
	}
	public boolean verify_PopupLabel() {
		return label_Popup.isDisplayed();
	}
	public void clickOn_Back() {
		btn_Back.click();
		try { Thread.sleep(1000);}
		catch (InterruptedException e) {}
	}
	public void clickOn_Delete() {
		btn_Delete.click();
		try { Thread.sleep(3000);}
		catch (InterruptedException e) {}
	}

	public void clickOn_Done() {
		btn_Done.click();
		try { Thread.sleep(3000);}
		catch (InterruptedException e) {}
	}

	public void clickOn_Submit() {
		btn_Submit.click();
		try { Thread.sleep(3000);}
		catch (InterruptedException e) {}
	}


	public void setStartTime(String hour, String minute, String dayLabel) {



		if("ios".equalsIgnoreCase(hook.getPlatformName())){
			txtbx_Hour.sendKeys(hour);
			txtbx_Minute.sendKeys(minute);
			txtbx_DayLabel.sendKeys(dayLabel);
			btn_Done.click();

		}
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
			switch(hour) {
			case "8":
				selectEightHour();
				break;
			case "5":
				selectFiveHour();
				break;
			default:
				txtbx_Hour.sendKeys(hour);
				break;
			}
			selectMinute();
			WebElement e1=driver.findElementByAccessibilityId(minute);
			e1.click();
			if("AM".equalsIgnoreCase(dayLabel)) {

				label_Am.click();
			}
			if("PM".equalsIgnoreCase(dayLabel)) {
				label_Pm.click();
			}
			btn_Ok.click();

		}

		try { Thread.sleep(1000);}
		catch (InterruptedException e) {}
	}

	public boolean verify_SuccessPopupLabel()
	{
		return label_SuccessPopup.isDisplayed();
	}
	public void setDuration(String hour, String minute) {
		if("ios".equalsIgnoreCase(hook.getPlatformName())){

			(new TouchAction(driver)).tap(FileReaderManager.getInstance().getConfigReader().getIphone7ClockTimeZero_x(), FileReaderManager.getInstance().getConfigReader().getIphone7ClockTimeZero_y()).perform();
		
		switch(hour) {
		case "00":
			txtbx_Minute.sendKeys(minute);
			break;
		case "02":
			for(int i=0;i<2;i++) {
				txtbx_Hour.sendKeys(hour);
			}
			txtbx_Minute.sendKeys(minute);
			break;
		case "10":
			for(int i=0;i<2;i++) {
				txtbx_Hour.sendKeys(hour);
			}
			txtbx_Minute.sendKeys(minute);
			break;
		case "18":
			for(int i=0;i<2;i++) {
				txtbx_Hour.sendKeys(hour);
			}
			txtbx_Minute.sendKeys(minute);
			break;

		default:
			txtbx_Hour.sendKeys(hour);
			txtbx_Minute.sendKeys(minute);
			break;
		}
		}
		if("Android".equalsIgnoreCase(hook.getPlatformName())){
			//txtbx_Hour.sendKeys(hour);
			//ZeroHour.click();
		
		WebElement e1=driver.findElementByAccessibilityId(hour);
		e1.click();
		WebElement e2=driver.findElementByAccessibilityId(minute);
		e2.click();
		
	}
		btn_Done.click();
		try { Thread.sleep(3000);}
		catch (InterruptedException e) {}
	}

	public void setDurationFlexibility(String time) {
		switch (time) {
		case "2:00":
			//Perform click
			(new TouchAction(driver)).tap(FileReaderManager.getInstance().getConfigReader().getIphone7Slider02_x(), FileReaderManager.getInstance().getConfigReader().getIphone7Slider_y()).perform();
			try { Thread.sleep(1000);}
			catch (InterruptedException e) {}
			break;
		case "0:00":
			(new TouchAction(driver)).tap(FileReaderManager.getInstance().getConfigReader().getIphone7Slider00_x(), FileReaderManager.getInstance().getConfigReader().getIphone7Slider_y()).perform();
			break;
		case "1:00":
			(new TouchAction(driver)).tap(FileReaderManager.getInstance().getConfigReader().getIphone7Slider01_x(), FileReaderManager.getInstance().getConfigReader().getIphone7Slider_y()).perform();
			break;
		default:
			break;
		}

	}


}
