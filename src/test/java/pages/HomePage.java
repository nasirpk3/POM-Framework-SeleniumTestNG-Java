package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
 * 
 * author: Nasir Sultan 
 * LinkedIn: https://www.linkedin.com/in/nasirpk3/
 * 
 */
public class HomePage extends BasePage {

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	//Locators
	
	By emailID = By.id("email");
	By passwordID = By.id("password");
	By submitBtn = By.xpath("//span[@placeholder='submit']");
	By userloggedInSuccessfully = By.id("user1");
	
	//Test  Methods
	
	public void HomePage_Method1(String email, String password) throws InterruptedException {
		//here we will call the generic methods to perform the actions like click
		
		//step1: wait for email field to be visible on web page and write email ID
		waitVisibility(emailID); writeText(emailID, email);
		
		//step2: wait for password field to be visible on web page and write password
		waitVisibility(passwordID); writeText(passwordID, password);
		
		//step3: wait for submit button to be visible on web page and click on it. 
		waitVisibility(submitBtn); click(submitBtn);
		
		//step4: Verify if the user is is logged in successfully
		assertEquals(userloggedInSuccessfully,"User-1");
		
		Thread.sleep(2000);
	}
	
	public void HomePage_Method2() {
		// here you can write steps another test method steps
	}
	
	public void HomePage_Method3() {
		// here you can write steps another test method steps
	}
	
}
