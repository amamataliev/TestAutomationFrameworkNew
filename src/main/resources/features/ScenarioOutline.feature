Feature: Scenario Outline Demo
  @Outline
  Scenario Outline: Demo
    Given user enter "<email>" in email input field
    And user enter "<password>" in password input field
    When user click on Login button
    Then user should successfully sign in

    Examples:
    |email| password|
    |test@gmail.com|123|
    |test1@gmail.com|123|
    |test2@gmail.com|1234|
    |test3@gmail.com|1235|