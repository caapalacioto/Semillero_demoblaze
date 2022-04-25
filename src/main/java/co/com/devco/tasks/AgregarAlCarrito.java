package co.com.devco.tasks;

import co.com.devco.interactions.AniadirAlCarrito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.userinterfaces.DemoblazeIndexPage.*;
import static co.com.devco.userinterfaces.DemoblazePaginaProducto.BUTTON_ADD_TO_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarAlCarrito implements Task {
    private String objeto;
    private String cantidad;

    public AgregarAlCarrito(String cantidad, String objeto) {
        this.cantidad = cantidad;
        this.objeto = objeto;
    }

    public static Performable elItem(String objeto) {
        return instrumented(AgregarAlCarrito.class,  "1", objeto);
    }

    public static Performable losItems(String cantidad, String objeto) {
        return instrumented(AgregarAlCarrito.class, cantidad, objeto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_HOME),
                WaitUntil.the(LINK_PRODUCTO.of(objeto), isVisible()),
                Click.on(LINK_PRODUCTO.of(objeto)),
                AniadirAlCarrito.cantidad(cantidad)
        );
    }
}
