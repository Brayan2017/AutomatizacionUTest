package jointoday.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jointoday.model.UTestData;
import jointoday.questions.Answer;
import jointoday.tasks.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UTestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that brayan wants to create a new user for the Utest page$")
    public void thatBrayanWantsToCreateANewUserForTheUtestPage() {
        OnStage.theActorCalled("brayan").wasAbleTo(OpenUp.thePage(), Join.OnThePage());

    }

    @When("^he searches for jointoday on the UTest page$")
    public void heSearchesForJointodayOnTheUTestPage(List<UTestData> uTestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillOut.theForm
                        (uTestData.get(0).getStrName(), uTestData.get(0).getStrLastName(), uTestData.get(0).getStrEmail(), uTestData.get(0).getStrMonth(), uTestData.get(0).getStrDay(), uTestData.get(0).getStrYear()),
                ToRegister.theLocation(uTestData.get(0).getStrCity(), uTestData.get(0).getStrPostal())
                , ToPut.devices(), Complete.theLastStep(uTestData.get(0).getStrPassword()));

    }

    @Then("^he creates a new user on the UTest page$")
    public void heCreatesANewUserOnTheUTestPage(List<UTestData> uTestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestData.get(0).getStrComplete())));
    }
}
