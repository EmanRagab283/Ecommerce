package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.categoiesPage;
import org.example.pages.wishListPage;
import org.openqa.selenium.interactions.Actions;

public class wishListStepDef {
    org.example.pages.wishListPage wishListPage =new wishListPage(hook.driver);
    @When("user select computers category")
    public void selectCategorycomputer(){
        Actions action = new Actions(hook.driver);
        action.moveToElement(wishListPage.selectCategorycomputer()).perform();
    }
    @And("user select from sublist disktops")
    public void sublistDestops(){
        Actions action = new Actions(hook.driver);
        action.moveToElement(wishListPage.selectCategorycomputer()).moveToElement(wishListPage.sublistDestops()).click().build().perform();
    }

    @Then("page direct to disktops page")
    public void pageDir2(){
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/desktops",hook.driver.getCurrentUrl());

    }

    @And("user clicks add to wishlist")
    public void wishlistBtn() throws InterruptedException {
        wishListPage.wishBtn().click();
        Thread.sleep(1000);

    }
    @And("user clicks add to wishlist label")
    public void wishlistLabel(){wishListPage.wishlistLabel().click();}
    @And("user goes to wishlist")
    public void wishlistPage()
    {
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/wishlist",hook.driver.getCurrentUrl());
    }




}
