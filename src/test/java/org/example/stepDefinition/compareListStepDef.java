package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.categoiesPage;
import org.example.pages.compareListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class compareListStepDef {
    org.example.pages.compareListPage compareListPage = new compareListPage(hook.driver);
    @When("user select Electronic category")
    public void electronicCategory()
    {
        Actions action = new Actions(hook.driver);
        action.moveToElement(compareListPage.electronicCategory()).perform();

    }

    @And("user select from sublist cell Phones")
    public void phoneSubList()
    {
        Actions action = new Actions(hook.driver);
        action.moveToElement(compareListPage.electronicCategory()).moveToElement(compareListPage.phoneSubList()).click().build().perform();
    }
    @Then("page direct to cell phones page")
    public void phonesPage()
    {
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/cell-phones",hook.driver.getCurrentUrl());

    }



    @And("user clicks add to compare")
    public void addCompare() throws InterruptedException {

        List<WebElement> buttons= compareListPage.addCompare();
        buttons.get(0).click();
        Thread.sleep(1000);

}

@And("user clicks add to compare on another product")
public void addcompare2() throws InterruptedException {
    List<WebElement> buttons= compareListPage.addCompare();
    buttons.get(1).click();
    Thread.sleep(1000);
}


    @And("user clicks add to compare label")
    public void compareLabel(){compareListPage.compareLabel().click();}
    @And("user goes to compare list")
    public void compareListPage()
    {
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/compareproducts",hook.driver.getCurrentUrl());
    }
}
