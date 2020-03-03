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
  "duration": 1620112345,
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
  "duration": 2699541637,
  "status": "passed"
});
formatter.match({
  "location": "Steps_HomePage.click_Join_us_to_create_a_new_user_account()"
});
formatter.result({
  "duration": 62840533,
  "status": "passed"
});
formatter.match({
  "location": "Steps_RegistrationPage.signup_page_should_be_opened()"
});
formatter.result({
  "duration": 79858158,
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
  "duration": 1580557633,
  "status": "passed"
});
formatter.match({
  "location": "Steps_HomePage.user_is_created_successfully()"
});
formatter.result({
  "duration": 42549962,
  "status": "passed"
});
formatter.after({
  "duration": 70303,
  "status": "passed"
});
formatter.after({
  "duration": 158959534,
  "status": "passed"
});
formatter.before({
  "duration": 1061333965,
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
  "duration": 3772274402,
  "status": "passed"
});
formatter.match({
  "location": "Steps_HomePage.click_Join_us_to_create_a_new_user_account()"
});
formatter.result({
  "duration": 73822203,
  "status": "passed"
});
formatter.match({
  "location": "Steps_RegistrationPage.signup_page_should_be_opened()"
});
formatter.result({
  "duration": 59569886,
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
  "duration": 1213730924,
  "status": "passed"
});
formatter.match({
  "location": "Steps_HomePage.user_is_created_successfully()"
});
formatter.result({
  "duration": 41193732,
  "status": "passed"
});
formatter.after({
  "duration": 23285,
  "status": "passed"
});
formatter.after({
  "duration": 163889901,
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
  "duration": 1087219641,
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
  "duration": 4159652385,
  "status": "passed"
});
formatter.match({
  "location": "Steps_HomePage.login_page_should_be_displayed()"
});
formatter.result({
  "duration": 30892684,
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
  "duration": 1049505752,
  "status": "passed"
});
formatter.after({
  "duration": 24797,
  "status": "passed"
});
formatter.after({
  "duration": 168094909,
  "status": "passed"
});
formatter.before({
  "duration": 1041361478,
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
  "duration": 2707560235,
  "status": "passed"
});
formatter.match({
  "location": "Steps_HomePage.login_page_should_be_displayed()"
});
formatter.result({
  "duration": 30548098,
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
  "duration": 1036086548,
  "status": "passed"
});
formatter.after({
  "duration": 25556,
  "status": "passed"
});
formatter.after({
  "duration": 166420524,
  "status": "passed"
});
});