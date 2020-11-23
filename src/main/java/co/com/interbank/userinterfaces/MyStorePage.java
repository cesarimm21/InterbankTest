package co.com.interbank.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.base.url")
public class MyStorePage extends PageObject {
    public static final Target INPUT_PRODUCT = Target.the("Ingresamos el producto").located(By.id("search_query_top"));
    public static final Target BUTTON_BUSCAR = Target.the("hit en boton buscar").located(By.name("submit_search"));
    public static final Target PRODUCT_LIST = Target.the("Moverse a las lista de productos").located(By.cssSelector("ul.product_list"));
    public static final Target MOVE_TO_PROD = Target.the("Moverse a producto").located(By.cssSelector("div.product-container"));
    public static final Target COUNT_ITEMS = Target.the("Contador de cantidad de resultados").located(By.cssSelector("div.product-count"));
    public static final Target FIND_PRODUCT = Target.the("Existe un producto").located(By.className("product-container"));
    public static final Target ADD_CARD = Target.the("Hit en boton añadir a carrito").located(By.cssSelector("a.ajax_add_to_cart_button"));
    public static final Target MENSAJE_EXITO = Target.the("Mensaje de exito de añadido a carrito de compra").located(By.xpath("//div[contains(@class, 'layer_cart_product')]//h2"));

}
