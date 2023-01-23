package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.example.stepDefinition.hook;
public class loginPage {
    WebDriver driver= hook.driver;
    public loginPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    public WebElement emailElement()
    {
        return driver.findElement(By.id("Email")) ;
    }
   public WebElement passwordElement()
    {
        return driver.findElement(By.id("Password")) ;
    }
    public void loginSteps(String email,String password)
    {
        emailElement().sendKeys(email);
        passwordElement().sendKeys(password);
    }

    public WebElement loginBtn()
    {
        return driver.findElement(By.className("login-button"));
    }
    public By wrongPom()
    {
        return By.className("message-error");
    }










    }
