package configurations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserConfigurations {

	protected WebDriver driver;

	@BeforeMethod
	public void setUp() {
		//ChromeDriver 79 version has been used.
		System.setProperty("webdriver.chrome.driver", System.getProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//driver.get(URL);
	}

	@AfterMethod 
	public void tearDown() {

		driver.quit(); 

	}

}
