Feature: Login functionality

  Background: : Land to Home Page
    Given Go to login page

  @smoke
  Scenario: Positive: Login with valid credentials
    Given Enter "aibek_09" in username or email input field
    And Enter "Aibek0700112266" in password input field
    When user click on login button
    Then user should successfully logged in


  @Regression
  Scenario: Positive: creating user
    Given Enter "aibek_09" in username or email input field
    And Enter "Aibek0700112266" in password input field
    When user click on login button
    Then user should successfully logged in
    When user click Add user button
    Then user should be in Add user page
    And verify following field names are displayed
      | First name | Last name | Email address | Username | Password | Bio | User type | Time zone | Language |
    And enter following data to create new user


