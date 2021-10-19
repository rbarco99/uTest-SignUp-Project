package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressPage {
    public static final Target INPUT_CITY = Target.the("where you enter your city")
            .located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("where you enter your zip or postal code")
            .located(By.id("zip"));
    public static final Target CONTAINER_COUNTRY = Target.the("Container that opens the country list")
            .located(By.xpath("//div[@placeholder='Select a country']"));
    public static final Target INPUT_COUNTRY = Target.the("where you enter your country")
            .located(By.xpath("//input[@placeholder='Select a country']"));
    public static final Target BUTTON_DEVICES = Target.the("button that loads the devices page")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
