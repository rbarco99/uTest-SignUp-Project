package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static userinterface.LastStepPage.*;


public class FillLastStepPage implements Task {

    private List<UtestData> data;

    public FillLastStepPage(List<UtestData> data) {
        this.data = data;
    }

    public static FillLastStepPage thePage(List<UtestData> data) {
        return Tasks.instrumented(FillLastStepPage.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrPassword()).into(INPUT_PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECK_STAY_INFORMED),
                Click.on(CHECK_TERMS_OF_USE),
                Click.on(CHECK_PRIVACY_SETTINGS),
                Click.on(BUTTON_COMPLETE));
    }
}
