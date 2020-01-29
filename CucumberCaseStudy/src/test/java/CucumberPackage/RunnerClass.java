package CucumberPackage;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "feature", glue = {"CucumberPackage"},tags= ("@login"))

public class RunnerClass 
{

}
