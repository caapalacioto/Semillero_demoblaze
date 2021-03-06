package co.com.devco.tasks;

import co.com.devco.model.UsuarioFactory;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.devco.userinterfaces.DemoblazeIndexPage.LINK_LOGIN;
import static co.com.devco.userinterfaces.DemoblazeLogInPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Loguearse implements Task {
    private String rol;

    public Loguearse(String rol) {
        this.rol = rol;
    }

    public static Performable como(String rol) {
        return instrumented(Loguearse.class, rol);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_LOGIN),
                Enter.theValue(UsuarioFactory.delRol(rol).getUsuario()).into(LOGIN_USERNAME),
                Enter.theValue(UsuarioFactory.delRol(rol).getPassword()).into(LOGIN_PASSWORD),
                Click.on(BUTTON_LOGIN)
        );
    }
}
