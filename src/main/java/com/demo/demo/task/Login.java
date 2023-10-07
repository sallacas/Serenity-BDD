package com.demo.demo.task;

import com.demo.demo.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class Login implements Task {
    private final String username;
    private final String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public static Login withCredentials(String username, String password){
        return Tasks.instrumented(Login.class,username,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginPage.LINK_MODAL),
                Enter.theValue(username).into(LoginPage.idTarget("loginusername")),
                Enter.theValue(password).into(LoginPage.idTarget("loginpassword")),
                Click.on(LoginPage.BTN_LOGIN)
        );
    }
}
