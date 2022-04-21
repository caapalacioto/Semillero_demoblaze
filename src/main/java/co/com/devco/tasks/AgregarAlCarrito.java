package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.devco.userinterfaces.DemoblazeIndexPage.*;
import static co.com.devco.userinterfaces.DemoblazePaginaProducto.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarAlCarrito implements Task {
    private String objeto;

    public AgregarAlCarrito(String objeto) {
        this.objeto = objeto;
    }

    public static Performable elItem(String objeto) {
        return instrumented(AgregarAlCarrito.class, objeto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_HOME),
                Click.on(LINK_PRODUCTO.of(objeto)),
                Click.on(ADD_TO_CART),
                WaitUntil.the(BUTTON_HOME, isVisible())
        );
    }
}
