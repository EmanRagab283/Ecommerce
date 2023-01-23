package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.successfulOrderPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class successfulOrderStepDef {

org.example.pages.successfulOrderPage successfulOrderPage=new successfulOrderPage(hook.driver);


    @When("user select category Apparel")
    public void AppCategory()
    {
       Actions action=new Actions(hook.driver);
       action.moveToElement(successfulOrderPage.AppCategory()).perform();

    }

    @And("user select from sublist accessories")
    public void accessoriesSubList()
    {
        Actions action=new Actions(hook.driver);
        action.moveToElement(successfulOrderPage.AppCategory()).moveToElement(successfulOrderPage.accessoriesSubList()).click().build().perform();
    }

    @Then("page direct to accessories page")
    public void accessoriesPage()
    {
        Assert.assertEquals("https://demo.nopcommerce.com/accessories",hook.driver.getCurrentUrl());
    }

    @And("user clicks add to cart on first product")
    public void addCart1() throws InterruptedException {
        List<WebElement> buttons= successfulOrderPage.addCart1();
        buttons.get(1).click();
        Thread.sleep(1000);
    }
    @And("user clicks add to cart on second product")
    public void addCart2()  {
        List<WebElement> buttons= successfulOrderPage.addCart1();
        buttons.get(2).click();

    }
    @And("user clicks add to cart_label")
    public void cartLab()
    {
    new WebDriverWait(hook.driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.className("ico-cart"))).click();


    }
    @And("user goes to cart page")
    public void cartPage()
    {
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/cart",hook.driver.getCurrentUrl());

    }
    @And("user clicks estimate shipping")
    public void estimateShipping()
    {
        WebElement btn=hook.driver.findElement(By.className("estimate-shipping-button"));
        btn.click();
    }
    @And("user chooses his counry")
    public void country(){
        WebElement country=hook.driver.findElement(By.id("CountryId"));
        Select sel=new Select(country);
        sel.selectByValue("1");
    }
    @And("user chooses his city")
    public void city(){//hawii
        WebElement city=hook.driver.findElement(By.id("StateProvinceId"));
        Select sel=new Select(city);
        sel.selectByVisibleText("Hawaii");    }
    @And("user enters his zip code")
    public void zipCode(){
        WebElement code=hook.driver.findElement(By.id("StateProvinceId"));
        code.sendKeys("96745");
    }
    @And("user clicks apply")
    public void applyBtn(){
        WebElement btn=hook.driver.findElement(By.className("apply-shipping-button"));
        btn.click();
    }
}
