package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChoucairAcademyLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("Boton que nos muesta la pantalla de login").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target USER_INPUT = Target.the("Campo para ingreso de usuario").located(By.xpath("//*[@id='username']"));
    public static final Target PASSWORD_INPUT = Target.the("Campo para ingreso de contrasenia").located(By.xpath("//*[@id='password']"));
    public static final Target ENTER_BUTTON = Target.the("Boton para ingresar a la cuenta").located(By.xpath("//button[contains(text(),'Acceder')]"));
}
