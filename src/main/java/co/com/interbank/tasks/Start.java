package co.com.interbank.tasks;

import co.com.interbank.userinterfaces.ApplicationHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Start implements Task {

    private Performable steps;
    private String title;

    private ApplicationHomePage applicationHomePage;

    @Step("{0} starts and performs the step **#title**")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(applicationHomePage)
               ,Check.whether(steps != null).andIfSo(Task.where(title, steps))
        );
    }
    public static Start readyToSearch() {
        return instrumented(Start.class, "User ready to Search", null);
    }

    public Start(String title, Performable steps) {
        this.title = title;
        this.steps = steps;
    }
}
