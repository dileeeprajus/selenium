package testcases;

/**
 * Created by sarveshreddy on 19/05/17.
 */

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber-report/cucumber.html"}
        , features = "src/test/resource/features/cucumberDemo.Feature")

public class runTest {
    public void runTest(){

    }
}