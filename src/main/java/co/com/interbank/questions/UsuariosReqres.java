package co.com.interbank.questions;
import co.com.interbank.models.ResumenUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static co.com.interbank.userinterfaces.ReqresPage.JSON_FORMAT;
import static co.com.interbank.util.ConverJson.fromJson;
import static net.serenitybdd.rest.SerenityRest.lastResponse;

@Subject("Servicio de usuarios")
public class UsuariosReqres implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        ResumenUsuario resumen = fromJson(JSON_FORMAT.resolveFor(actor).getText(), ResumenUsuario.class);
        ResumenUsuario service = lastResponse().body().as(ResumenUsuario.class);

        return resumen.toString().equals(service.toString());
    }

    public static UsuariosReqres correspondToThoseOfTheService(){
        return new UsuariosReqres();
    }
}
