package co.com.bancolombia.certification.StartSharpProject.stepdefinitions;

import co.com.bancolombia.certification.StartSharpProject.tasks.RegisterUserTask;
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
public class RegisterUserStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Carlos");

    }

    @Given("^me as a user on the home page$")
    public void userInTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://demo.serenity.is/Account/Login/"));

    }

    @When("^user create an account filling all fields$")
    public void userCreateAnAccountFillingAllFields() {
        theActorInTheSpotlight().attemptsTo(RegisterUserTask.makeinformation());

    }


    @Then("^user sees its username$")
    public void userSeesItsUsername() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://demo.serenity.is/Account/SignUp"));
    }

}
