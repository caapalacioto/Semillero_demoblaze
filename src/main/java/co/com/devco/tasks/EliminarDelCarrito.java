package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterfaces.DemoblazeCar.BUTTON_DELETE;
import static co.com.devco.userinterfaces.DemoblazeIndexPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminarDelCarrito implements Task {

    private String objeto;

    public EliminarDelCarrito(String objeto) {
        this.objeto = objeto;
    }

    public static Performable elObjeto(String objeto) {
        return instrumented(EliminarDelCarrito.class, objeto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_CAR),
                Click.on(BUTTON_DELETE.of(objeto))
        );
    }
}
