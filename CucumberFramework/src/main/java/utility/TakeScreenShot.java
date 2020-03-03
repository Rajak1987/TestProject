package utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class TakeScreenShot {
		
String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	
	String fileWithPath = "/Users/1020122/eclipse-workspace1/CucumberFramework/Failure_ScreenShots/"+timeStamp+".png";
	//String fileWithPath  = FileReaderManager.getInstance().getConfigReader().getFailureScreenShotsPath()+timeStamp+".png";
	public TakeScreenShot(WebDriver driver) {
		//Convert web driver object to TakeScreenshot
		
        try {
		TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }catch(Exception e)
        {
    	System.out.println("Unable to take screen shot");
        }
	
}

}
