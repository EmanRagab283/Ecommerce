package org.example.pages;

import org.example.stepDefinition.hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class resetPage {

    WebDriver driver= hook.driver;
    public resetPage (WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);

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
