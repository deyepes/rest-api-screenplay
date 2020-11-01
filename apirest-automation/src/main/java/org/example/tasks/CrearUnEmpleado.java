package org.example.tasks;

import org.example.models.Empleado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearUnEmpleado implements Task {

    Empleado empleado;

    public CrearUnEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public static Performable crearUn(Empleado empleado) {
        return instrumented(CrearUnEmpleado.class, empleado);
    }

    @Override
    @Step("{0} Crear un empleado")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to("/api/v1/create").with(request -> request.header("content-Type", "application/json").body(empleado).log().all()));

        lastResponse().prettyPrint();
    }
}
