Feature: Test Orange HRM Application

  Scenario: Test Login Functionality
    Given user is on login page and open url in "incognito" browser
    When user enter valid username and password and click on login button

  Scenario: Test Home Page Functionality
    Then user validate home page logo
    And user validate home page title
    And user validate home page url
   