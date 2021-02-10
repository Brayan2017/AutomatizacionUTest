package jointoday.tasks;

import jointoday.userinterface.UTestStepOnePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.rest.interactions.Options;

public class FillOut implements Task {

    private String strName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;

    public FillOut(String strName, String strLastName, String strEmail, String strMonth, String strDay, String strYear) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
    }

    public static FillOut theForm(String strName, String strLastName, String strEmail, String strMonth, String strDay, String strYear) {
        return Tasks.instrumented(FillOut.class,strName,strLastName,strEmail,strMonth,strDay,strYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strName).into(UTestStepOnePage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UTestStepOnePage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(UTestStepOnePage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMonth).from(UTestStepOnePage.INPUT_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(UTestStepOnePage.INPUT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(UTestStepOnePage.INPUT_YEAR),
                Click.on(UTestStepOnePage.BUTTON_NEXT_LOCATION)
                );
    }
}
