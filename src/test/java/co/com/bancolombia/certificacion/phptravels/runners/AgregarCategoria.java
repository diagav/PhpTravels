package co.com.bancolombia.certificacion.phptravels.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features= {"src/test/resources/features/agregar_categoria.feature"},
		glue= {"co.com.bancolombia.certificacion.phptravels.stepdefinitions"},
		tags= {"@eliminar"},
		snippets = SnippetType.CAMELCASE
		)

public class AgregarCategoria {

}
