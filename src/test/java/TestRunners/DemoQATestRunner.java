package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		features={"src\\test\\resources\\Features\\DemoQA.feature"},
		glue={"StepDefinitions"}
		//tags={"@smoke,@regression"}
		)
public class DemoQATestRunner {

}
