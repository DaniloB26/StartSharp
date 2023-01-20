package co.com.bancolombia.certification.StartSharpProject.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ChangePasswordUserInterface {
    public static final Target CURRENTPASSWORD = Target.the("current password").
            locatedBy( "//input[@id=\"ChangePasswordPanel0_OldPassword\"]");

    public static final Target NEWPASSWORD = Target.the("new password").
            locatedBy( "//input[@id=\"ChangePasswordPanel0_NewPassword\"]");

    public static final Target CONFIRMPASSWORD = Target.the("confirm password").
            locatedBy( "//input[@id=\"ChangePasswordPanel0_ConfirmPassword\"]");

    public static final Target BUTTONCONFIRM = Target.the("button confirm").
            locatedBy( "//button[@id=\"ChangePasswordPanel0_SubmitButton\"]");
}
