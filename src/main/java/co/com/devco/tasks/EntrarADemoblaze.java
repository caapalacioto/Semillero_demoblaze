package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.DemoblazeIndexPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EntrarADemoblaze implements Task {

    public EntrarADemoblaze() { }

    public static Performable home() {
        return instrumented(EntrarADemoblaze.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(DEMOBLAZE_HOME_PAGE)
        );
    }
}
