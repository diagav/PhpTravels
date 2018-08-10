package co.com.bancolombia.certificacion.phptravels.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.phptravels.userinterfaces.BlogCategoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class EliminarCategoria implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BlogCategoryPage.CHECK_CATEGORY),
				Click.on(BlogCategoryPage.BOTON_DELETE_SELECTED));
	}

	// metodo que nos devuelve la instancia de ella misma sin necesidad de hacer el
	// new buscar cancion
	public static EliminarCategoria seleccionada() {
		return instrumented(EliminarCategoria.class);
	}

}
