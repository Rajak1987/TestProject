package stepDefinitions;

import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.TablePage;
import testContext.TestContext;

public class Steps_Table {
	
	
	TestContext testContext;
	TablePage tablePage;
	WebDriverWait mywait;
	
	 public Steps_Table(TestContext context) {
		 testContext = context;
		 tablePage = testContext.getPageObjectManager().getTablePage();
		 }
	
	@Given("^Navigate to home page")
	public void navigateToHomeUrl() throws Throwable {
		
		tablePage.navigateTo_HomePage();
	    
		
	}

	@When("^validate table data$")
	public void validate_table_data() throws Throwable {
		
		String result=tablePage.getPerfectXpath().getText();
		System.out.println("Result is...................."+result);
	    
	}


}
