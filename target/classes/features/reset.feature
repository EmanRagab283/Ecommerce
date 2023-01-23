@smoke
Feature: user can resert password
#SC3
Scenario: user can resert password

  Given user goes to login page
  When user enter "test@example.com" and "p@ssw0rd"
  And press login button
  And user navigate to home page

Then user choose my account tab
And user choose change password from options
And user navigate to change password page
And user enter old password
And user enter new password
And user confirm new password
And click change password button
And confirmation message is displayed
