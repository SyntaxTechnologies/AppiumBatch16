package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src/test/resources/features/",
        glue="steps",
        plugin= {"pretty"} ,
       // monochrome = true,
        //strict = true,
        dryRun = false,
        tags = "@test"
)


public class RunnerClass {


}
