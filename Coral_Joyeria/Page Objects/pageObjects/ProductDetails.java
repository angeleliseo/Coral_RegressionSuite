package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*
 This class needs a different way to locate the objects since those objects are depending on product id the ones changes
 XPath optimization required probably a function can be used like contains.
 * */
public class ProductDetails {

	private By btnAlCarrito;
	private By txtCantidad;
	private By lnkDescripcion;
	private By lnkValoraciones;
	private WebDriver driver;
	
	public ProductDetails(WebDriver driver) {
		this.driver = driver;
		btnAlCarrito = By.xpath("//*[@id=\"product-27\"]/div[2]/form/button");	
		txtCantidad = By.name("quantity");
		lnkDescripcion = By.xpath("//*[@id=\"product-27\"]/div[3]/ul/li[1]/a");
		lnkValoraciones = By.xpath("//*[@id=\"product-27\"]/div[3]/ul/li[2]/a");
	}
	
	public void añadirAlCarro(int cantidad) {
		if (cantidad >0)
			driver.findElement(btnAlCarrito).click();
	}
	public void setProducto(String productURL) {
		driver.navigate().to(productURL);		
	}
	public void setProducto(String searchProduct, MainMenu menu) {
		menu.search(searchProduct);
	}
}
