package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.UtestHomePage;

public class OpenUpUtest implements Task {
    
    private UtestHomePage utestHomePage;

    public static OpenUpUtest singUpPage() {
        return Tasks.instrumented(OpenUpUtest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestHomePage),
                Click.on(UtestHomePage.JOIN_BUTTON));
    }
}
