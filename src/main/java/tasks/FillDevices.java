package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static userinterface.DevicesPage.*;

public class FillDevices implements Task {
    private UtestData data;

    public FillDevices(UtestData data) {
        this.data = data;
    }

    public static FillDevices information(UtestData data) {
        return Tasks.instrumented(FillDevices.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CONTAINER_COMPUTER_OS),
                Enter.theValue(data.getStrComputerOs()).into(INPUT_COMPUTER_OS).thenHit(Keys.ENTER),
                Click.on(CONTAINER_OS_VERSION),
                Enter.theValue(data.getStrOsVersion()).into(INPUT_OS_VERSION).thenHit(Keys.ENTER),
                Click.on(CONTAINER_OS_LANGUAGE),
                Enter.theValue(data.getStrOsLanguage()).into(INPUT_OS_LANGUAGE).thenHit(Keys.ENTER),
                Click.on(CONTAINER_MOBILE_BRAND),
                Enter.theValue(data.getStrMobileBrand()).into(INPUT_MOBILE_BRAND).thenHit(Keys.ENTER),
                Click.on(CONTAINER_MOBILE_MODEL),
                Enter.theValue(data.getStrMobileModel()).into(INPUT_MOBILE_MODEL).thenHit(Keys.ENTER),
                Click.on(CONTAINER_MOBILE_OS),
                Enter.theValue(data.getStrMobileOs()).into(INPUT_MOBILE_OS).thenHit(Keys.ENTER),
                Click.on(BUTTON_LAST_STEP));
    }
}
