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
    public WebElement selectCategory()
    {
        return driver.findElement(By.xpath("//a[@href=\"/electronics\"]"));
    }

    public WebElement subList()
    {
        return driver.findElement(By.xpath("//a[@href='/camera-photo']"));

    }







}
