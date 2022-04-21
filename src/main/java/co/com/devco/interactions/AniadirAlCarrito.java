package co.com.devco.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.userinterfaces.DemoblazeIndexPage.BUTTON_HOME;
import static co.com.devco.userinterfaces.DemoblazePaginaProducto.BUTTON_ADD_TO_CART;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AniadirAlCarrito implements Interaction{

    private String cantidad;

    public AniadirAlCarrito(String cantidad) {
        this.cantidad = cantidad;
    }

    public static AniadirAlCarrito cantidad(String cantidad){
        return new AniadirAlCarrito(cantidad);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int numeroDeElementos= Integer.parseInt(cantidad);
        for (int i = 0; i < numeroDeElementos; i++){
            actor.attemptsTo(
                    Click.on(BUTTON_ADD_TO_CART),
                    WaitUntil.the(BUTTON_HOME, isVisible())
                   );
        }
    }
}
