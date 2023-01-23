@smoke
Feature: Create successful Order

  #SC12
  Scenario: Create successful Order

  When user select category Apparel
  And user select from sublist accessories
  Then page direct to accessories page
  And user clicks add to cart on first product
  And user clicks add to cart on second product
  And user clicks add to cart_label
  And user goes to cart page
  And user clicks estimate shipping
  And user chooses his counry
  And user chooses his city
  And user enters his zip code
  And user clicks apply