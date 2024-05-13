package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = {"stepdefinition"},
        dryRun= false,
        snippets=SnippetType.CAMELCASE,
        monochrome =true,
        features = {"src/test/java/features/Login.feature"}
        
//             plugin= {"pretty", "html:target/Cucumber-report/report.html",
//        		"json:test/cucumber.json"}           	
        		
)
public class RunTest {

}
