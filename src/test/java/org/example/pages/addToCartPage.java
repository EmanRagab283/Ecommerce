package org.example.pages;

import org.example.stepDefinition.hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class addToCartPage {

    WebDriver driver= hook.driver;
    public addToCartPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement selectBooksCategory()
    {
        return driver.findElement(By.xpath("//a[@href='/books']"));
    }


    public WebElement addCartBtn()
    {return hook.driver.findElement(By.className("product-box-add-to-cart-button"));}


    //class cart-label
    public WebElement cartLabel()
    {
        return hook.driver.findElement(By.className("cart-label"));
    }

}
