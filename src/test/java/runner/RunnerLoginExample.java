package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="featuresFile/Login.feature" , glue="stepDefinitions")
public class RunnerLoginExample {

	// it should combine the feature file and the step definition
	// Runner define
	
}
