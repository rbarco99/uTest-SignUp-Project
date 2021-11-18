package questions;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static userinterface.WelcomePage.WELCOME_MESSAGE;

public class WelcomeMessage implements Question<Boolean> {
    private UtestData data;

    public WelcomeMessage(UtestData data) {
        this.data = data;
    }

    public static WelcomeMessage isDisplayed(UtestData data){
        return new WelcomeMessage(data);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        String welcomeText = Text.of(WELCOME_MESSAGE).viewedBy(actor).asString();
        String expectedText = data.getStrWelcomeText();
        return welcomeText.equals(expectedText);
    }
}
