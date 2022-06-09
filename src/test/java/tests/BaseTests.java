package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
/*
 * 
 * author: Nasir Sultan 
 * LinkedIn: https://www.linkedin.com/in/nasirpk3/
 * 
 */
public class BaseTests {
	
	public WebDriver driver; 
	public WebDriverWait wait; 
	
	
	//BeforeMethod TesNG annotation indicates that this method will execute before each test method.
	
	@BeforeMethod
	public void setup() {
		String driverPath = "C:\\eclipse\\eclipse-workspace\\Heroku\\chromedriver.exe";
		String baseURL = "https://dummywebsite.com";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		driver.get(baseURL);
	}
	
	//AfterMethod TestNG annotation indicates that this method will execute after every test method.
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}


