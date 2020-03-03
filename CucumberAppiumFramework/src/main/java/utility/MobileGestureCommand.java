package utility;


import java.util.HashMap;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MobileGestureCommand {
	
	AppiumDriver<WebElement> driver;
	
	public MobileGestureCommand(AppiumDriver<WebElement> driver) {
		
		this.driver = driver;
	}
	
	public void tapElement_XCTest(MobileElement el) {
        try {
            // tap into center of element
        	JavascriptExecutor js = (JavascriptExecutor) driver;
        	System.out.println(el.getLocation());
        //	Point location = el.getLocation();
        	Dimension size=el.getSize();
        	double x=el.getLocation().getX() + size.getWidth()/2.0;
        	double y=el.getLocation().getY() + size.getHeight()/2.0;
        			HashMap<String, Double> point = new HashMap<String, Double>();
        			point.put("x", x);
        			point.put("y", y);
        			js.executeScript("mobile: tap", point);
        	
        	/*JavascriptExecutor js = (JavascriptExecutor) driver;
            HashMap<String, String> tapObject = new HashMap<String, String>();
            tapObject.put("x", String.valueOf(el.getSize().getWidth() / 2));
            tapObject.put("y", String.valueOf(el.getSize().getHeight() / 2));
            tapObject.put("element", el.getId());
            js.executeScript("mobile:tap", tapObject);
            //return true;*/
        } catch (Exception e) {
          System.err.println(e);  
        	//return false;
        }
    }
	
	

    public boolean swipeToDirection_iOS_XCTest(WebElement el, String direction) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            HashMap<String, String> swipeObject = new HashMap<String, String>();
            if (direction.equals("d")) {
                swipeObject.put("direction", "down");
            } else if (direction.equals("u")) {
                swipeObject.put("direction", "up");
            } else if (direction.equals("l")) {
                swipeObject.put("direction", "left");
            } else if (direction.equals("r")) {
                swipeObject.put("direction", "right");
            }
            swipeObject.put("element", ((RemoteWebElement) el).getId());
            js.executeScript("mobile:swipe", swipeObject);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
