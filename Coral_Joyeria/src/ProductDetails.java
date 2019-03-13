import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ProductDetails {
private WebDriver driver;
  @Test
  public void dummyTestCase() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"blog\"]/div/div[1]/div[1]/a")).click();
		WebElement title = driver.findElement(By.xpath("//*[@id=\"blog\"]/div/div[4]/article/div[2]/div[1]/div/h2"));
		Assert.assertTrue(title.isDisplayed());
		
		driver.findElement(By.id("username")).sendKeys("john_due");
		driver.findElement(By.id("password")).sendKeys("P@$$w0rd");
		driver.findElement(By.name("login")).click();
		
		WebElement accountTitle = driver.findElement(By.xpath("//*[@id=\"blog\"]/div/div[4]/article/div[2]/header/h1"));
		Assert.assertTrue(accountTitle.isDisplayed());
		
		driver.findElement(By.name("s")).sendKeys("collar");
		driver.findElement(By.xpath("//*[@id=\"blog\"]/div/div[3]/div[2]/form/button")).click();
		WebElement productTitle = driver.findElement(By.xpath("//*[@id=\"product-29\"]/div[2]/h1"));
		
		Assert.assertEquals(productTitle.getText(), "COLLAR CARACOL");
		Thread.sleep(5000);
		
  }
  @BeforeTest
  public void beforeTest() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\My Sandbox Software\\chromedriver_win32\\chromedriver.exe");	
	driver = new ChromeDriver();
	driver.get("http://companymx.com/coral/");
	driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
