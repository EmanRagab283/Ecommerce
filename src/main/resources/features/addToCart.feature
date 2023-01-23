@smoke
Feature:Add to cart

  #SC9
  Scenario: Logged user could add different products to Shopping cart
  When user select Books category
  Then page direct to Books page
  And user choose product and click add to cart
  And choose another category
    And page direct to this category
  And user choose another product and click add to cart
  And user clicks add to cart label
  And user go to cart page
  And  user find his product in cart