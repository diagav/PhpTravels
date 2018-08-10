package co.com.bancolombia.certificacion.phptravels.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.Is.is;

import co.com.bancolombia.certificacion.phptravels.tasks.AdicionarCategoria;
import co.com.bancolombia.certificacion.phptravels.tasks.LoguearPagina;
import co.com.bancolombia.certificacion.phptravels.userinterfaces.HomePhpTravelsPage;
import co.com.bancolombia.certificacion.phptravels.questions.Categoria;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AgregarCategoriaStepDefinitions {

	private HomePhpTravelsPage homePhpTravels;

	@Before
	public void prepararEscenario() {
		OnStage.setTheStage(new OnlineCast()); // preparación del escenario del driver y del actor
	}

	@Dado("^que (.*) quiere agregar una categoria y borrarla$")
	public void queDianaQuiereAgregarUnaCategoriaYBorrarla(String nombreActor) {
		theActorCalled(nombreActor).wasAbleTo(Open.browserOn(homePhpTravels)
				, LoguearPagina.conUsuarioContrasena());
	}

	@Cuando("^ella agrega una (.*) en el modulo del blog$")
	public void ellaAgregaUnaMagicEnElModuloDelBlog(String categoria) {
		theActorInTheSpotlight().attemptsTo(AdicionarCategoria.conElNombre(categoria));		
	}

	@Entonces("^se debe visualizar la (.*) en la tabla de categoria$")
	public void seDebeVisualizarLaMagicEnLaTablaDeCategoria(String categoriaConsulta) {
		theActorInTheSpotlight().should(seeThat(Categoria.name(), is(categoriaConsulta)));
	}

}
