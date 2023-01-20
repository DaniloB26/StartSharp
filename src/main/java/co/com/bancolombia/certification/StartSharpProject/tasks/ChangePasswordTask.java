package co.com.bancolombia.certification.StartSharpProject.tasks;


import co.com.bancolombia.certification.StartSharpProject.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class ChangePasswordTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(LoginUserInterface.USERNAME),
                SendKeys.of("shirosanchez42@gmail.com").into(LoginUserInterface.USERNAME),
                Clear.field(LoginUserInterface.PASSWORD),
                SendKeys.of("Himawari26").into(LoginUserInterface.PASSWORD),
                Click.on(LoginUserInterface.SINGIN),
                Click.on(DashboardUserInterface.USER),
                Click.on(DashboardUserInterface.CHANGEPASSWORD),
                SendKeys.of("Himawari26").into(ChangePasswordUserInterface.CURRENTPASSWORD),
                SendKeys.of("Himawari36").into(ChangePasswordUserInterface.NEWPASSWORD),
                SendKeys.of("Himawari36").into(ChangePasswordUserInterface.CONFIRMPASSWORD),
                Click.on(ChangePasswordUserInterface.BUTTONCONFIRM)

        );
    }
    public static ChangePasswordTask makeinformation(){

        return instrumented(ChangePasswordTask.class);
    }
}
