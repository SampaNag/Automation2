$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Checking Sign in functionality working as a user",
  "description": "",
  "id": "checking-sign-in-functionality-working-as-a-user",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "verify user can login successfully",
  "description": "",
  "id": "checking-sign-in-functionality-working-as-a-user;verify-user-can-login-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on amazon home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user clicks \"Sign in\" link",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user types valid email \"mayanag2017@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user types valid password \"Animation@123\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks \"Sign in\" button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should landed on \"Hello, Maya\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Stepdefs.userIsOnAmazonHomePage()"
});
formatter.result({
  "duration": 168059655,
  "error_message": "java.lang.NullPointerException\r\n\tat Pages.HomePage.isUserInHomePage(HomePage.java:17)\r\n\tat Login_Stepdefs.userIsOnAmazonHomePage(Login_Stepdefs.java:20)\r\n\tat ✽.Given user is on amazon home page(src/test/resources/Login.feature:3)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign in",
      "offset": 13
    }
  ],
  "location": "Login_Stepdefs.userClicksLink(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "mayanag2017@gmail.com",
      "offset": 24
    }
  ],
  "location": "Login_Stepdefs.userTypesValidEmail(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Animation@123",
      "offset": 27
    }
  ],
  "location": "Login_Stepdefs.userTypesValidPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign in",
      "offset": 13
    }
  ],
  "location": "Login_Stepdefs.userClicksButton(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, Maya",
      "offset": 23
    }
  ],
  "location": "Login_Stepdefs.userShouldLandedOnPage(String)"
});
formatter.result({
  "status": "skipped"
});
});