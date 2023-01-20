package co.com.bancolombia.certification.StartSharpProject.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
        glue = "co.com.bancolombia.certification.StartSharpProject.stepdefinitions.",
        plugin = {"rerun:target/rerunFailed/MyTestRerun.txt"},
        snippets = SnippetType.CAMELCASE
)

public class LoginRunner {


}