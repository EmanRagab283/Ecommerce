@smoke
Feature: home page and choose currency
  #SC5
    Scenario: user choose currency
      When user select his currency from dropdown menu
      Then page reload with new currency

