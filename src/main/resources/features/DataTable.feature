Feature: Data Table POJO example

  @pojo
  Scenario: FB login
    Given user is on FB page
    And enter following info
      | emailOrPhoneNumber | password   |
      | test@test.com      | Qwerty123! |
      | h1@t.com1          |h1@t.com2   |
      | h1@t.com3          |h1@t.com4   |
      | h1@t.com5          |h1@t.com6   |
      | h1@t.com7          |h1@t.com8   |