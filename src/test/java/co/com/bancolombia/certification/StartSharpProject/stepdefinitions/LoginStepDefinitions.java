package co.com.bancolombia.certification.StartSharpProject.stepdefinitions;

import co.com.bancolombia.certification.StartSharpProject.tasks.LoginTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Danilo");

    }

    @Given("^user in the home page$")
    public void userInTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://serenity.is/demo/"));

    }


    @When("^user  filling all fields$")
    public void userFillingAllFields() {
        theActorInTheSpotlight().attemptsTo(LoginTask.makeinformation());

    }

    @Then("^user sees its dashboard$")
    public void userSeesItsDashboard() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://demo.serenity.is/demo/"));

    }
}
