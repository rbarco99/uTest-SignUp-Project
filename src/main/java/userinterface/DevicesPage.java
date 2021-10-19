package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesPage {
    public static final Target CONTAINER_COMPUTER_OS = Target.the("container that allows display the computer os")
            .located(By.xpath("//div[@name='osId']"));
    public static final Target INPUT_COMPUTER_OS = Target.the("where you enter your computer OS")
            .located(By.xpath("//div[@name='osId']//input[@type='search']"));
    public static final Target CONTAINER_OS_VERSION = Target.the("container that allows display the computer os version")
            .located(By.xpath("//div[@name='osVersionId']"));
    public static final Target INPUT_OS_VERSION = Target.the("where you enter your computer OS version")
            .located(By.xpath("//div[@name='osVersionId']//input[@type='search']"));
    public static final Target CONTAINER_OS_LANGUAGE = Target.the("container that allows display the computer os language")
            .located(By.xpath("//div[@name='osLanguageId']"));
    public static final Target INPUT_OS_LANGUAGE = Target.the("where you enter your computer OS language")
            .located(By.xpath("//div[@name='osLanguageId']//input[@type='search']"));
    public static final Target CONTAINER_MOBILE_BRAND = Target.the("container that allows display the mobile brand")
            .located(By.xpath("//div[@name='handsetMakerId']"));
    public static final Target INPUT_MOBILE_BRAND = Target.the("where you enter your mobile brand")
            .located(By.xpath("//div[@name='handsetMakerId']//input[@type='search']"));
    public static final Target CONTAINER_MOBILE_MODEL = Target.the("container that allows display the mobile model")
            .located(By.xpath("//div[@name='handsetModelId']"));
    public static final Target INPUT_MOBILE_MODEL = Target.the("where you enter your mobile model")
            .located(By.xpath("//div[@name='handsetModelId']//input[@type='search']"));
    public static final Target CONTAINER_MOBILE_OS = Target.the("container that allows display the mobile model")
            .located(By.xpath("//div[@name='handsetOSId']"));
    public static final Target INPUT_MOBILE_OS = Target.the("where you enter your mobile model")
            .located(By.xpath("//div[@name='handsetOSId']//input[@type='search']"));
    public static final Target BUTTON_LAST_STEP = Target.the("button that loads the last step")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
