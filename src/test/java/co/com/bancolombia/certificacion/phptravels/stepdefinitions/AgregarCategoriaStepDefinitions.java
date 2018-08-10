package co.com.bancolombia.certificacion.phptravels.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.Is.is;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.Matchers.not;

import co.com.bancolombia.certificacion.phptravels.tasks.AdicionarCategoria;
import co.com.bancolombia.certificacion.phptravels.tasks.EliminarCategoria;
import co.com.bancolombia.certificacion.phptravels.tasks.LoguearPagina;
import co.com.bancolombia.certificacion.phptravels.userinterfaces.HomePhpTravelsPage;
import co.com.bancolombia.certificacion.phptravels.questions.Categoria;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class AgregarCategoriaStepDefinitions {

	private HomePhpTravelsPage homePhpTravels;
	@Managed(driver="chrome") 
	public static WebDriver driver;


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
	
	@Cuando("^elimina la categoria$")
	public void eliminaLaSportDeanne() throws InterruptedException {
		theActorInTheSpotlight().attemptsTo(EliminarCategoria.seleccionada());	
		Thread.sleep(5000);
//		System.out.println("antes de capturar ventana");

//		System.out.println("después del switch");
//		Alert myalert = driver.switchTo().alert(); 
//		myalert.accept();
//		System.out.println("pasó por el aceptar");

	}
	
	@Entonces("^se debe eliminar la (.*) de la tabla de categoria$")
	public void seDebeEliminarLaSportDeanneDeLaTablaDeCategoria(String categoriaEliminar) throws InterruptedException {
		//Thread.sleep(5000);
		//theActorInTheSpotlight().should(seeThat(Categoria.name(), not(categoriaEliminar)));
	}
	
	@After
	public void close() {
		Alert myalert = driver.switchTo().alert(); 
		myalert.accept();
		System.out.println("pasó por el aceptar");
	}
	
	

}
