package org.example.pages;

import org.example.stepDefinition.hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class wishListPage {
    WebDriver driver= hook.driver;
    public wishListPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public WebElement selectCategorycomputer(){
        return driver.findElement(By.xpath("//a[@href='/computers']"));
    }
    public WebElement sublistDestops(){return driver.findElement(By.xpath("//a[@href='/desktops']"));}


    public WebElement wishBtn(){
        return hook.driver.findElement(By.className("add-to-wishlist-button"));
    }
    public WebElement wishlistLabel()
    {
        return hook.driver.findElement(By.className("wishlist-label"));
    }



}
