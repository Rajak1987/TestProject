$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Registration2.feature");
formatter.feature({
  "line": 2,
  "name": "Login feature",
  "description": "Description: This feature has registration functionality scenarios",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@RegistrationFeature"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Create a new user",
  "description": "Description:this scenario validates the successfull registration",
  "id": "login-feature;create-a-new-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@SuccessfulRegistration"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "click Join us to create a new user account",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Signup page should be opened",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "enter \"\u003cUserName\u003e\" and \"\u003cEmail\u003e\" and \"\u003cPassword\u003e\" and \"\u003cConfirmPassword\u003e\" and submit",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user is created successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "login-feature;create-a-new-user;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Email",
        "Password",
        "ConfirmPassword"
      ],
      "line": 15,
      "id": "login-feature;create-a-new-user;;1"
    },
    {
      "cells": [
        "UserName1",
        "Email1",
        "Password1",
        "ConfirmPassword1"
      ],
      "line": 16,
      "id": "login-feature;create-a-new-user;;2"
    },
    {
      "cells": [
        "UserName2",
        "Email2",
        "Password2",
        "ConfirmPassword2"
      ],
      "line": 17,
      "id": "login-feature;create-a-new-user;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1896279321,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Create a new user",
  "description": "Description:this scenario validates the successfull registration",
  "id": "login-feature;create-a-new-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@SuccessfulRegistration"
    },
    {
      "line": 1,
      "name": "@RegistrationFeature"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "click Join us to create a new user account",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Signup page should be opened",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "enter \"UserName1\" and \"Email1\" and \"Password1\" and \"ConfirmPassword1\" and submit",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user is created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps_HomePage.user_is_on_homepage()"
});
formatter.result({
  "duration": 7937903097,
  "status": "passed"
});
formatter.match({
  "location": "Steps_HomePage.click_Join_us_to_create_a_new_user_account()"
});
formatter.result({
  "duration": 55015634,
  "status": "passed"
});
formatter.match({
  "location": "Steps_RegistrationPage.signup_page_should_be_opened()"
});
formatter.result({
  "duration": 73779245,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UserName1",
      "offset": 7
    },
    {
      "val": "Email1",
      "offset": 23
    },
    {
      "val": "Password1",
      "offset": 36
    },
    {
      "val": "ConfirmPassword1",
      "offset": 52
    }
  ],
  "location": "Steps_RegistrationPage.enter_valid_user_details_and_submit(String,String,String,String)"
});
formatter.result({
  "duration": 2266249550,
  "status": "passed"
});
formatter.match({
  "location": "Steps_HomePage.user_is_created_successfully()"
});
formatter.result({
  "duration": 42759546,
  "status": "passed"
});
formatter.after({
  "duration": 65740,
  "status": "passed"
});
formatter.after({
  "duration": 167783821,
  "status": "passed"
});
formatter.before({
  "duration": 1198488831,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Create a new user",
  "description": "Description:this scenario validates the successfull registration",
  "id": "login-feature;create-a-new-user;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@SuccessfulRegistration"
    },
    {
      "line": 1,
      "name": "@RegistrationFeature"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "click Join us to create a new user account",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Signup page should be opened",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "enter \"UserName2\" and \"Email2\" and \"Password2\" and \"ConfirmPassword2\" and submit",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user is created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps_HomePage.user_is_on_homepage()"
});
formatter.result({
  "duration": 8468273712,
  "status": "passed"
});
formatter.match({
  "location": "Steps_HomePage.click_Join_us_to_create_a_new_user_account()"
});
formatter.result({
  "duration": 54637660,
  "status": "passed"
});
formatter.match({
  "location": "Steps_RegistrationPage.signup_page_should_be_opened()"
});
formatter.result({
  "duration": 60065003,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UserName2",
      "offset": 7
    },
    {
      "val": "Email2",
      "offset": 23
    },
    {
      "val": "Password2",
      "offset": 36
    },
    {
      "val": "ConfirmPassword2",
      "offset": 52
    }
  ],
  "location": "Steps_RegistrationPage.enter_valid_user_details_and_submit(String,String,String,String)"
});
formatter.result({
  "duration": 1971341208,
  "status": "passed"
});
formatter.match({
  "location": "Steps_HomePage.user_is_created_successfully()"
});
formatter.result({
  "duration": 40454572,
  "status": "passed"
});
formatter.after({
  "duration": 25163,
  "status": "passed"
});
formatter.after({
  "duration": 165768223,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 20,
  "name": "New user must be login into app",
  "description": "",
  "id": "login-feature;new-user-must-be-login-into-app",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@LoginTest"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Login page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "enter valid \"\u003cEmail\u003e\" and \"\u003cPassword\u003e\" and click login",
  "keyword": "When "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "login-feature;new-user-must-be-login-into-app;",
  "rows": [
    {
      "cells": [
        "Email",
        "Password"
      ],
      "line": 26,
      "id": "login-feature;new-user-must-be-login-into-app;;1"
    },
    {
      "cells": [
        "Email1",
        "Password1"
      ],
      "line": 27,
      "id": "login-feature;new-user-must-be-login-into-app;;2"
    },
    {
      "cells": [
        "Email2",
        "Password2"
      ],
      "line": 28,
      "id": "login-feature;new-user-must-be-login-into-app;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1176201214,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "New user must be login into app",
  "description": "",
  "id": "login-feature;new-user-must-be-login-into-app;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@RegistrationFeature"
    },
    {
      "line": 19,
      "name": "@LoginTest"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Login page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "enter valid \"Email1\" and \"Password1\" and click login",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Steps_HomePage.user_is_on_homepage()"
});
formatter.result({
  "duration": 5827084277,
  "status": "passed"
});
formatter.match({
  "location": "Steps_HomePage.login_page_should_be_displayed()"
});
formatter.result({
  "duration": 31287202,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Email1",
      "offset": 13
    },
    {
      "val": "Password1",
      "offset": 26
    }
  ],
  "location": "Steps_RegistrationPage.enter_valid_and_and_click_login(String,String)"
});
formatter.result({
  "duration": 20416014461,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@type\u003d\u0027submit\u0027][@value\u003d\u0027Loginnn\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.149)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027IN1-1020122MBP.local\u0027, ip: \u0027fe80:0:0:0:892:5cd2:b903:632d%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: /var/folders/fv/0q160ngj0kb...}, goog:chromeOptions: {debuggerAddress: localhost:62937}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: c10ed30a9dffe9864af9efcb0351234a\n*** Element info: {Using\u003dxpath, value\u003d//input[@type\u003d\u0027submit\u0027][@value\u003d\u0027Loginnn\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\n\tat pageObjects.HomePage.clickOn_Login(HomePage.java:64)\n\tat stepDefinitions.Steps_RegistrationPage.enter_valid_and_and_click_login(Steps_RegistrationPage.java:213)\n\tat ✽.When enter valid \"Email1\" and \"Password1\" and click login(Features/Registration2.feature:24)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1569972096,
  "status": "passed"
});
formatter.after({
  "duration": 165204953,
  "status": "passed"
});
formatter.before({
  "duration": 1288909226,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "New user must be login into app",
  "description": "",
  "id": "login-feature;new-user-must-be-login-into-app;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@RegistrationFeature"
    },
    {
      "line": 19,
      "name": "@LoginTest"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Login page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "enter valid \"Email2\" and \"Password2\" and click login",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Steps_HomePage.user_is_on_homepage()"
});
formatter.result({
  "duration": 9396152708,
  "status": "passed"
});
formatter.match({
  "location": "Steps_HomePage.login_page_should_be_displayed()"
});
formatter.result({
  "duration": 31391048,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Email2",
      "offset": 13
    },
    {
      "val": "Password2",
      "offset": 26
    }
  ],
  "location": "Steps_RegistrationPage.enter_valid_and_and_click_login(String,String)"
});
formatter.result({
  "duration": 20345247165,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@type\u003d\u0027submit\u0027][@value\u003d\u0027Loginnn\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.149)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027IN1-1020122MBP.local\u0027, ip: \u0027fe80:0:0:0:892:5cd2:b903:632d%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: /var/folders/fv/0q160ngj0kb...}, goog:chromeOptions: {debuggerAddress: localhost:62970}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 86aa3a0393fc0aea441fa75c4f9b9b43\n*** Element info: {Using\u003dxpath, value\u003d//input[@type\u003d\u0027submit\u0027][@value\u003d\u0027Loginnn\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\n\tat pageObjects.HomePage.clickOn_Login(HomePage.java:64)\n\tat stepDefinitions.Steps_RegistrationPage.enter_valid_and_and_click_login(Steps_RegistrationPage.java:213)\n\tat ✽.When enter valid \"Email2\" and \"Password2\" and click login(Features/Registration2.feature:24)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 1442597965,
  "status": "passed"
});
formatter.after({
  "duration": 163215025,
  "status": "passed"
});
});