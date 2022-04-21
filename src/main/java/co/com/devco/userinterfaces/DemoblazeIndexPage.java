package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoblazeIndexPage {
	public static final String DEMOBLAZE_HOME_PAGE = "https://www.demoblaze.com/#";
	public static final Target LINK_LOGIN = Target.the("link para loguearse").located(By.xpath("//a[@id='login2']"));
	public static final Target BUTTON_CAR = Target.the("ver el carrito").located(By.xpath("//a[text()='Cart']"));
	public static final Target BUTTON_HOME = Target.the("ver pagina de incio").located(By.xpath("//a[text()='Home ']"));
	public static final Target PRODUCTOS = Target.the("Lista de Productos").located(By.xpath("//div[@id='tbodyid']"));
	public static final Target LINK_PRODUCTO= Target.the("Descripción del producto").locatedBy("//a[text()='{0}']");
}
