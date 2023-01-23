@smoke
Feature: add to wishlist

    #sc10
    Scenario: Logged user could add different products to Wishlist
    When user select computers category
    And user select from sublist disktops
    Then page direct to disktops page
    And user clicks add to wishlist
    And user clicks add to wishlist label
    And user goes to wishlist