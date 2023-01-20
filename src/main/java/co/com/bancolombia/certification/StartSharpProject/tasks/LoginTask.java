package co.com.bancolombia.certification.StartSharpProject.tasks;

import co.com.bancolombia.certification.StartSharpProject.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class LoginTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(LoginUserInterface.USERNAME),
                SendKeys.of("shirosanchez42@gmail.com").into(LoginUserInterface.USERNAME),
                Clear.field(LoginUserInterface.PASSWORD),
                SendKeys.of("Himawari26").into(LoginUserInterface.PASSWORD),
                Click.on(LoginUserInterface.SINGIN)

        );
    }
    public static LoginTask makeinformation(){

        return instrumented(LoginTask.class);
    }
}