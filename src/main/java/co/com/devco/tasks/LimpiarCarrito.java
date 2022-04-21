package co.com.devco.tasks;

import co.com.devco.interactions.EliminarDelCarritoTodos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterfaces.DemoblazeCar.LISTA_DE_COMPRAS;
import static co.com.devco.userinterfaces.DemoblazeIndexPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LimpiarCarrito implements Task {

    public static Performable completamente() {
        return instrumented(LimpiarCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_CAR),
                EliminarDelCarritoTodos.losElementos(LISTA_DE_COMPRAS)
        );
    }
}
