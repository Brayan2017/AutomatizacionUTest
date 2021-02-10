package jointoday.tasks;

import jointoday.userinterface.UTestStepOnePage;
import jointoday.userinterface.UTestStepThreePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ToPut implements Task {
    public static ToPut devices() {
        return Tasks.instrumented(ToPut.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestStepThreePage.BUTTON_LAST_STEP));
    }
}
