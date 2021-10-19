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

public class FillAddressPage implements Task {

    private List<UtestData> data;

    public FillAddressPage(List<UtestData> data) {
        this.data = data;
    }

    public static FillAddressPage thePage(List<UtestData> data) {
        return Tasks.instrumented(FillAddressPage.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrCity()).into(INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(INPUT_CITY),
                Hit.the(Keys.ENTER).keyIn(INPUT_CITY),
                Enter.theValue(data.get(0).getStrZip()).into(INPUT_ZIP),
                Click.on(CONTAINER_COUNTRY),
                Enter.theValue(data.get(0).getStrCountry()).into(INPUT_COUNTRY),
                Click.on(BUTTON_DEVICES)
        );
    }
}
