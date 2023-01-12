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

 public WebElement accTab()
 {
     return driver.findElement(By.className("ico-account"));
 }
 public WebElement chooseChange()
 {return driver.findElement(By.className("change-password"));}
public WebElement oldpass()
{return driver.findElement(By.id("OldPassword"));}
    public WebElement newpass()
    { return driver.findElement(By.id("NewPassword")); }
    public WebElement confirmNewPass(){
        return driver.findElement(By.id("ConfirmNewPassword"));}
public WebElement changeBtn(){
        return driver.findElement(By.className("change-password-button"));}
    public By comfirmMsg(){
        return By.className("content");}










    }
