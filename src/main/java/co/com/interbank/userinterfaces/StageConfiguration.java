package co.com.interbank.userinterfaces;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.com.interbank.util.RestService.BASE_URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class StageConfiguration {

    private static final String CESAR = "Cesar";

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(CESAR).whoCan(CallAnApi.at(BASE_URL.toString()));
    }
}
