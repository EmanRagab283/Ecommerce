@smoke
Feature: User could be able to search
  #SC4
  Scenario:user could search using product name
    When user type product name in text field of search
    And user press search button
    Then page load with search result


