package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	private By txtUser;
	private By txtPass;
	private By btnLogin;
	private By lnkOlvidePass;
	private By chkRecordarme;
	private WebDriver driver;
	
	
	public Login(WebDriver driver){
		this.driver = driver;
		txtUser = By.id("username");
		txtPass = By.id("password");
		btnLogin = By.name("login");
		lnkOlvidePass = By.xpath("//*[@id=\"blog\"]/div/div[4]/article/div[2]/div[1]/div/form/p[4]/a");
		chkRecordarme = By.id("rememberme");
	}

	public void login(String user, String password) {
		driver.findElement(txtUser).sendKeys(user);
		driver.findElement(txtPass).sendKeys(password);
		driver.findElement(btnLogin).click();
	}
	public void login(String user, String password, boolean rememberme) {
		driver.findElement(txtUser).sendKeys(user);
		driver.findElement(txtPass).sendKeys(password);
		driver.findElement(chkRecordarme).click();
		driver.findElement(btnLogin).click();		
	}
	
	public void olvidePassword() {
		driver.findElement(lnkOlvidePass).click();
	}
	
}
