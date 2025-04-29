package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/LoginFeature.feature",
		glue ="StepDefination",
		dryRun =false,
		monochrome = true,
		plugin = {"pretty","junit:target/cucumber-reports/reports_xml.xml","json:target/cucumber-reports/reports_json.json","html:target/cucumber-reports/reports1.html"}
		)
/*{"pretty","json:target/cucumber-reports/reports_json.json"}*/
/*plugin = {"pretty","html:target/cucumber-reports/reports1.html"}*/

public class Run{
/* this class will be empty*/

}
