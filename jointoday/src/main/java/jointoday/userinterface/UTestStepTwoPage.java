package jointoday.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestStepTwoPage {

    public static final Target INPUT_CITY = Target.the("where will we put the City")
            .located(By.id("city"));

    public static final Target INPUT_POSTAL_CODE = Target.the("where will we Postal Code")
            .located(By.id("zip"));

    public static final Target BUTTON_DEVICES = Target.the("next form")
            .located(By.xpath("//span[contains(text(),'Next: Devices')]"));

}
