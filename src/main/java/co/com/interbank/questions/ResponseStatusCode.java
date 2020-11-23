package co.com.interbank.questions;

import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class ResponseStatusCode {

    public static Question<Boolean> is(int code){
        return a -> lastResponse().statusCode() == code;
    }
}
