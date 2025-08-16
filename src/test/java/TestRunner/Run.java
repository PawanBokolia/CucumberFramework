package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
//		features=".//Features/LoginFeature.feature",  
//		features=".//Features/", 						//This is to run multiple feature files
		features={".//Features/LoginFeature.feature"},    //Run two or more feature files use {}
		glue = "StepDefination",
		dryRun =false,
		monochrome = true,
//		tags="@sanity",					//use for specific test senario
		plugin = {"pretty","junit:target/cucumber-reports/reports_xml.xml","json:target/cucumber-reports/reports_json.json","html:target/cucumber-reports/reports1.html"}
		)
/*{"pretty","json:target/cucumber-reports/reports_json.json"}*/
/*plugin = {"pretty","html:target/cucumber-reports/reports1.html"}*/

public class Run{
/* this class will be empty*/

}
