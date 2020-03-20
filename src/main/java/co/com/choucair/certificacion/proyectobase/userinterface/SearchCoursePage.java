package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Boton ingreso universidad choucair").located(By.xpath("//*[@id='universidad']/a/img"));
    public static final Target INPUT_SEARCHCOURSE = Target.the("Boton ingreso universidad choucair").located(By.xpath("//*[@id='coursesearchbox']"));
    public static final Target BUTTON_SEARCHCOURSE = Target.the("Boton ingreso universidad choucair").located(By.xpath("//*[@id='coursesearch']/fieldset/button"));
    public static final Target BUTTON_COURSE = Target.the("Boton ingreso universidad choucair").located(By.xpath("//h2[contains(text(),'Resultados de la búsqueda')]//following::h4[contains(text(),'Recursos Automatización Bancolombia')]"));
    public static final Target TITTLE_NAMECOURSE = Target.the("Titulo del curso").located(By.xpath("//h1[contains(text(),'Recursos Automatización Bancolombia')]"));

    public static final Target BUTTON_SERVICIOS = Target.the("Boton ingreso universidad choucair").located(By.xpath("//a[contains(text(),'SERVICIOS')]"));
    public static final Target BUTTON_IFNOVIAJERO = Target.the("Boton ingreso universidad choucair").located(By.xpath("//a[contains(text(),'Información del Viajero')]"));
    public static final Target BUTTON_OBJETOS = Target.the("Boton ingreso universidad choucair").located(By.xpath("//a[contains(text(),'Objetos Extraviados')]"));
   public static final Target BUTTON_POLITICAS = Target.the("Boton ingreso universidad choucair").located(By.xpath("//a[contains(text(),'Políticas de objetos extraviados')]"));

public  void CambiarVentana(){
    ArrayList<String> ventanaNueva = new ArrayList<String>(getDriver().getWindowHandles());
    getDriver().switchTo().window(ventanaNueva.get(1));

}

}
