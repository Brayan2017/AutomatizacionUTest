package jointoday.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestStepOnePage {

    public static final Target INPUT_FIRST_NAME = Target.the("where will we put the firts name")
            .located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("where will we put the last name")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("where will we put the email")
            .located(By.id("email"));

    public static final Target INPUT_MONTH = Target.the("where will we put the month")
            .located(By.id("birthMonth"));

    public static final Target INPUT_DAY = Target.the("where will we put the day")
            .located(By.id("birthDay"));

    public static final Target INPUT_YEAR = Target.the("where will we put the year")
            .located(By.id("birthYear"));

    public static final Target BUTTON_NEXT_LOCATION = Target.the("next form")
            .located(By.xpath("//span[contains(text(),'Next: Location')]"));

}