package co.com.choucair.utest.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UtestData;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.WelcomeMessage;
import random.GenerateRandom;
import tasks.*;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UtestStepDefinition {
    @Before
    public void setStage (){
        setTheStage(new OnlineCast());
    }

    @Given("^that the user is on the uTest singUp page$")
    public void thanTheUserIsOnTheUTestSingUpPage(){
        theActorCalled("Ricardo").wasAbleTo(OpenUpUtest.singUpPage());
    }


    @When("^the user provides the required personal information in each step$")
    public void theUserProvidesTheRequiredPersonalInformationInEachStep(List<UtestData> data){
        GenerateRandom.data(data.get(0));
        theActorInTheSpotlight().attemptsTo(
                FillPersonal.data(data.get(0)),
                FillAddress.data(data.get(0)),
                FillDevices.information(data.get(0)),
                FillSecurity.information(data.get(0))
        );
    }

    @Then("^the welcome uTest page should display$")
    public void theWelcomeUTestPageShouldDisplay(List<UtestData> data){
        theActorInTheSpotlight().should(seeThat(WelcomeMessage.isDisplayed(data.get(0))));
    }

}
