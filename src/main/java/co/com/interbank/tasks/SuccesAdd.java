package co.com.interbank.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static co.com.interbank.userinterfaces.MyStorePage.ADD_CARD;
import static co.com.interbank.userinterfaces.MyStorePage.MOVE_TO_PROD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SuccesAdd implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(MOVE_TO_PROD),
                Click.on(ADD_CARD)
        );
    }
    public static SuccesAdd addTextSuccess(){
        return instrumented(SuccesAdd.class);
    }
}
