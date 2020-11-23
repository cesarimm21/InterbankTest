package co.com.interbank.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.interbank.userinterfaces.MyStorePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class SelectProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(MOVE_TO_PROD),
                Click.on(ADD_CARD)
        );
    }
    public static SelectProduct addToCard(){
        return instrumented(SelectProduct.class);
    }
}
