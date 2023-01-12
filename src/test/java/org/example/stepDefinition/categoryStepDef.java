package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.example.pages.categoiesPage;

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
    public void pageDir()
    {
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/shoes",hook.driver.getCurrentUrl());
    }
    @And ("user filer by color")
    public void filterColor()
    {categoiesPage.filterColor().click();}
    @And("user clicks add to cart")
    public void addBtn(){categoiesPage.addCartBtn().click();}
    @And("user clicks add to cart label")
    public void CartLabel(){categoiesPage.cartLabel().click();}
    @And("user go to cart page")
    public void addCartPage()
    {
     org.junit.Assert.assertEquals("https://demo.nopcommerce.com/cart",hook.driver.getCurrentUrl());
    }
    @And("user chooses product attribute")
    public void productAttribute(){
        Actions action = new Actions(hook.driver);
        WebElement att = hook.driver.findElement(By.className("valid"));
        action.moveToElement(att).click().build().perform();
        WebElement DropdownOption= hook.driver.findElement(By.xpath("//select/option[data-attr-value='21']"));
        action.moveToElement(att).moveToElement(DropdownOption).click().build().perform();
    }
    @And("user clicks add to cart Again")
    public void addCartAgain(){
        //WebElement btn=hook.driver.findElement(By.className("add-to-cart-button"));
        WebElement btn=hook.driver.findElement(By.id("add-to-cart-button-25"));
        btn.click();
    }
    @And("user clicks add to wishlist")
    public void wishlistBtn(){categoiesPage.wishBtn().click();}
    @And("user clicks add to wishlist label")
    public void wishlistLabel(){categoiesPage.wishlistLabel().click();}
    @And("user goes to wishlist")
    public void wishlistPage()
    {
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/wishlist",hook.driver.getCurrentUrl());
    }
    @And("user clicks add to compare")
    public void addCompare(){categoiesPage.addCompare().click();}
    @And("user clicks add to compare label")
    public void compareLabel(){categoiesPage.compareLabel().click();}
    @And("user goes to compare list")
    public void compareListPage()
    {
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/compareproducts",hook.driver.getCurrentUrl());
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
        sel.selectByValue("57");    }
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
    @And("page direct to category page")
    public void categoryPage(){
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/apparel",hook.driver.getCurrentUrl());
    }
    @Then("click on tag")
    public void tag(){
        //href="/computer"
        WebElement tag= hook.driver.findElement(By.xpath("//a[@href='/computer']"));
        tag.click();
    }
    @And("user goes to tag page")
    public void tagPage(){
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/computer",hook.driver.getCurrentUrl());

    }





}
