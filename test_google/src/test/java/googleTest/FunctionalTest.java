package googleTest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.net.MalformedURLException;
import java.net.URL;

public class FunctionalTest {
	
	protected static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Exception {
		
		//DesiredCapabilities caps = DesiredCapabilities.chrome();
		//driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), caps);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void cleanUp() {
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}	
}
