package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static userinterface.LastStepPage.*;


public class FillSecurity implements Task {

    private UtestData data;

    public FillSecurity(UtestData data) {
        this.data = data;
    }

    public static FillSecurity information(UtestData data) {
        return Tasks.instrumented(FillSecurity.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.getStrPassword()).into(INPUT_PASSWORD),
                Enter.theValue(data.getStrPassword()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECK_STAY_INFORMED),
                Click.on(CHECK_TERMS_OF_USE),
                Click.on(CHECK_PRIVACY_SETTINGS),
                Click.on(BUTTON_COMPLETE));
    }
}
