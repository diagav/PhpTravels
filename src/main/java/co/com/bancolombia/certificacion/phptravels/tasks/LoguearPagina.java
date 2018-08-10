package co.com.bancolombia.certificacion.phptravels.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.phptravels.userinterfaces.HomePhpTravelsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoguearPagina implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue("admin@phptravels.com").into(HomePhpTravelsPage.EMAIL),
						 Enter.theValue("demoadmin").into(HomePhpTravelsPage.PASSWORD), 
						 Click.on(HomePhpTravelsPage.BOTON_LOGIN));
	}

	// metodo que nos devuelve la instancia de ella misma sin necesidad de hacer el
	// new buscar cancion
	public static LoguearPagina conUsuarioContrasena() {
		return instrumented(LoguearPagina.class);
	}

}
