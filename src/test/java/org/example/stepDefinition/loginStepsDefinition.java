package org.example.stepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
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
    @Then("user navigate to home page")
    public void afterlogin() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("https://demo.nopcommerce.com/",hook.driver.getCurrentUrl());
    }
@Then("error message is appeared")
    public void incorrect()
    {
        String excpectedRes="Login was unsuccessful";
       String  actualRes=hook.driver.findElement(loginPage.wrongPom()).getText();
        System.out.println("actualRes : " + actualRes);
        Assert.assertEquals(actualRes.contains(excpectedRes),true);
        Assert.assertTrue(actualRes.contains(excpectedRes));
    }
    @Given("user choose my account tab")
    public void accTab()
    {loginPage.accTab().click();   }
    @And("user choose change password from options")
    public void chooseChange()
    {loginPage.chooseChange().click();    }
      @When("user navigate to change password page")
      public void navChange(){
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/customer/changepassword",hook.driver.getCurrentUrl());
      }
      @Then ("user enter old password")
      public void oldpass()
      {
          loginPage.oldpass().sendKeys("password");
      }
      @And("user enter new password")
      public void newpass(){loginPage.newpass().sendKeys("123456");}
      @And("user confirm new password")
      public void confirmNewPass()
      {loginPage.confirmNewPass().sendKeys("123456");}
    @And("click change password button")
    public void changeBtn(){loginPage.changeBtn().click();}
    @And("page navigate to login page")
    public void navlogin(){
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/login?ReturnUrl=%2Fcustomer%2Fchangepassword",hook.driver.getCurrentUrl());
    }
    @And("confirmation message is displayed")
    public void confirm_message(){
        String excpectedRes="Email with instructions has been sent to you";
        String  actualRes=hook.driver.findElement(loginPage.comfirmMsg()).getText();
        System.out.println("actualRes : " + actualRes);
        Assert.assertEquals(actualRes.contains(excpectedRes),true);
        Assert.assertTrue(actualRes.contains(excpectedRes));
    }


}
