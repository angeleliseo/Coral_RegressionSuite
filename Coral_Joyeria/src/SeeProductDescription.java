import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeeProductDescription {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\My Sandbox Software\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("http://companymx.com/coral/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"blog\"]/div/div[1]/div[1]/a")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
