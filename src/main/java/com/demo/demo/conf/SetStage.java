package com.demo.demo.conf;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class SetStage {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
}
