package co.com.bancolombia.certificacion.phptravels.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static co.com.bancolombia.certificacion.phptravels.userinterfaces.BlogCategoryPage.*;
import static co.com.bancolombia.certificacion.phptravels.userinterfaces.HomePhpTravelsPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AdicionarCategoria implements Task {

	private final String categoriaParaAgregar;

	public AdicionarCategoria(String categoria) {
		// Constructor, inicializa los valores de las vbles (atributos) definidos en la
		// clase
		categoriaParaAgregar = categoria;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BLOG), Click.on(BLOG_CATEGORIES),
				Click.on(BOTON_ADD), Enter.theValue(categoriaParaAgregar).into(CATEGORY_NAME),
				Click.on(BOTON_SUBMIT));
	}

	// metodo que nos devuelve la instancia de ella misma sin necesidad de hacer el
	// new buscar cancion
	public static AdicionarCategoria conElNombre(String categoria) {
		return instrumented(AdicionarCategoria.class, categoria);
	}
}
