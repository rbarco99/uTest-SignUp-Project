package questions;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static userinterface.WelcomePage.WELCOME_MESSAGE;

public class Answer implements Question<Boolean> {
    private List<UtestData> data;

    public Answer(List<UtestData> data) {
        this.data = data;
    }

    public static Answer toThe(List<UtestData> data){
        return new Answer(data);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        String welcomeText = Text.of(WELCOME_MESSAGE).viewedBy(actor).asString();
        String expectedText = data.get(0).getStrWelcomeText();
        return welcomeText.equals(expectedText);
    }
}
