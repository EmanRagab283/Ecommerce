
Feature: user could select categories

#SC6
Scenario: Logged user could select different Categories
  When user select category
  And user select from sublist
  Then page direct to his choice
#SC7
Scenario: user can filter By color
When user select category
And user select from sublist
Then page direct to his choice
And user filer by color

  #SC9
  Scenario: Logged user could add different products to Shopping cart
    When user select category
    And user select from sublist
    Then page direct to his choice
    And user clicks add to cart
    And user chooses product attribute
    And user clicks add to cart Again
    And user clicks add to cart label
    And user go to cart page
    #sc10
  Scenario: Logged user could add different products to Wishlist
    When user select category
    And user select from sublist
    Then page direct to his choice
    And user clicks add to wishlist
    And user clicks add to wishlist label
    And user goes to wishlist
#SC11
Scenario: Logged user could add different products to compare list
  When user select category
  And user select from sublist
  Then page direct to his choice
  And user clicks add to compare
  And user clicks add to compare label
  And user goes to compare list
  #SC12
  Scenario: Create successful Order
    When user select category
    And user select from sublist
    Then page direct to his choice
    And user clicks add to cart
    And user chooses product attribute
    And user clicks add to cart Again
    And user clicks add to cart label
    And user go to cart page
    And user clicks estimate shipping
    And user chooses his counry
    And user chooses his city
    And user enters his zip code
    And user clicks apply
      #SC8
  Scenario:Logged user could select different tags
    When user select category
    And page direct to category page
    Then click on tag
    And user goes to tag page



