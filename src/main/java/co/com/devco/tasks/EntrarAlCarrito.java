package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterfaces.DemoblazeIndexPage.BUTTON_CAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EntrarAlCarrito implements Task {

    public EntrarAlCarrito() { }

    public static Performable deCompras() {
        return instrumented(EntrarAlCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_CAR)
        );
    }
}
