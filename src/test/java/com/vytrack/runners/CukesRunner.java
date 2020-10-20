package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false, //dryRun = true won't execute the code inside the definitions, just will check and find the undefined steps!
        // if we put dryRun = false it will be normal execution, so dryRun=true helps us to earn time for finding the undefined steps!
        tags = "@smoke"//all the tags with smoke gonna execute even on a feature or on a scenario,
                        //you can manage your smoke or regression suite with this way!
)
public class CukesRunner {

}