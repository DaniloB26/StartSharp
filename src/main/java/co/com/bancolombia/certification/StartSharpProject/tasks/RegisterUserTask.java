package co.com.bancolombia.certification.StartSharpProject.tasks;
import co.com.bancolombia.certification.StartSharpProject.userinterfaces.LoginUserInterface;
import co.com.bancolombia.certification.StartSharpProject.userinterfaces.RegisterUserUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class RegisterUserTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(LoginUserInterface.REGISTER),
                SendKeys.of("Carlos Danilo Baena").into(RegisterUserUserInterface.FULLNAME),
                SendKeys.of("carlos2000ba2@gmail.com").into(RegisterUserUserInterface.EMAIL),
                SendKeys.of("carlos2000ba2@gmail.com").into(RegisterUserUserInterface.CONFIRMEMAIL),
                SendKeys.of("Himawari26").into(RegisterUserUserInterface.PASSWORD),
                SendKeys.of("Himawari26").into(RegisterUserUserInterface.CONFIRMPASSWORD),
                Click.on(RegisterUserUserInterface.SINGIN)
        );
    }

    public static RegisterUserTask makeinformation() {

        return instrumented(RegisterUserTask.class);
    }
}