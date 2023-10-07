package com.demo.demo.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Go implements Task {

    private final String page;

    public Go(String page) {
        this.page = page;
    }
    public static Go toPage(String page){
        return Tasks.instrumented(Go.class,page);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(page)
        );
    }
}
