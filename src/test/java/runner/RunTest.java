package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="src/test/java/feature/createLead.feature", glue= {"pages","steps"}, monochrome=true /*tags="@createLead"*/)

@RunWith(Cucumber.class)

public class RunTest {

	
	
}
