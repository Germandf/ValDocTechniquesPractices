package seleniumexample;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampletest {

	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/seleniumexample/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void testGooglePage() throws InterruptedException {
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.clear();
		searchbox.sendKeys("Youtube");
		searchbox.submit();
		driver.manage().timeouts().wait(10000);
		assertEquals("Youtube", driver.getTitle());
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
