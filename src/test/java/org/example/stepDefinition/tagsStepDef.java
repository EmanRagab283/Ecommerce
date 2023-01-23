package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.tagsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class tagsStepDef {
    org.example.pages.tagsPage tagsPage=new tagsPage(hook.driver);
    @When("user select category for tages")
    public void categoryForTags()
    {
        tagsPage.categoryForTags().click();
    }

    @And("page direct to category page")
    public void categoryPage(){
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/apparel",hook.driver.getCurrentUrl());
    }
    @Then("click on tag")
    public void tag()
    {
       tagsPage.tag().click();
    }
    @And("user goes to tag page")
    public void tagPage(){
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/computer",hook.driver.getCurrentUrl());
    }



}
