package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static userinterface.AddressPage.*;

public class FillAddress implements Task {

    private UtestData data;

    public FillAddress(UtestData data) {
        this.data = data;
    }

    public static FillAddress data(UtestData data) {
        return Tasks.instrumented(FillAddress.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.getStrCity()).into(INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(INPUT_CITY),
                Hit.the(Keys.ENTER).keyIn(INPUT_CITY),
                Enter.theValue(data.getStrZip()).into(INPUT_ZIP),
                Click.on(CONTAINER_COUNTRY),
                Enter.theValue(data.getStrCountry()).into(INPUT_COUNTRY),
                Click.on(BUTTON_DEVICES)
        );
    }
}
