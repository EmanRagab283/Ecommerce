package org.example.pages;

import org.example.stepDefinition.hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class successfulOrderPage {

    WebDriver driver= hook.driver;
    public successfulOrderPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement AppCategory()
    {
        return driver.findElement(By.xpath("//a[@href=\"/apparel\"]"));
    }

    public WebElement accessoriesSubList()
    {
        return driver.findElement(By.xpath("//a[@href='/accessories']"));

    }

    public List<WebElement> addCart1()
    {
        return hook.driver.findElements(By.className("product-box-add-to-cart-button"));

    }


}
