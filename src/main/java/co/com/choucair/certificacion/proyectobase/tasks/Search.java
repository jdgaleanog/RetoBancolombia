package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.JavaScript;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class Search implements Task {

    public static Search  Course() {
        return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_SERVICIOS),
                Click.on(SearchCoursePage.BUTTON_IFNOVIAJERO),
                Click.on(SearchCoursePage.BUTTON_OBJETOS),
                JavaScriptClick.on(SearchCoursePage.BUTTON_POLITICAS));
    }
}
