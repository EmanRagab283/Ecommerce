package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.searchPage;

public class seachStepDef {
    searchPage searchPage =new searchPage(hook.driver);
    @When("user type product name in text field of search")
    public void typeName(){
    searchPage.typeSearch().sendKeys("Apple iCam");
}
    @And("user press search button")
    public void searchBtn()
    {
       searchPage.searchBtn().click();
    }
    @Then("page load with search result")
    public void searchRes()
    {org.junit.Assert.assertEquals("https://demo.nopcommerce.com/apple-icam",hook.driver.getCurrentUrl());
    }

}
