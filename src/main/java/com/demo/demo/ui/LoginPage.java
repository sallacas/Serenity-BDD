package com.demo.demo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public LoginPage() {
        //Do nothinh
    }
    public static final Target LINK_MODAL = Target.the("Link to open login form").located(By.id("login2"));
    public static Target idTarget(String id){
        return Target.the("Element located by ID").located(By.id(id));
    }
    public static final Target BTN_LOGIN = Target.the("").located(By.xpath("//button[contains(text(),'Log in')]"));
}
