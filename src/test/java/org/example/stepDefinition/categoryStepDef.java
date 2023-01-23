package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.example.pages.categoiesPage;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class categoryStepDef {
    org.example.pages.categoiesPage categoiesPage = new categoiesPage(hook.driver);
    @When("user select category")
    public void selectCategory() {
        Actions action = new Actions(hook.driver);
        //action.moveToElement(categoiesPage.selectCategory()).click().build().perform();
        action.moveToElement(categoiesPage.selectCategory()).perform();
    }
    @And("user select from sublist")
    public void subList(){
        Actions action = new Actions(hook.driver);
        action.moveToElement(categoiesPage.selectCategory()).moveToElement(categoiesPage.subList()).click().build().perform();
}
    @Then("page direct to his choice")
    public void pageDirCamera()
    {
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/camera-photo",hook.driver.getCurrentUrl());
    }











}
