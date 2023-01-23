package org.example.stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;

public class currencyStepDef {

    @When("user select his currency from dropdown menu")
    public void chooseCurrency()
    {
        WebElement currency=hook.driver.findElement(By.id("customerCurrency"));
        Select curr=new Select(currency);
       curr.selectByVisibleText("Euro");

    }
    @Then("page reload with new currency")
    public void reloadNewCurrency() throws InterruptedException {
        Thread.sleep(2000);
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/",hook.driver.getCurrentUrl());

    }


}
