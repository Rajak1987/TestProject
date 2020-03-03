package testContext;

import managers.PageObjectManager;
import managers.WebDriverManager;
import managers.UtilityManager;

public class TestContext {
	
 private WebDriverManager webDriverManager;
 private PageObjectManager pageObjectManager;
 private UtilityManager utilityManager;
 public ScenarioContext scenarioContext;
 
 
 public TestContext(){
 webDriverManager = new WebDriverManager();
 pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
 utilityManager = new UtilityManager(webDriverManager.getDriver());
 scenarioContext = new ScenarioContext();
 }
 
 public WebDriverManager getWebDriverManager() {
 return webDriverManager;
 }
 
 public PageObjectManager getPageObjectManager() {
 return pageObjectManager;
 }
 
 public UtilityManager getUtilityManager() {
	 return utilityManager;
	 }
 
 public ScenarioContext getScenarioContext() {
	 return scenarioContext;
	 }
}

