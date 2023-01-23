package org.example.pages;

import org.example.stepDefinition.hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tagsPage {

    WebDriver driver= hook.driver;
    public tagsPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement categoryForTags() {
        return hook.driver.findElement(By.xpath("//a[@href='/apparel']"));
    }

    public  WebElement tag() {
        return hook.driver.findElement(By.xpath("//a[@href='/computer']"));
    }


}
