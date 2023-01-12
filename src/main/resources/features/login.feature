@smoke
Feature:user could be able to login
  #SC2
  Scenario: user enter email and password
    Given user goes to login page
    When user enter "test@example.com" and "password"
    And press login button
    Then user navigate to home page
  Scenario: user enter invalid email and password
    Given user goes to login page
    When user enter "invaild@example.com" and "invaildpassword"
    And press login button
    Then error message is appeared
#SC3
    Scenario: user can resert password
     Given user choose my account tab
     And user choose change password from options
      When user navigate to change password page
      Then user enter old password
      And user enter new password
      And user confirm new password
      And click change password button
      And confirmation message is displayed
      And page navigate to login page



