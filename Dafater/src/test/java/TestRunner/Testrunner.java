package TestRunner;


import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = {"org.examples.stepDefs"},
        plugin = { "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
        tags = "@Regression"
)
public class Testrunner {
}
