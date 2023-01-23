package org.example.pages;

import org.example.stepDefinition.hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class filterColorsPage {
    WebDriver driver= hook.driver;
    public filterColorsPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement selectApparelCategory(){
        return driver.findElement(By.xpath("//a[@href='/apparel']"));}
    public WebElement subList_shoes(){

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




}
