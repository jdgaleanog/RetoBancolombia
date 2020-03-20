package co.com.choucair.certificacion.proyectobase.stepdefinitions;

import co.com.choucair.certificacion.proyectobase.questions.Answer;
import co.com.choucair.certificacion.proyectobase.tasks.GoTo;
import co.com.choucair.certificacion.proyectobase.tasks.Login;
import co.com.choucair.certificacion.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcadmyStepDefinitions {
    @Before
    public void SetStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Ingreso a Tocumen Panama$")
    public void ingresoAChoucairAcademy() throws Exception {
        OnStage.theActorCalled("YO").wasAbleTo(GoTo.ChoucairAcademy());
    }

    @When("^Accedo a objetos extraviados$")
    public void accedoAlCursoRecursosAutomatizaciónBancolombia() throws Exception {
        OnStage.theActorCalled("YO").attemptsTo(Search.Course());
    }


    @Then("^Verifico pdf$")
    public void verificoTituloDelCurso() throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe()));
    }

}
