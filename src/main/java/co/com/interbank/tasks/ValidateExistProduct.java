package co.com.interbank.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.interbank.userinterfaces.MyStorePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidateExistProduct implements Task {
    private String producto;
    public ValidateExistProduct(String producto){
        this.producto = producto;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PRODUCT_LIST)
        );
    }
    public static ValidateExistProduct validateExists(String producto){
        return instrumented(ValidateExistProduct.class,producto);
    }
}
