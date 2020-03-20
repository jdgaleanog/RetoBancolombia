package co.com.choucair.certificacion.proyectobase.questions;

import co.com.choucair.certificacion.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    SearchCoursePage searchCoursePage;
    public static Answer toThe() {
       return new Answer() ;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        searchCoursePage.CambiarVentana();
        result=true;
        return result;
    }
}
