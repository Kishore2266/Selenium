package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features= "./Features",
		glue="stepDefinitions",
		tags = "@smoke or @regression",
		plugin= {"pretty",
				"html:reports11/newreport.html",
				"json:reports11/newreport.json",
				"rerun:target/rerun.txt",    //Mandatory to capture failures
		}
		)



public class TestRunner {

}
