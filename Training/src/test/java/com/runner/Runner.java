package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = {"src/test/resources/featurefile"},
        glue = {"com/stepdefination"},
        tags = "@Hyperlink",
        plugin = {"pretty",
                "html:target/HtmlReport.html",
                "json:target/JsonReport.json",
                "junit:target/Report.xml"},
        monochrome = true,
        dryRun = false


)


public class Runner {
}
