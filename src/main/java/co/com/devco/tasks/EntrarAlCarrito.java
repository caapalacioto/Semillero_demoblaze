package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.userinterfaces.DemoblazeCar.LINK_PRIMER_DELETE_PRODUCTOS_CARRITO;
import static co.com.devco.userinterfaces.DemoblazeIndexPage.BUTTON_CAR;
import static co.com.devco.userinterfaces.DemoblazePaginaProducto.BUTTON_ADD_TO_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EntrarAlCarrito implements Task {

    public EntrarAlCarrito() { }

    public static Performable deCompras() {
        return instrumented(EntrarAlCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_CAR),
                WaitUntil.the(LINK_PRIMER_DELETE_PRODUCTOS_CARRITO, isVisible())
        );
    }
}
