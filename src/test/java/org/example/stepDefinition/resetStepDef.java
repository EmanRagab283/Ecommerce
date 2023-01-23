package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.resetPage;

public class resetStepDef {

    org.example.pages.resetPage resetPage=new resetPage(hook.driver);

    @Given("user choose my account tab")
    public void accTab()
    {resetPage.accTab().click();   }
    @And("user choose change password from options")
    public void chooseChange()
    {resetPage.chooseChange().click();    }
    @When("user navigate to change password page")
    public void navChange(){
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/customer/changepassword",hook.driver.getCurrentUrl());
    }
    @Then("user enter old password")
    public void oldpass()
    {
        resetPage.oldpass().sendKeys("p@ssw0rd");
    }
    @And("user enter new password")
    public void newpass(){resetPage.newpass().sendKeys("123456");}
    @And("user confirm new password")
    public void confirmNewPass()
    {resetPage.confirmNewPass().sendKeys("123456");}
    @And("click change password button")
    public void changeBtn(){resetPage.changeBtn().click();}
    @And("page navigate to login page")
    public void navlogin(){
        org.junit.Assert.assertEquals("https://demo.nopcommerce.com/login?ReturnUrl=%2Fcustomer%2Fchangepassword",hook.driver.getCurrentUrl());
    }
    @And("confirmation message is displayed")
    public void confirm_message(){
        String excpectedRes="Email with instructions has been sent to you";
        String  actualRes=hook.driver.findElement(resetPage.comfirmMsg()).getText();
        System.out.println("actualRes : " + actualRes);
        org.junit.Assert.assertEquals(actualRes.contains(excpectedRes),true);
        org.junit.Assert.assertTrue(actualRes.contains(excpectedRes));
    }



}
