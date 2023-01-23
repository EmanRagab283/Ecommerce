package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.filterColorsPage;
import org.openqa.selenium.interactions.Actions;

public class filterColorStepDefinition {

    org.example.pages.filterColorsPage filterColorsPage = new filterColorsPage(hook.driver);
    @When("user select Apparel category")
    public void selectApparelCategory(){
        Actions action = new Actions(hook.driver);
        action.moveToElement(filterColorsPage.selectApparelCategory()).perform();
    }
    @And("user select from sublist shoes")
    public void subList_shoes(){
        Actions action = new Actions(hook.driver);
        action.moveToElement(filterColorsPage.selectApparelCategory()).moveToElement(filterColorsPage.subList_shoes()).click().build().perform();
    }
    @Then("page direct to his choice shoes page")
    public void pageDirShoes()
    {
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/shoes",hook.driver.getCurrentUrl());
    }
    @And ("user filer by color")
    public void filterColor()
    {filterColorsPage.filterColor().click();}


}
