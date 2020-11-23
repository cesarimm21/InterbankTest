package co.com.interbank.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.interbank.userinterfaces.MyStorePage.BUTTON_BUSCAR;
import static co.com.interbank.userinterfaces.MyStorePage.INPUT_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BuscarProduct implements Task {

    private String producto;
    public BuscarProduct(String producto){
        this.producto = producto;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(producto).into(INPUT_PRODUCT),
                Click.on(BUTTON_BUSCAR)
        );
        for (String winHandle : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(winHandle);
        }
    }
    public static BuscarProduct insertDescripcion(String producto){
        return instrumented(BuscarProduct.class,producto);
    }
}
