package org.example.testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
//feature and stepdefinition  place
@CucumberOptions(
        features = "src/main/resources/features",
        glue = {"org/example/stepDefinition"},
        plugin = {"pretty","html:target/cucumber.html",
                "json:target/cucmber.json","junit:target/cukes.xml",
                "return:target/return.txt"}
        ,tags="@smoke"
)

public class runner {
}
