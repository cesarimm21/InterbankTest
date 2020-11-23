package co.com.interbank.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://reqres.in/")
public class ReqresPage extends PageObject{
    public static final Target JSON_FORMAT = Target.the("Formato de json")
            .locatedBy("//*[@id=\"console\"]/div[2]/div[2]/pre");
}
