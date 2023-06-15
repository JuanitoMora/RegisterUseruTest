package com.sophossolutions.stepDefinitions;

import com.sophossolutions.tasks.RegisterUser;
import com.sophossolutions.userinterfaces.Home;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestStepDefinitions {

    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("bender");
    }

    @Given("un usuario en la pagina de inicio")
    public void unUsuarioEnLaPaginaDeInicio() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn(new Home()));
    }

    @When("el usuario crea una nueva cuenta")
    public void elUsuarioCreaUnaNuevaCuenta() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterUser.make());
    }

    @Then("el usuario ve su username")
    public void elUsuarioVeSuUsername() {
    }
}
