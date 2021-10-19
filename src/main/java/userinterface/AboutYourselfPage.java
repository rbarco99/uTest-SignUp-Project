package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AboutYourselfPage {

    public static final Target INPUT_FIRST_NAME = Target.the("where you enter your first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where you enter your last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where you enter your email")
            .located(By.id("email"));
    public static final Target SELECT_BIRTH_MONTH = Target.the("where you enter your birth month")
            .located(By.id("birthMonth"));
    public static final Target SELECT_BIRTH_DAY = Target.the("where you enter your birth day")
            .located(By.id("birthDay"));
    public static final Target SELECT_BIRTH_YEAR = Target.the("where you enter your birth year")
            .located(By.id("birthYear"));
    public static final Target BUTTON_LOCATION = Target.the("button that loads the Location forms")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']//a[@class='btn btn-blue']"));
}
