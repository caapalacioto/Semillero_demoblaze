package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoblazeLogInPage {
	public static final Target LOGIN_USERNAME = Target.the("ingresar el usuario").located(By.xpath("//input[@id='loginusername']"));
	public static final Target LOGIN_PASSWORD = Target.the("ingresar la contraseña").located(By.xpath("//input[@id='loginpassword']"));
	public static final Target BUTTON_LOGIN = Target.the("boton login").located(By.xpath("//button[text()='Log in']"));
}
