package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.registrationPage;
import org.openqa.selenium.By;

public class registStepDefinition {
    org.example.pages.registrationPage registrationPage=new registrationPage(hook.driver);
    @Given("user goes to regiser page")
    public void regiser_page()
    {
        hook.driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F%3Ffbclid%3DIwAR2EIfzR9bSEBDmd82eu8XkukylPKn-nuOHngnmSdmp93UxIm78iIz1yRe4");
    }
@When("user selects gender type")
public void gender()
{registrationPage.genderElement().click();}
    @And("user enters first name")
    public void firstName()
    {
        registrationPage.firstNameElement().sendKeys("eman");
    }
    @And("user enters last name")
    public void lastName(){
        registrationPage.lastNameElement().sendKeys("ragab");
    }
    @And("user enters date of birth")
    public void BirthDate(){
        hook.driver.findElement(By.name("DateOfBirthDay")).sendKeys("28");
        hook.driver.findElement(By.name("DateOfBirthMonth")).sendKeys("03");
        hook.driver.findElement(By.name("DateOfBirthYear")).sendKeys("28");
    }
    @And("user enters email")
    public void email(){
        registrationPage.emailElement().sendKeys("test@example.com");
    }

    @And("user fills password field")
    public void password()
    {
        registrationPage.passwordElement().sendKeys("p@ssw0rd");
    }
    @And("user fills confirmation password field")
    public void conPassword()
    {registrationPage.confirmPasswordElement().sendKeys("p@ssw0rd");}
    @Then("user clicks register button")
    public void registButton()
    {
        registrationPage.registerBtn().click();
    }
    @And("success message is displayed")
    public void SuccessMessage() throws InterruptedException {
         Thread.sleep(2000);
        String successMessage= registrationPage.successMsg().getText();
        System.out.println("success Message is"+successMessage);
    }
}
