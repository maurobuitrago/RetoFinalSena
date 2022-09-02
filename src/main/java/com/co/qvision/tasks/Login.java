package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.HomePage;
import groovy.util.logging.Log;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTN_SIGN_IN));
        try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}

    }


    public static Login enter()
    {
        return Tasks.instrumented(Login.class);
    }
}
