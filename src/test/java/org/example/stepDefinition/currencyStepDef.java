package org.example.stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class currencyStepDef {
    @When("user select his currency from dropdown menu")
    public void chooseCurrency()
    {
        Select currenies =new Select(hook.driver.findElement(By.id("customerCurrency")));

    }
    @Then("page reload with new currency")
    public void reloadNewCurrency() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("https://demo.nopcommerce.com/",hook.driver.getCurrentUrl());
    }


}
