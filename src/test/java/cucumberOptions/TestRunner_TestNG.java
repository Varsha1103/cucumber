package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/features",
glue="stepDefinitions",tags="@selTestNew"
)
public class TestRunner_TestNG extends AbstractTestNGCucumberTests{

}
