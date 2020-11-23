package co.com.interbank.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//APLICACION WEB MY STORE
@CucumberOptions(features = { "src/test/resources/features/" }, tags = { "@AnhadirArticulo" }, glue = { "co.com.interbank" },snippets = SnippetType.CAMELCASE)
//API REST
//@CucumberOptions(features = { "src/test/resources/features/" }, tags = { "@ListUsers" }, glue = { "co.com.interbank" },snippets = SnippetType.CAMELCASE)

public class TestRunner {
}
