package org.example.stepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import org.testng.Assert;
import org.example.pages.loginPage;

public class loginStepsDefinition {
    org.example.pages.loginPage loginPage=new loginPage(hook.driver);
    @Given("user goes to login page")
    public void loginpage(){
       hook.driver.navigate().to("https://demo.nopcommerce.com/login?returnurl=%2F");   }
    @When("^user enter \"(.*)\" and \"(.*)\"$")
    public void email_password(String email,String password)
    {
        loginPage.loginSteps(email,password);
    }

     @And("press login button")
     public void loginBtn()
     {
         loginPage.loginBtn().click();
     }
    @And("user navigate to home page")
    public void afterlogin() throws InterruptedException {
        Thread.sleep(2000);
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/",hook.driver.getCurrentUrl());
    }
@Then("error message is appeared")
    public void incorrect()
    {
        String excpectedRes="Login was unsuccessful";
       String  actualRes=hook.driver.findElement(loginPage.wrongPom()).getText();
        System.out.println("actualRes : " + actualRes);
        org.junit.Assert.assertEquals(actualRes.contains(excpectedRes),true);
        org.junit.Assert.assertTrue(actualRes.contains(excpectedRes));
    }

}
