package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenPage;

public class GoTo implements Task {
    ChoucairAcademyPage choucairAcademyPage;
    public static Performable ChoucairAcademy() {

            return Tasks.instrumented(GoTo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(choucairAcademyPage));
    }
}
