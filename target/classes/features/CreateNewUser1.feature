Feature: Create new user functionality


  Background: : Land to Home Page
        Given Go to login page
    Given Enter "aibek_09" in username or email input field
    And Enter "Aibek0700112266" in password input field
    When user click on login button
    Then user should successfully logged in
  @Regression3
  Scenario: Create new user
    Given user should click Add user button in Admin Home page
    Then user in field First name write first name
    And user in field Last name write last name
    And user in field Email address write email address
    And user in field Username write username
    And user in field Password write password
    And user in field Bio name write bio
    When user click Add user button
    Then user should successfully created with correctness data





