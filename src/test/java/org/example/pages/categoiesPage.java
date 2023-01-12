package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.example.stepDefinition.hook;

public class categoiesPage {
    WebDriver driver= hook.driver;
    public categoiesPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement selectCategory(){
        return driver.findElement(By.xpath("//a[@href='/apparel']"));}
    public WebElement subList(){

        return driver.findElement(By.xpath("//a[@href='/shoes']"));
    }

    public WebElement filterColor(){
        WebElement grey = hook.driver.findElement(By.id("attribute-option-14"));
        WebElement red =hook.driver.findElement(By.id("attribute-option-15"));
        WebElement blue=hook.driver.findElement(By.id("attribute-option-16"));
        if(grey.isSelected())
        {return grey;}
        else if (red.isSelected()) {return red;}
        else{return blue;}
    }
    public WebElement addCartBtn()
    {return hook.driver.findElement(By.className("product-box-add-to-cart-button"));}
//class cart-label
public WebElement cartLabel()
{
    return hook.driver.findElement(By.className("cart-label"));
}

    public WebElement wishBtn(){
        return hook.driver.findElement(By.className("add-to-wishlist-button"));
    }
    public WebElement wishlistLabel()
    {
        return hook.driver.findElement(By.className("wishlist-label"));
    }
    public WebElement addCompare()
    {
        return hook.driver.findElement(By.className("add-to-compare-list-button"));
    }
    public WebElement compareLabel()
    {
        return hook.driver.findElement(By.xpath("//a[@href='/compareproducts']"));   }


}
