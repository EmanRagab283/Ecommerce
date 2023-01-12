package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.example.stepDefinition.hook;

public class registrationPage {
    WebDriver driver=hook.driver;
    public registrationPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    public WebElement genderElement()
    {WebElement maleElement=driver.findElement(By.className("male"));
        WebElement femaleElement=driver.findElement(By.className("female"));
    if ( maleElement.isSelected())
        {return maleElement ;}
   else  return femaleElement;
    }
    public WebElement firstNameElement()
    {
        return driver.findElement(By.id("FirstName"));
    }

    public WebElement lastNameElement()
    {
        return driver.findElement(By.id("LastName"));
    }
    public WebElement emailElement()
    {
        return driver.findElement(By.id("Email"));
    }
    public WebElement passwordElement()
    {
        return driver.findElement(By.id("Password")) ;
    }
    public WebElement confirmPasswordElement()
    {
        return driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement registerBtn()
    {
        return driver.findElement(By.id("register-button"));
    }
    public WebElement successMsg()
    {
        return driver.findElement(By.className("result"));
    }




}
