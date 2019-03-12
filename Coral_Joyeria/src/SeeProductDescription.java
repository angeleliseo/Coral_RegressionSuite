import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeeProductDescription {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\My Sandbox Software\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.close();
	}

}
