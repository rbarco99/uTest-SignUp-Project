package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static userinterface.AboutYourselfPage.*;

public class FillPersonal implements Task {

    private UtestData data;

    public FillPersonal(UtestData data) {
        this.data = data;
    }

    public static FillPersonal data(UtestData data) {
        return Tasks.instrumented(FillPersonal.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.getStrFirstName()).into(INPUT_FIRST_NAME),
                Enter.theValue(data.getStrLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(data.getStrEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(data.getStrBirthMonth()).from(SELECT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(data.getStrBirthDay()).from(SELECT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(data.getStrBirthYear()).from(SELECT_BIRTH_YEAR),
                Click.on(BUTTON_LOCATION)
        );
    }
}
