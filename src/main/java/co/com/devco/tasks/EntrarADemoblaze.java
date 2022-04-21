package co.com.devco.tasks;

import co.com.devco.model.UsuarioFactory;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.userinterfaces.DemoblazeIndexPage.*;
import static co.com.devco.userinterfaces.DemoblazeLogInPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EntrarADemoblaze implements Task {
;

    public EntrarADemoblaze() { }

    public static Performable como() {
        return instrumented(EntrarADemoblaze.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(DEMOBLAZE_HOME_PAGE)
        );
    }
}
