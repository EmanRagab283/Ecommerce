package org.example.pages;

import org.example.stepDefinition.hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class compareListPage {

    WebDriver driver= hook.driver;

    public compareListPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public  WebElement electronicCategory()
    {
        return driver.findElement(By.xpath("//a[@href=\"/electronics\"]"));
    }
    public WebElement phoneSubList()
    {
        return driver.findElement(By.xpath("//a[@href='/cell-phones']"));
    }


    public List<WebElement> addCompare()
    {

        return hook.driver.findElements(By.className("add-to-compare-list-button"));
    }
    public WebElement compareLabel()
    {
        return hook.driver.findElement(By.xpath("//a[@href='/compareproducts']"));   }
}
