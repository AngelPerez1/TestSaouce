package RunTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/java/", glue = { "saouceSteps" }, tags = { "@testSaouce2" })
public class RunSaouce {

}