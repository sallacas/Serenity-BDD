package com.demo.demo.stepdefinitions;

import com.demo.demo.question.ValidateLogin;
import com.demo.demo.task.Go;
import com.demo.demo.task.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.equalTo;

public class DemoStepDefinitions {

    @Given("enter to page {string}")
    public void enterToPage(String page) {
        OnStage.theActorCalled("Juan").wasAbleTo(
                Go.toPage(page)
        );
    }

    @When("type login credentials")
    public void typeLoginCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withCredentials("admin","admin")
        );
    }

    @Then("validate correct access")
    public void validateCorrectAccess() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidateLogin.contains("admin"), equalTo(true))
        );
    }
}
