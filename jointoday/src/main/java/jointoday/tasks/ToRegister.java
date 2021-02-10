package jointoday.tasks;

import jointoday.userinterface.UTestStepOnePage;
import jointoday.userinterface.UTestStepTwoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class ToRegister implements Task {

    private String strCity;
    private String strPostal;

    public ToRegister(String strCity, String strPostal) {
        this.strCity = strCity;
        this.strPostal = strPostal;
    }

    public static ToRegister theLocation(String strCity, String strPostal) {
        return Tasks.instrumented(ToRegister.class,strCity,strPostal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Enter.theValue(strCity).into(UTestStepTwoPage.INPUT_CITY),
                SendKeys.of(Keys.ARROW_DOWN).into(UTestStepTwoPage.INPUT_CITY),
                SendKeys.of(Keys.ENTER).into(UTestStepTwoPage.INPUT_CITY),
                Enter.theValue(strPostal).into(UTestStepTwoPage.INPUT_POSTAL_CODE),
                Click.on(UTestStepTwoPage.BUTTON_DEVICES)
        );

    }
}
