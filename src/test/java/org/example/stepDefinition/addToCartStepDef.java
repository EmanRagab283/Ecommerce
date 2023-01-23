package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.addToCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class addToCartStepDef {

    org.example.pages.addToCartPage addToCartPage=new addToCartPage(hook.driver);
    @When("user select Books category")
    public void selectBooksCategory() {

        addToCartPage.selectBooksCategory().click();
    }

    @Then("page direct to Books page")
    public void pageDirBooks()
    {
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/books",hook.driver.getCurrentUrl());
    }

    @And("user choose product and click add to cart")
    public void chooseFirstPoduct()
    {
        addToCartPage.addCartBtn().click();
    }

    @And("choose another category")
    public void selectAnotherCategory() {
        WebElement category=hook.driver.findElement(By.xpath("//a[@href='/digital-downloads']"));
        category.click();
    }
    @And("page direct to this category")
    public void page_dir2()
    {
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/digital-downloads",hook.driver.getCurrentUrl());

    }
    @And("user choose another product and click add to cart")
    public void chooseSecondPoduct() throws InterruptedException {
        addToCartPage.addCartBtn().click();
        Thread.sleep(1000);
        WebElement cart2=hook.driver.findElement(By.id("add-to-cart-button-35"));
        cart2.click();
    }

    @And("user clicks add to cart label")
    public void CartLabel(){
        addToCartPage.cartLabel().click();
    }


    @And("user go to cart page")
    public void addCartPage()
    {
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/cart",hook.driver.getCurrentUrl());
    }
    @And ("user find his product in cart")
  public void productsInCart(){
       WebElement product1=hook.driver.findElement(By.xpath("//a[@href=\"/night-visions\"]"));
      WebElement product2=hook.driver.findElement(By.xpath("//a[@href=\"/if-you-wait-donation\"]"));
      boolean product11=product1.isDisplayed();
      boolean product22=product2.isDisplayed();
           if(product11)
           {
               System.out.println("product 1 ");
           }
           if (product22)
           {
               System.out.println("product 2 ");
           }


    }


}
