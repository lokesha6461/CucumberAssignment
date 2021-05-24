package cucumberFirst;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		    features= "classpath:features",
		    glue= "stepDef",
		    plugin = {"pretty",
		    		  "html:target/html/htmlreport.html",
		    		  "json:target/json/file.json",    		
		    		 },
		    monochrome = true,
		    dryRun = true
		       )

public class RunTest {
}
 