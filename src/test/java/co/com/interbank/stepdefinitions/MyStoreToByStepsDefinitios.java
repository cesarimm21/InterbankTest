package co.com.interbank.stepdefinitions;

import co.com.interbank.tasks.*;
import co.com.interbank.userinterfaces.MyStorePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.interbank.userinterfaces.MyStorePage.MENSAJE_EXITO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class MyStoreToByStepsDefinitios {
    @Managed(driver = "chrome")
    private WebDriver driver;
    private Actor actor = Actor.named("Interbank");
    private MyStorePage myStorePage = new MyStorePage();

    @Given("^que ingresamos al sistema My Store$")
    public void ingresSistemMyStore() {
        actor.can(BrowseTheWeb.with(driver));
        actor.wasAbleTo(Open.browserOn(myStorePage));
       // actor.wasAbleTo(Start.readyToSearch());
    }
    @When("^buscamos el producto (.*)$")
    public void buscarProduc(String producto) {
        actor.wasAbleTo(
                BuscarProduct.insertDescripcion(producto)
        );
    }

    @Given("^verificamos la existencia del (.*)$")
    public void verifiProduc(String producto) {
        actor.wasAbleTo(
                ValidateExistProduct.validateExists(producto)
        );
    }
    @Given("^agregamos al carito de compras$")
    public void agregarProduc() {
            actor.wasAbleTo(
                SelectProduct.addToCard()
            );
    }

    @Then("^validamos que el producto se haya agregado correctamente$")
    public void validaProducAgrega() {
            actor.wasAbleTo(
                    SuccesAdd.addTextSuccess()
            );
        actor.should(seeThat(the(MENSAJE_EXITO),isPresent()));
    }
}
