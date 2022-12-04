package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="featuresFile", 
glue=("stepDefinitions"),
dryRun  = false,
monochrome = true,
//plugin = {"html:report/WebReport","json:report/jsonreport.json"}
//tags = ("not @SimpleLogin")
tags = ("@DataDriven")
//tags = ("@SimpleLogin and @DataDriven")
		)
public class RunnerClass {

	// it should combine the feature file and the step definition
	// Runner define
	
}
