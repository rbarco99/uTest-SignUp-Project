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

public class FillAboutYourselfPage implements Task {

    private List<UtestData> data;

    public FillAboutYourselfPage(List<UtestData> data) {
        this.data = data;
    }

    public static FillAboutYourselfPage thePage(List<UtestData> data) {
        return Tasks.instrumented(FillAboutYourselfPage.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrFirstName()).into(INPUT_FIRST_NAME),
                Enter.theValue(data.get(0).getStrLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(data.get(0).getStrEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthMonth()).from(SELECT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthDay()).from(SELECT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthYear()).from(SELECT_BIRTH_YEAR),
                Click.on(BUTTON_LOCATION)
        );
    }
}
