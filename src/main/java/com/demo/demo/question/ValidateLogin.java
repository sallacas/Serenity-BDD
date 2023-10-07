package com.demo.demo.question;

import com.demo.demo.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;

public class ValidateLogin implements Question<Boolean> {
    private final String user;

    public ValidateLogin(String user) {
        this.user = user;
    }
    public static ValidateLogin contains(String user){
        return new ValidateLogin(user);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        String link_user = actor.asksFor(Text.of(LoginPage.idTarget("nameofuser")));
        System.out.println(link_user);
        return link_user.contains(user);
    }
}
