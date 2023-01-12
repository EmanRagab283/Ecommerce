package org.example.pages;

import org.example.stepDefinition.hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class homePage {
WebDriver driver= hook.driver;
    public homePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement typeSearch()
{
    return driver.findElement(By.id("small-searchterms"));
}
public WebElement searchBtn()
{
    return driver.findElement(By.className("search-box-button"));
}


}
