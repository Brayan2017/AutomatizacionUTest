package jointoday.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestLastStep {
    public static final Target INPUT_PASSWORD= Target.the("where will we put the the password")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where will we confirm the password")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_UTEST_TERMS= Target.the("check box to accept terms")
            .located(By.id("termOfUse"));

    public static final Target CHECK_UTEST_TERMS2= Target.the("check box to accept conditions")
            .located(By.id("privacySetting"));

    public static final Target BUTTON_COMPLETE_SETUP = Target.the("next to the last step")
            .located(By.id("laddaBtn"));

}
