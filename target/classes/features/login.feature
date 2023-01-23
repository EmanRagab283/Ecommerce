@smoke
Feature:user could be able to login
  #SC2
  Scenario: user enter email and password
    Given user goes to login page
    When user enter "test@example.com" and "password"
    And press login button
    And user navigate to home page

  Scenario: user enter invalid email and password
    Given user goes to login page
    When user enter "invaild@example.com" and "invaildpassword"
    And press login button
    Then error message is appeared




