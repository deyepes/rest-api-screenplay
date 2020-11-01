package org.example.stepsdefinitions;

import org.example.builders.EmpleadoBuilder;
import org.example.exceptions.ResponseCodeIncorrect;
import org.example.models.Empleado;
import org.example.questions.Response;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.example.tasks.CrearUnEmpleado.crearUn;
import static org.hamcrest.Matchers.is;

public class ConsumoBasicoStepDefinitions {

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que quiero crear un empleado")
    public void queQuieroCrearUnEmpleado() {
        theActorCalled("Pepito");
        theActorInTheSpotlight().whoCan(CallAnApi.at("http://dummy.restapiexample.com"));

    }

    @When("lo creo con el nombre {string} salario {string} edad {string}")
    public void loCreoConElNombreSalarioEdad(String nombre, String salario, String edad) {
        Empleado empleado = new EmpleadoBuilder().conNombre(nombre).conSalario(salario).yConEdad(edad);
        theActorInTheSpotlight().attemptsTo(crearUn(empleado));

    }

    @Then("deberia responder con un estado {string}")
    public void deberiaResponderConUnEstado(String status) {
        seeThat(Response.receivedIn("status"), is(status)).orComplainWith(ResponseCodeIncorrect.class, "The Response Code is not correct ");
    }

}
