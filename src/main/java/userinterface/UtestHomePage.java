package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class UtestHomePage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("New user register button")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
