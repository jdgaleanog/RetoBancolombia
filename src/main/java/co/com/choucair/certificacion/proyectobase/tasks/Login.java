package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.userinterface.ChoucairAcademyLoginPage;

import net.serenitybdd.screenplay.Actor;


import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Login implements Task {
    ChoucairAcademyLoginPage choucairAcademyLoginPage;
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(choucairAcademyLoginPage.LOGIN_BUTTON),
                Enter.theValue("jgaleanog").into(choucairAcademyLoginPage.USER_INPUT),
                Enter.theValue("Choucair.2019*-+").into(choucairAcademyLoginPage.PASSWORD_INPUT),
                Click.on(choucairAcademyLoginPage.ENTER_BUTTON
                ));

    }

}
