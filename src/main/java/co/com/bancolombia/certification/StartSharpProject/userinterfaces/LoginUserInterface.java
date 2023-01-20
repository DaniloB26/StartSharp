package co.com.bancolombia.certification.StartSharpProject.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUserInterface {

    public static final Target REGISTER = Target.the("register").
            locatedBy( "//a[@class=\"text-decoration-none\"]");
    public static final Target USERNAME = Target.the("user name").
            locatedBy( "//input[@id=\"LoginPanel0_Username\"]");

    public static final Target PASSWORD = Target.the("password").
            locatedBy( "//input[@id=\"LoginPanel0_Password\"]");

    public static final Target SINGIN = Target.the("sing in").
            locatedBy( "//button[@id=\"LoginPanel0_LoginButton\"]");



}
