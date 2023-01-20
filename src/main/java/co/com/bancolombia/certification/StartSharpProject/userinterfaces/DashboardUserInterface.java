package co.com.bancolombia.certification.StartSharpProject.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
public class DashboardUserInterface {
    public static final Target USER = Target.the("user").
            locatedBy( "//a[@class=\"s-sidebar-band-link s-user-profile-link\"]");
    public static final Target CHANGEPASSWORD = Target.the("change password").
            locatedBy( "//*[@id=\"s-sidebar\"]/div[1]/ul[2]/li[3]/div/div/a[1]/span");

}
