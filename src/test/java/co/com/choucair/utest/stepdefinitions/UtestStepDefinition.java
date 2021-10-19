package co.com.choucair.utest.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UtestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import random.RandomData;
import tasks.*;

import java.util.List;

public class UtestStepDefinition {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that the user is on the uTest singUp page$")
    public void thanTheUserIsOnTheUTestSingUpPage() throws Exception{
        OnStage.theActorCalled("Ricardo").wasAbleTo(OpenUpUtest.thePage());
    }


    @When("^the user provides the required personal information in each step$")
    public void theUserProvidesTheRequiredPersonalInformationInEachStep(List<UtestData> data) throws Exception {
        RandomData.generate(data);
        OnStage.theActorInTheSpotlight().attemptsTo(FillAboutYourselfPage.thePage(data),
                FillAddressPage.thePage(data),
                FillDevicesPage.thePage(data),
                FillLastStepPage.thePage(data)
        );
    }

    @Then("^the welcome uTest page should display$")
    public void theWelcomeUTestPageShouldDisplay(List<UtestData> data) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(data)));
    }

}
