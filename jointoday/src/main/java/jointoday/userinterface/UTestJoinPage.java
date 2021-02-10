package jointoday.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestJoinPage {

    public static final Target JOIN_BUTTON =Target.the("button that allows join")
            .located(By.xpath("(//*[text()='Join Today'])[1]"));
}
