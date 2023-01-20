package co.com.bancolombia.certification.StartSharpProject.stepdefinitions;

import co.com.bancolombia.certification.StartSharpProject.tasks.ChangePasswordTask;
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

public class ChangePasswordStepDefinitions {


    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Shiro");

    }

    @Given("^I as a user on the home page$")
    public void iAsAUserOnTheHomePage() {

        theActorInTheSpotlight().wasAbleTo(Open.url("https://serenity.is/demo"));
    }


    @When("^I as a user change the user password by filling in all the fields$")
    public void iAsAUserChangeTheUserPasswordByFillingInAllTheFields() {
        theActorInTheSpotlight().attemptsTo(ChangePasswordTask.makeinformation());

    }

    @Then("^I as user can see successful password change$")
    public void iAsUserCanSeeSuccessfulPasswordChange() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://demo.serenity.is/Account/ChangePassword"));

    }

}
