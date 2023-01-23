@smoke
Feature:Add prodct to comare list

  #SC11
  Scenario: Logged user could add different products to compare list
  When user select Electronic category
  And user select from sublist cell Phones
  Then page direct to cell phones page
  And user clicks add to compare
    And user clicks add to compare on another product
  And user clicks add to compare label
  And user goes to compare list