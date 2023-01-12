@smoke
Feature:user can registe with new account
  #SC1
  Scenario:user could register with valid data
    Given user goes to regiser page
    When user selects gender type
    And user enters first name
    And user enters last name
    And user enters date of birth
    And user enters email
    And user fills password field
    And user fills confirmation password field
    Then user clicks register button
    And success message is displayed
