@smoke
Feature: user could select different tags

      #SC8
      Scenario:Logged user could select different tags
      When user select category for tages
      And page direct to category page
      Then click on tag
      And user goes to tag page