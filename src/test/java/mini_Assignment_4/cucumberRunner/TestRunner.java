package mini_Assignment_4.cucumberRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\mini_Assignment_4\\features\\Sample.feature",
        glue = "StepDefinitions"
)
public class TestRunner {

}
