package jointoday.tasks;

import jointoday.userinterface.UTestLastStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Complete implements Task {

    private String strPassword;

    public Complete(String strPassword) {
        this.strPassword = strPassword;
    }

    public static Complete theLastStep(String strPassword) {
        return Tasks.instrumented(Complete.class,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strPassword).into(UTestLastStep.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(UTestLastStep.INPUT_CONFIRM_PASSWORD),
                Click.on(UTestLastStep.CHECK_UTEST_TERMS),
                Click.on(UTestLastStep.CHECK_UTEST_TERMS2)
        );

    }
}
