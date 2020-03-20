package testCucumber1;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/features/Feature1.feature",
        glue = "testCucumber1"
)
public class CucumberTest1 {

}
