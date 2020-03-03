package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;

public class TablePage {
	
	WebDriver driver;
	 
	 public TablePage(WebDriver driver) {
		 this.driver=driver;
	     PageFactory.initElements(driver, this);
	 }
	 
	 /*
	  *************** Locators *****************
	  */
	 
	 @FindAll(@FindBy(how = How.XPATH, using = "//*[@id=\"docs-content\"]/div123456/div/div[1]/div[1]/table/tbody/tr")) 
	 public List<WebElement> table_rows;
	 
	 @FindAll(@FindBy(how = How.XPATH, using = "//*[@id=\"docs-content\"]/div/div/div[1]/div[1]/table/tbody/tr[1]/td")) 
	 public List<WebElement> table_columns;
	 
	
	 
	 
	 
	 /*
	  *************** Methods *****************
	  */
	 
	 public void navigateTo_HomePage() {
		 driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		 }
	 
	 public WebElement getPerfectXpath() {
		 String req_xpath=null;
		 int MatchFound=0;
	 
	int row_count = table_rows.size();
	int col_count = table_columns.size();
	//divided xpath In three parts to pass Row_count and Col_count values.
	 String first_part = "//*[@id=\"docs-content\"]/div/div/div[1]/div[1]/table/tbody/tr[";
	 String second_part = "]/td[";
	 String third_part = "]";
	 
	 //Used for loop for number of rows.
	 outerloop:
	 for (int i=1; i<=row_count; i++){
	  //Used for loop for number of columns.
	  for(int j=1; j<=col_count; j++){
	   //Prepared final xpath of specific cell as per values of i and j.
	  String final_xpath = first_part+i+second_part+j+third_part;
	   //Will retrieve value from located cell and print It.
	   String Table_data = driver.findElement(By.xpath(final_xpath)).getText();
	   if(Table_data.equalsIgnoreCase("Ford"))
	   {
		   MatchFound=1;
	   }
	   if(Table_data.equalsIgnoreCase("prefect") && MatchFound==1)
	   {
		   req_xpath = final_xpath;
		   MatchFound=0;
		   break outerloop;
	   }
	   
	   System.out.print(Table_data +"  ");   
	  }
	   System.out.println("");
	   System.out.println("");  
	 } 
	 return driver.findElement(By.xpath(req_xpath));	 

}
}
