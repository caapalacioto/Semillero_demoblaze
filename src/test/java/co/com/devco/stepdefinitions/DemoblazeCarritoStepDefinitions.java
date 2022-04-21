package co.com.devco.stepdefinitions;

import co.com.devco.tasks.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.devco.userinterfaces.DemoblazeCar.LISTA_DE_COMPRAS;
import static co.com.devco.userinterfaces.DemoblazeCar.TITULO_PRODUCTO_CARRITO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DemoblazeCarritoStepDefinitions {
    @Dado("que {string} se loguea como {string}")
    public void loguin(String actor, String rol) {
        theActorCalled(actor).attemptsTo(
                EntrarADemoblaze.home(),
                Loguearse.como(rol),
                LimpiarCarrito.completamente()
        );
    }
    @Cuando("agrega el {string} al carrito vacio")
    public void agregaObjetoAlCarrito(String objeto) {
        theActorInTheSpotlight().attemptsTo(
                AgregarAlCarrito.elItem(objeto)
        );
    }
    @Entonces("debe ver como unico elemento el {string}")
    public void verifiarElementoEnCarrito(String objeto) {
        theActorInTheSpotlight().attemptsTo(
                EntrarAlCarrito.deCompras(),
                Ensure.that(LISTA_DE_COMPRAS).textValues().containsExactly(objeto)
         );
    }

    @Cuando("{string} agrega el {string} al carrito vacio")
    public void agregaElementoAlCarritoVacio(String actor, String objeto) {
        theActorCalled(actor).attemptsTo(
                EntrarADemoblaze.home(),
                AgregarAlCarrito.elItem(objeto)
        );
    }

    @Dado("{string} agrega {string} y {string} al carrito vacio")
    public void agregaDosElementoAlCarritoVacio(String actor, String objeto1, String objeo2) {
        theActorCalled(actor).attemptsTo(
                EntrarADemoblaze.home(),
                AgregarAlCarrito.elItem(objeto1),
                AgregarAlCarrito.elItem(objeo2)
        );
    }

    @Cuando("elimina {string}")
    public void eliminaElementoDelCarrito(String objeto) {
        theActorInTheSpotlight().attemptsTo(
                EliminarDelCarrito.elObjeto(objeto)
        );
    }

    @Cuando("{string} agrega {string} {string} al carrito")
    public void agregaVariosElementosAlCarrito(String actor, String cantidad, String objeto) {
        theActorCalled(actor).attemptsTo(
                EntrarADemoblaze.home(),
                AgregarAlCarrito.losItems(cantidad,objeto)
        );
    };

    @Entonces("debe ver {string} elementos de {string}")
    public void debeVerVariosElementosDe(String cantidad, String objeto) {
        theActorInTheSpotlight().attemptsTo(
                EntrarAlCarrito.deCompras(),
                Ensure.that(LISTA_DE_COMPRAS).values().hasSize(3),
                Ensure.that(TITULO_PRODUCTO_CARRITO.of(objeto)).isEnabled()

        );
    }

}
