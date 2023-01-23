@smoke
Feature:filter by color
#SC7
Scenario: user can filter By color
When user select Apparel category
And user select from sublist shoes
Then page direct to his choice shoes page
And user filer by color