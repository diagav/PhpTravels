package co.com.bancolombia.certificacion.phptravels.questions;

import static co.com.bancolombia.certificacion.phptravels.userinterfaces.BlogCategoryPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("la categoria adicionada es")

public class Categoria implements Question<String> {
	
	public static Categoria name () {
		return new Categoria();
	}
	
	@Override
	public String answeredBy(Actor actor) {	
		return CATEGORY_ADD.resolveFor(actor).getText();   
	}

}
