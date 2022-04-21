package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoblazePaginaProducto {
	public static final Target BUTTON_ADD_TO_CART = Target.the("Para añadir al carrito").located(By.xpath("//a[text()='Add to cart']"));
}

