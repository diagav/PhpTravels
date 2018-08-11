package co.com.bancolombia.certificacion.phptravels.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BlogCategoryPage extends PageObject {
	//abierto a extensión y cerrado a la moficación
	public static final Target BOTON_ADD = Target.the("boton add").located(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[1]/button"));
	public static final Target CATEGORY_NAME = Target.the("category name").located(By.xpath("//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[2]/div[1]/div/input"));
	public static final Target BOTON_SUBMIT = Target.the("boton submit").located(By.xpath("//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[3]/button[2]"));
	public static final Target CATEGORY_ADD = Target.the("category add").located(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[3]"));
	public static final Target BOTON_DELETE_SELECTED = Target.the("boton delete selected").located(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/a"));
	public static final Target CHECK_CATEGORY = Target.the("category add").located(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/div/ins"));
	//("//*[@id=\"content\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[contains(text(),'Sport Deanne')]"));						
}
