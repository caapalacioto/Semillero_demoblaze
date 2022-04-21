package co.com.devco.interactions;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.userinterfaces.DemoblazeCar.LINK_PRIMER_DELETE_PRODUCTOS_CARRITO;

public class EliminarDelCarritoTodos implements Interaction{


    private Target elementos;

    public EliminarDelCarritoTodos(Target elementos) {
        this.elementos = elementos;
    }

    public static EliminarDelCarritoTodos losElementos(Target elementos){
        return new EliminarDelCarritoTodos(elementos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades deletes = this.elementos.resolveAllFor(actor);
        Integer cantidadElementos = deletes.size();
        for (int i = 0; i < cantidadElementos; i++){
            actor.attemptsTo(Click.on(LINK_PRIMER_DELETE_PRODUCTOS_CARRITO));
        }
    }
}
