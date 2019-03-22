package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*
Progress:
Todos los elementos destacables de menu principal fueron agregados con su debido localizador de elementos
Como aprendisaje no es tan rentable hacer properties para los objetos a localizar siendo que la funcion puede
ser perfectamente remplazada con el uso de las variables locales ya que solo seran accedidos por la clase misma
Pendings:
Hace falta terminar de implementar los metodos de accion del meno, busqueda,pick categoria, pick criterio y click en carrito 
 */
public class MainMenu {
	
	private By lnkinicio;
	private By lnkcontactos;
	private By lnkcarrito;
	private By lnkabout;
	private By lnklogin;
	private By txtsearch;
	private By btnsearch;
	private By combocategory;
	private By combocriterio;
	private By lnkcarrticon;
	
	public MainMenu(){
		this.lnkinicio = By.xpath("//*[@id=\"menu-item-22\"]/a");
		this.lnkcontactos =By.xpath("//*[@id=\"menu-item-20\"]/a");
		this.lnkcarrito = By.xpath("//*[@id=\"menu-item-23\"]/a");
		this.lnkabout = By.xpath("//*[@id=\"menu-item-21\"]/a");
		this.lnklogin = By.xpath("//*[@id=\"blog\"]/div/div[1]/div[1]/a");
		this.txtsearch = By.xpath("//*[@id=\"blog\"]/div/div[3]/div[2]/form/input[2]");
		this.btnsearch = By.xpath("//*[@id=\"blog\"]/div/div[3]/div[2]/form/button");
		this.combocategory = By.xpath("//*[@id=\"view-all-guides\"]/li/a");
		this.combocriterio =By.xpath("//*[@id=\"blog\"]/div/div[3]/div[2]/form/select");
		this.lnkcarrticon = By.xpath("//*[@id=\"blog\"]/div/div[1]/div[2]/div/a");
	}

	protected By getLnkinicio() {
		return lnkinicio;
	}
	
	protected By getlnkcontactos() {
		return lnkcontactos;
	}

	protected By getlnkcarrito() {
		return lnkcarrito;
	}

	protected By getLnkabout() {
		return lnkabout;
	}

	protected By getLnklogin() {
		return lnklogin;
	}
	protected By getTxtsearch() {
		return txtsearch;
	}
	protected By getBtnsearch() {
		return btnsearch;
	}
	protected By getCombocategory() {
		return combocategory;
	}
	protected By getCombocriterio() {
		return combocriterio;
	}
	protected By getLnkcarrticon() {
		return lnkcarrticon;
	}
	
	public void clickInicio(WebDriver driver) {
		driver.findElement(getLnkinicio()).click();
	}
	public void clickContactos(WebDriver driver) {
		driver.findElement(getlnkcontactos()).click();
	}
	public void clickCarrito(WebDriver driver) {
		driver.findElement(getlnkcarrito()).click();
	}
	public void clickAbout(WebDriver driver) {
		driver.findElement(getLnkabout()).click();
	}
	public void clickLogin(WebDriver driver) {
		driver.findElement(getLnklogin()).click();
	}
}
