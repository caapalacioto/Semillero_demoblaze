package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoblazeCar {
	public static final Target TITULO_PRODUCTO_CARRITO = Target.the("titulo del producto del carrito").locatedBy("//tbody[@id='tbodyid']//td[text()='{0}']");
	public static final Target LISTA_DE_COMPRAS = Target.the("Lista de Productos en el carrito").located(By.xpath("//tr[@class='success']/td[2]"));
	public static final Target BOTON_ELIMINAR = Target.the("Boton Eliminar").locatedBy("//td[text()='{0}']//..//a");
	public static final Target LINK_PRIMER_DELETE_PRODUCTOS_CARRITO = Target.the("Link para borrado de productos del carrito").locatedBy("//tbody[@id='tbodyid']/tr[1]//a[text()='Delete']");
	public static final Target PRODUCTOS_CARRITO_TIPO = Target.the("productos del carrito del tipo {0}").locatedBy("//tbody[@id='tbodyid']//td[text()='{0}']/..");
}

