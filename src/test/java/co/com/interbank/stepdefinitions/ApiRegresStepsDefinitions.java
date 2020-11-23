package co.com.interbank.stepdefinitions;

import co.com.interbank.questions.ResponseStatusCode;
import co.com.interbank.questions.UsuariosReqres;
import co.com.interbank.tasks.ConsultaUsuarios;
import co.com.interbank.userinterfaces.ReqresPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.interbank.userinterfaces.ReqresPage.JSON_FORMAT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ApiRegresStepsDefinitions {
    private ReqresPage reqresPage=new ReqresPage();
    @When("^quiero realizar la consulta la lista de mis usuarios$")
    public void consultUsuarios() throws Exception  {
        theActorInTheSpotlight().attemptsTo(
                ConsultaUsuarios.listaUsuarios(),
                Open.browserOn(reqresPage),
                Scroll.to(JSON_FORMAT)
        );
    }
    @Then("^validar la lista de mis usuarioss$")
    public void validaUsuarios() throws Exception {
        theActorInTheSpotlight().should(seeThat("El statucode tiene que ser 200" , ResponseStatusCode.is(200)));
        theActorInTheSpotlight().should(seeThat(UsuariosReqres.correspondToThoseOfTheService()));
    }
}
