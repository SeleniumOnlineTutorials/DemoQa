package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=true,
		features={"src\\test\\resources\\Features\\DemoQADatatable.feature"},
		glue={"StepDefinitions"}
		)
public class DemoQATestRunner {

}
