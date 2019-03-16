package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
		this.lnkcontactos =By.xpath("");
	}

	protected By getLnkinicio() {
		return lnkinicio;
	}

	
}
