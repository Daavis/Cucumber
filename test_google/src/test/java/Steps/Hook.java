package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook extends BaseUtil {
	
	private BaseUtil base;

	public Hook(BaseUtil base) {
		this.base = base;
	}
	
	@Before
	public void InitTest() {
		System.out.println("Opening the browser");
		
		WebDriverManager.chromedriver().setup();
		base.driver = new ChromeDriver();
		base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void TearDownTest() {
		System.out.println("Closing the browser");
		base.driver.quit();
	}
	
}
