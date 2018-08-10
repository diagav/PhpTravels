package co.com.bancolombia.certificacion.phptravels.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://phptravels.net/admin/")
public class HomePhpTravelsPage extends PageObject {

	public static final Target EMAIL = Target.the("email").located(By.name("email"));
	
	
	public static final Target PASSWORD = Target.the("password").located(By.name("password"));
	public static final Target BOTON_LOGIN = Target.the("boton login").located(By.xpath("/html/body/div/form[1]/button/span[1]"));
	
	public static final Target BLOG = Target.the("blog").located(By.xpath("//*[@id=\"social-sidebar-menu\"]/li[12]/a"));
	public static final Target BLOG_CATEGORIES = Target.the("blog categories").located(By.xpath("//*[@id=\"Blog\"]/li[2]/a"));
	
}
