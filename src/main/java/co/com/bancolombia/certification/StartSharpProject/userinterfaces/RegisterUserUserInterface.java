package co.com.bancolombia.certification.StartSharpProject.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterUserUserInterface {
    public static final Target FULLNAME = Target.the("full name").
            locatedBy( "//input[@id=\"SignUpPanel0_DisplayName\"]");

    public static final Target EMAIL = Target.the("email").
            locatedBy( "//input[@id=\"SignUpPanel0_Email\"]");

    public static final Target CONFIRMEMAIL = Target.the("confirm email").
            locatedBy( "//input[@id=\"SignUpPanel0_ConfirmEmail\"]");

    public static final Target PASSWORD = Target.the("password").
            locatedBy( "//input[@id=\"SignUpPanel0_Password\"]");

    public static final Target CONFIRMPASSWORD= Target.the("confirm password").
            locatedBy( "//input[@id=\"SignUpPanel0_ConfirmPassword\"]");

    public static final Target SINGIN = Target.the("sing in").
            locatedBy( "//button[@id=\"SignUpPanel0_SubmitButton\"]");
}
