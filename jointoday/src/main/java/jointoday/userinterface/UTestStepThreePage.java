package jointoday.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestStepThreePage {
    public static final Target BUTTON_LAST_STEP = Target.the("next to the last step")
            .located(By.xpath("//span[contains(text(),'Next: Last Step')]"));
}
