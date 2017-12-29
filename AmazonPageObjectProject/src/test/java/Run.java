

import Pages.Hooks;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Login.feature",
        //tags={"@login"},
        plugin={"html:output"})


public class Run extends Hooks {

}
