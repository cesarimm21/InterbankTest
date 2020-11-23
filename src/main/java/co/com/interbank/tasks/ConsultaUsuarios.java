package co.com.interbank.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.interbank.util.RestService.SINGLE_USER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultaUsuarios implements Task {

    private String usuarios;

    public ConsultaUsuarios(int page) {

        this.usuarios = String.format(SINGLE_USER.toString(), page);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(
                Get.resource(usuarios)
        );
    }

    public static ConsultaUsuarios listaUsuarios() {

        return instrumented(ConsultaUsuarios.class, 2);
    }
}
