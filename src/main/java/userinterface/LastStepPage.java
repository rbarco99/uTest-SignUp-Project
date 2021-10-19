package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastStepPage {

    public static final Target INPUT_PASSWORD = Target.the("where you enter your password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where you confirm your password")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_STAY_INFORMED = Target.the("where you check to active rhe news letter option")
            .located(By.xpath("//input[@name='newsletterOptIn']"));
    public static final Target CHECK_TERMS_OF_USE = Target.the("where you check to confirm terms of use")
            .located(By.xpath("//input[@name='termOfUse']"));
    public static final Target CHECK_PRIVACY_SETTINGS = Target.the("where you check to confirm privacy and security policy")
            .located(By.xpath("//input[@name='privacySetting']"));
    public static final Target BUTTON_COMPLETE = Target.the("button that sends the form information ")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
