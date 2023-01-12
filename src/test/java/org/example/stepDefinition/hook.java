package org.example.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hook {
    public static WebDriver driver;
    @Before
    public void open_Browser() throws InterruptedException {
        String chromePath=System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("chrome.driver",chromePath );
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(10000);
        driver.get("https://demo.nopcommerce.com/");
    }
   @After
   public void closeBrowser() throws InterruptedException {
       Thread.sleep(10000);
       driver.close();
   }

}
