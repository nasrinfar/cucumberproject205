package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(
		features="Features",
		glue={"StepDefinitions"},
		plugin= {"html:target/cucumber-html-report"},
		//tags="@amazon",
		monochrome=false,
		dryRun = false
		)





public class BestBuyTestRunner {

}
