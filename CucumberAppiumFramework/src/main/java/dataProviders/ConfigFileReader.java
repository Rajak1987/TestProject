package dataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath= "configs//Configuration.properties";



	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}

	public String getDriverPath(){
		String driverPath = properties.getProperty("driverPath");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
	}

	public long getImplicitlyWait() {		
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");		
	}

	public String getCustomerId() {
		String customerId = properties.getProperty("customerId");
		if(customerId != null) return customerId;
		else throw new RuntimeException("customerId not specified in the Configuration.properties file.");
	}

	public String getUsername() {
		String Username = properties.getProperty("username");
		if(Username != null) return Username;
		else throw new RuntimeException("username not specified in the Configuration.properties file.");
	}

	public String getPassword() {
		String Password = properties.getProperty("password");
		if(Password != null) return Password;
		else throw new RuntimeException("password not specified in the Configuration.properties file.");
	}
	public String getLoadId() {
		String LoadId = properties.getProperty("LoadId");
		if(LoadId != null) return LoadId;
		else throw new RuntimeException("Load Id not specified in the Configuration.properties file.");
	}
	public String getExcelSheet() {
		String sheet = properties.getProperty("sheet");
		if(sheet != null) return sheet;
		else throw new RuntimeException("sheet not specified in the Configuration.properties file.");
	}
	public String getExcelFile() {
		String excelFile = properties.getProperty("excelFile");
		if(excelFile != null) return excelFile;
		else throw new RuntimeException("Excel file not specified in the Configuration.properties file.");
	}
	public String getExcelFilePath() {
		String excelFilePath = properties.getProperty("excelFilePath");
		if(excelFilePath != null) return excelFilePath;
		else throw new RuntimeException("Excel file path not specified in the Configuration.properties file.");
	}
	public String getCreateDockCommitmentIcon() {
		String createDockCommitmentIcon = properties.getProperty("createDockCommitmentIcon");
		if(createDockCommitmentIcon != null) return createDockCommitmentIcon;
		else throw new RuntimeException("createDockCommitmentIcon not specified in the Configuration.properties file.");
	}
	public int getDockIcons_x() {
		String dockIcons_x = properties.getProperty("dockIcons_x");
		if(dockIcons_x != null) return Integer.parseInt(dockIcons_x);
		else throw new RuntimeException("dockIcons_x not specified in the Configuration.properties file.");
	}
	public int getNavigateStop_y() {
		String NavigateStop_y = properties.getProperty("navigateStop_y");
		if(NavigateStop_y != null) return Integer.parseInt(NavigateStop_y);
		else throw new RuntimeException("navigateStop_y not specified in the Configuration.properties file.");
	}
	public int getNavigateBeforeStop_x() {
		String NavigateBeforeStop_x = properties.getProperty("navigateBeforeStop_x");
		if(NavigateBeforeStop_x != null) return Integer.parseInt(NavigateBeforeStop_x);
		else throw new RuntimeException("navigateBeforeStop_x not specified in the Configuration.properties file.");
	}
	public int getNavigateNextStop_x() {
		String NavigateNextStop_x = properties.getProperty("navigateNextStop_x");
		if(NavigateNextStop_x != null) return Integer.parseInt(NavigateNextStop_x);
		else throw new RuntimeException("navigateNextStop_x not specified in the Configuration.properties file.");
	}
	public int getDatePicker_y() {
		String datePicker_y = properties.getProperty("datePicker_y");
		if(datePicker_y != null) return Integer.parseInt(datePicker_y);
		else throw new RuntimeException("datePicker_y not specified in the Configuration.properties file.");
	}
	public int getTimePicker_y() {
		String timePicker_y = properties.getProperty("timePicker_y");
		if(timePicker_y != null) return Integer.parseInt(timePicker_y);
		else throw new RuntimeException("timePicker_y not specified in the Configuration.properties file.");
	}
	public int getTimer_y() {
		String timer_y = properties.getProperty("timer_y");
		if(timer_y != null) return Integer.parseInt(timer_y);
		else throw new RuntimeException("timer_y not specified in the Configuration.properties file.");
	}


	public int getPixelC_FlexibleOnStartTime_x() {
		String PixelC_FlexibleOnStartTime_x=properties.getProperty("pixelC_FlexibleOnStartTime_x");
		if(PixelC_FlexibleOnStartTime_x != null) return Integer.parseInt(PixelC_FlexibleOnStartTime_x);
		else throw new RuntimeException("pixelC_FlexibleOnStartTime_x not specified in the Configuration.properties file.");	
	}
	public int getPixelC_FlexibleOnStartTime_y() {
		String PixelC_FlexibleOnStartTime_y=properties.getProperty("pixelC_FlexibleOnStartTime_y");
		if(PixelC_FlexibleOnStartTime_y != null) return Integer.parseInt(PixelC_FlexibleOnStartTime_y);
		else throw new RuntimeException("pixelC_FlexibleOnStartTime_y not specified in the Configuration.properties file.");	
	}
	public int getDurationSlider_y() {
		String DurationSlider_y=properties.getProperty("durationSlider_y");
		if(DurationSlider_y != null) return Integer.parseInt(DurationSlider_y);
		else throw new RuntimeException("durationSlider_y not specified in the Configuration.properties file.");	
	}
	public int getSlider00_x() {
		String Slider00_x=properties.getProperty("slider00_x");
		if(Slider00_x != null) return Integer.parseInt(Slider00_x);
		else throw new RuntimeException("slider00_x not specified in the Configuration.properties file.");	
	}
	public int getSlider30_x() {
		String Slider30_x=properties.getProperty("slider30_x");
		if(Slider30_x != null) return Integer.parseInt(Slider30_x);
		else throw new RuntimeException("slider30_x not specified in the Configuration.properties file.");	
	}
	public int getSlider1_x() {
		String Slider1_x=properties.getProperty("slider1_x");
		if(Slider1_x != null) return Integer.parseInt(Slider1_x);
		else throw new RuntimeException("slider1_x not specified in the Configuration.properties file.");	
	}
	public int getSlider130_x() {
		String Slider130_x=properties.getProperty("slider130_x");
		if(Slider130_x != null) return Integer.parseInt(Slider130_x);
		else throw new RuntimeException("slider130_x not specified in the Configuration.properties file.");	
	}
	public int getSlider2_x() {
		String Slider2_x=properties.getProperty("slider2_x");
		if(Slider2_x != null) return Integer.parseInt(Slider2_x);
		else throw new RuntimeException("slider2_x not specified in the Configuration.properties file.");	
	}
	public int getSlider230_x() {
		String Slider230_x=properties.getProperty("slider230_x");
		if(Slider230_x != null) return Integer.parseInt(Slider230_x);
		else throw new RuntimeException("slider230_x not specified in the Configuration.properties file.");	
	}
	public int getBackButton_x() {
		String BackButton_x=properties.getProperty("backButton_x");
		if(BackButton_x != null) return Integer.parseInt(BackButton_x);
		else throw new RuntimeException("backButton_x not specified in the Configuration.properties file.");	
	}
	public int getNextButton_x() {
		String NextButton_x=properties.getProperty("nextButton_x");
		if(NextButton_x != null) return Integer.parseInt(NextButton_x);
		else throw new RuntimeException("nextButton_x not specified in the Configuration.properties file.");	
	}
	public int getDockButtons_y() {
		String DockButtons_y=properties.getProperty("dockButtons_y");
		if(DockButtons_y != null) return Integer.parseInt(DockButtons_y);
		else throw new RuntimeException("docksButton_y not specified in the Configuration.properties file.");	
	}
	public int getDocksPress_x() {
		String DocksPress_x=properties.getProperty("docksPress_x");
		if(DocksPress_x != null) return Integer.parseInt(DocksPress_x);
		else throw new RuntimeException("docksPress_x not specified in the Configuration.properties file.");	
	}
	public int getDocksPress_y() {
		String DocksPress_y=properties.getProperty("docksPress_y");
		if(DocksPress_y != null) return Integer.parseInt(DocksPress_y);
		else throw new RuntimeException("docksPress_y not specified in the Configuration.properties file.");	
	}
	public int getDocksMove_x() {
		String DocksMove_x=properties.getProperty("docksMove_x");
		if(DocksMove_x != null) return Integer.parseInt(DocksMove_x);
		else throw new RuntimeException("docksMove_x not specified in the Configuration.properties file.");	
	}
	public int getDocksMove_y() {
		String DocksMove_y=properties.getProperty("docksMove_y");
		if(DocksMove_y != null) return Integer.parseInt(DocksMove_y);
		else throw new RuntimeException("docksMove_y not specified in the Configuration.properties file.");	
	}
	public int getStopTypeIcon_x() {
		String StopTypeIcon_x=properties.getProperty("stopTypeIcon_x");
		if(StopTypeIcon_x != null) return Integer.parseInt(StopTypeIcon_x);
		else throw new RuntimeException("stopTypeIcon_x not specified in the Configuration.properties file.");	
	}
	public int getStopTypeIconFirst_y() {
		String StopTypeIconFirst_y=properties.getProperty("stopTypeIconFirst_y");
		if(StopTypeIconFirst_y != null) return Integer.parseInt(StopTypeIconFirst_y);
		else throw new RuntimeException("stopTypeIconFirst_y not specified in the Configuration.properties file.");	
	}
	public int getStopTypeIconSecond_y() {
		String StopTypeIconSecond_y=properties.getProperty("stopTypeIconSecond_y");
		if(StopTypeIconSecond_y != null) return Integer.parseInt(StopTypeIconSecond_y);
		else throw new RuntimeException("stopTypeIconSecond_y not specified in the Configuration.properties file.");	
	}
	public int getIphone7ClockTimeZero_x() {
		String Iphone7ClockTimeZero_x=properties.getProperty("iPhone7ClockTimeZero_x");
		if(Iphone7ClockTimeZero_x != null) return Integer.parseInt(Iphone7ClockTimeZero_x);
		else throw new RuntimeException("iPhone7ClockTimeZero_x not specified in the Configuration.properties file.");	
	}
	public int getIphone7ClockTimeZero_y() {
		String Iphone7ClockTimeZero_y=properties.getProperty("iPhone7ClockTimeZero_y");
		if(Iphone7ClockTimeZero_y != null) return Integer.parseInt(Iphone7ClockTimeZero_y);
		else throw new RuntimeException("iPhone7ClockTimeZero_y not specified in the Configuration.properties file.");	
	}
	public int getIphone7Slider02_x() {
		String Iphone7Slider02_x=properties.getProperty("iPhone7Slider02_x");
		if(Iphone7Slider02_x != null) return Integer.parseInt(Iphone7Slider02_x);
		else throw new RuntimeException("iPhone7Slider02_x not specified in the Configuration.properties file.");	
	}
	public int getIphone7Slider_y() {
		String Iphone7Slider_y=properties.getProperty("iPhone7Slider_y");
		if(Iphone7Slider_y != null) return Integer.parseInt(Iphone7Slider_y);
		else throw new RuntimeException("iPhone7Slider_y not specified in the Configuration.properties file.");	
	}
	public int getIphone7_FlexibleOnStartTime_x() {
		String Iphone7_FlexibleOnStartTime_x=properties.getProperty("iPhone7_FlexibleOnStartTime_x");
		if(Iphone7_FlexibleOnStartTime_x != null) return Integer.parseInt(Iphone7_FlexibleOnStartTime_x);
		else throw new RuntimeException("iPhone7_FlexibleOnStartTime_x not specified in the Configuration.properties file.");	
	}
	public int getIphone7_FlexibleOnStartTime_y() {
		String Iphone7_FlexibleOnStartTime_y=properties.getProperty("iPhone7_FlexibleOnStartTime_y");
		if(Iphone7_FlexibleOnStartTime_y != null) return Integer.parseInt(Iphone7_FlexibleOnStartTime_y);
		else throw new RuntimeException("iPhone7_FlexibleOnStartTime_y not specified in the Configuration.properties file.");	
	}
	public int getIphone7Slider00_x() {
		String Iphone7Slider00_x=properties.getProperty("iPhone7Slider00_x");
		if(Iphone7Slider00_x != null) return Integer.parseInt(Iphone7Slider00_x);
		else throw new RuntimeException("iPhone7Slider00_x not specified in the Configuration.properties file.");	
	}

	public int getIphone7Slider01_x() {
		String Iphone7Slider01_x=properties.getProperty("iPhone7Slider01_x");
		if(Iphone7Slider01_x != null) return Integer.parseInt(Iphone7Slider01_x);
		else throw new RuntimeException("iPhone7Slider01_x not specified in the Configuration.properties file.");	
	}
	public String getLicenseNumber() {
		String licenseNumber = properties.getProperty("licenseNumber");
		if(licenseNumber != null) return licenseNumber;
		else throw new RuntimeException("licenseNumber not specified in the Configuration.properties file.");
	}
	public String getDotId() {
		String dotId = properties.getProperty("dotId");
		if(dotId != null) return dotId;
		else throw new RuntimeException("dotId not specified in the Configuration.properties file.");
	}
	public String getTractorNumber() {
		String tractorNumber = properties.getProperty("tractorNumber");
		if(tractorNumber != null) return tractorNumber;
		else throw new RuntimeException("tractorNumber not specified in the Configuration.properties file.");
	}
	public int getPixelC_ConfirmStopButton_X() {
		String PixelC_ConfirmStopButton_X=properties.getProperty("pixelC_ConfirmStopButton_X");
		if(PixelC_ConfirmStopButton_X != null) return Integer.parseInt(PixelC_ConfirmStopButton_X);
		else throw new RuntimeException("pixelC_ConfirmStopButton_X not specified in the Configuration.properties file.");	
	}
	public int getPixelC_ConfirmStopButton_Y() {
		String PixelC_ConfirmStopButton_Y=properties.getProperty("pixelC_ConfirmStopButton_Y");
		if(PixelC_ConfirmStopButton_Y != null) return Integer.parseInt(PixelC_ConfirmStopButton_Y);
		else throw new RuntimeException("pixelC_ConfirmStopButton_Y not specified in the Configuration.properties file.");	
	}
	public int getPixelC_AttachPodPlusIcon_X() {
		String PixelC_AttachPodPlusIcon_X=properties.getProperty("pixelC_AttachPodPlusIcon_X");
		if(PixelC_AttachPodPlusIcon_X != null) return Integer.parseInt(PixelC_AttachPodPlusIcon_X);
		else throw new RuntimeException("pixelC_AttachPodPlusIcon_X not specified in the Configuration.properties file.");	
	}
	public int getPixelC_AttachPodPlusIcon_Y() {
		String PixelC_AttachPodPlusIcon_Y=properties.getProperty("pixelC_AttachPodPlusIcon_Y");
		if(PixelC_AttachPodPlusIcon_Y != null) return Integer.parseInt(PixelC_AttachPodPlusIcon_Y);
		else throw new RuntimeException("pixelC_AttachPodPlusIcon_Y not specified in the Configuration.properties file.");	
	}
	public int getIphone7_AttachPodPlusIcon_X() {
		String Iphone7_AttachPodPlusIcon_X=properties.getProperty("iPhone7_AttachPodPlusIcon_X");
		if(Iphone7_AttachPodPlusIcon_X != null) return Integer.parseInt(Iphone7_AttachPodPlusIcon_X);
		else throw new RuntimeException("iPhone7_AttachPodPlusIcon_X not specified in the Configuration.properties file.");	
	}
	public int getIphone7_AttachPodPlusIcon_Y() {
		String Iphone7_AttachPodPlusIcon_Y=properties.getProperty("iPhone7_AttachPodPlusIcon_Y");
		if(Iphone7_AttachPodPlusIcon_Y != null) return Integer.parseInt(Iphone7_AttachPodPlusIcon_Y);
		else throw new RuntimeException("iPhone7_AttachPodPlusIcon_Y not specified in the Configuration.properties file.");	
	}
	public int getIphone7_AttachDocumentPopoverClosebutton_X() {
		String Iphone7_AttachDocumentPopoverClosebutton_X=properties.getProperty("iPhone7_AttachDocumentPopoverClosebutton_X");
		if(Iphone7_AttachDocumentPopoverClosebutton_X != null) return Integer.parseInt(Iphone7_AttachDocumentPopoverClosebutton_X);
		else throw new RuntimeException("iPhone7_AttachDocumentPopoverClosebutton_X not specified in the Configuration.properties file.");	
	}
	public int getIphone7_AttachDocumentPopoverClosebutton_Y() {
		String Iphone7_AttachDocumentPopoverClosebutton_Y=properties.getProperty("iPhone7_AttachDocumentPopoverClosebutton_Y");
		if(Iphone7_AttachDocumentPopoverClosebutton_Y != null) return Integer.parseInt(Iphone7_AttachDocumentPopoverClosebutton_Y);
		else throw new RuntimeException("iPhone7_AttachDocumentPopoverClosebutton_Y not specified in the Configuration.properties file.");	
	}
	public int getIphone7_LoadKebabMenu_X() {
		String Iphone7_LoadKebabMenu_X=properties.getProperty("iPhone7_LoadKebabMenu_X");
		if(Iphone7_LoadKebabMenu_X != null) return Integer.parseInt(Iphone7_LoadKebabMenu_X);
		else throw new RuntimeException("iPhone7_LoadKebabMenu_X not specified in the Configuration.properties file.");	
	}
	public int getIphone7_LoadKebabMenu_Y() {
		String Iphone7_LoadKebabMenu_Y=properties.getProperty("iPhone7_LoadKebabMenu_Y");
		if(Iphone7_LoadKebabMenu_Y != null) return Integer.parseInt(Iphone7_LoadKebabMenu_Y);
		else throw new RuntimeException("iPhone7_LoadKebabMenu_Y not specified in the Configuration.properties file.");	
	}
	public int getIphone7_Stop1KebabMenu_X() {
		String Iphone7_Stop1KebabMenu_X=properties.getProperty("iPhone7_Stop1KebabMenu_X");
		if(Iphone7_Stop1KebabMenu_X != null) return Integer.parseInt(Iphone7_Stop1KebabMenu_X);
		else throw new RuntimeException("iPhone7_Stop1KebabMenu_X not specified in the Configuration.properties file.");	
	}
	public int getIphone7_Stop1KebabMenu_Y() {
		String Iphone7_Stop1KebabMenu_Y=properties.getProperty("iPhone7_Stop1KebabMenu_Y");
		if(Iphone7_Stop1KebabMenu_Y != null) return Integer.parseInt(Iphone7_Stop1KebabMenu_Y);
		else throw new RuntimeException("iPhone7_Stop1KebabMenu_Y not specified in the Configuration.properties file.");	
	}
	public int getPixelC_LoadKebabMenu_X() {
		String PixelC_LoadKebabMenu_X=properties.getProperty("pixelC_LoadKebabMenu_X");
		if(PixelC_LoadKebabMenu_X != null) return Integer.parseInt(PixelC_LoadKebabMenu_X);
		else throw new RuntimeException("pixelC_LoadKebabMenu_X not specified in the Configuration.properties file.");	
	}
	public int getPixelC_LoadKebabMenu_Y() {
		String PixelC_LoadKebabMenu_Y=properties.getProperty("pixelC_LoadKebabMenu_Y");
		if(PixelC_LoadKebabMenu_Y != null) return Integer.parseInt(PixelC_LoadKebabMenu_Y);
		else throw new RuntimeException("pixelC_LoadKebabMenu_Y not specified in the Configuration.properties file.");	
	}
	public int getPixelC_Stop1KebabMenu_X() {
		String PixelC_Stop1KebabMenu_X=properties.getProperty("pixelC_Stop1KebabMenu_X");
		if(PixelC_Stop1KebabMenu_X != null) return Integer.parseInt(PixelC_Stop1KebabMenu_X);
		else throw new RuntimeException("pixelC_Stop1KebabMenu_X not specified in the Configuration.properties file.");	
	}
	public int getPixelC_Stop1KebabMenu_Y() {
		String PixelC_Stop1KebabMenu_Y=properties.getProperty("pixelC_Stop1KebabMenu_Y");
		if(PixelC_Stop1KebabMenu_Y != null) return Integer.parseInt(PixelC_Stop1KebabMenu_Y);
		else throw new RuntimeException("pixelC_Stop1KebabMenu_Y not specified in the Configuration.properties file.");	
	}
	public int getPixelC_AttachDocumentButton_X() {
		String PixelC_AttachDocumentButton_X=properties.getProperty("pixelC_AttachDocumentButton_X");
		if(PixelC_AttachDocumentButton_X != null) return Integer.parseInt(PixelC_AttachDocumentButton_X);
		else throw new RuntimeException("pixelC_AttachDocumentButton_X not specified in the Configuration.properties file.");	
	}
	public int getPixelC_AttachDocumentButton_Y() {
		String PixelC_AttachDocumentButton_Y=properties.getProperty("pixelC_AttachDocumentButton_Y");
		if(PixelC_AttachDocumentButton_Y != null) return Integer.parseInt(PixelC_AttachDocumentButton_Y);
		else throw new RuntimeException("pixelC_AttachDocumentButton_Y not specified in the Configuration.properties file.");	
	}
	public int getPortNumber() {
		String PortNumber=properties.getProperty("portNumber");
		if(PortNumber != null) return Integer.parseInt(PortNumber);
		else throw new RuntimeException("portNumber not specified in the Configuration.properties file.");	
	}
	public String getIpAddress() {
		String IpAddress = properties.getProperty("ipAddress");
		if(IpAddress != null) return IpAddress;
		else throw new RuntimeException("ipAddress not specified in the Configuration.properties file.");
	}
	public int getIphone7_UpdateEtaDateTime_X() {
		String Iphone7_UpdateEtaDateTime_X=properties.getProperty("iPhone7_UpdateEtaDateTime_X");
		if(Iphone7_UpdateEtaDateTime_X != null) return Integer.parseInt(Iphone7_UpdateEtaDateTime_X);
		else throw new RuntimeException("iPhone7_UpdateEtaDateTime_X not specified in the Configuration.properties file.");	
	}
	public int getIphone7_UpdateEtaDateTime_Y() {
		String Iphone7_UpdateEtaDateTime_Y=properties.getProperty("iPhone7_UpdateEtaDateTime_Y");
		if(Iphone7_UpdateEtaDateTime_Y != null) return Integer.parseInt(Iphone7_UpdateEtaDateTime_Y);
		else throw new RuntimeException("iPhone7_UpdateEtaDateTime_Y not specified in the Configuration.properties file.");	
	}

}
