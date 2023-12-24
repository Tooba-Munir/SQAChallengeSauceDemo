package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"stepDefinitions"}, monochrome = true, plugin = {"json:target/cucumber.json"})
public class TestRunner {

}
