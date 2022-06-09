package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
/*
 * 
 * author: Nasir Sultan 
 * LinkedIn: https://www.linkedin.com/in/nasirpk3/
 * 
 */
public class BasePage {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	public BasePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	//generic methods to perform actions.

	//Genric method for click on any element.
	public void click(By elementloc) {
		driver.findElement(elementloc).click();
	}
	
	//Genric method write text into text or number fields.
	public void writeText(By elementloc, String text) {
		driver.findElement(elementloc).sendKeys(text);
	}
	
	//Generic method to read text from any element of web page
	public String readText(By elementloc) {
		return driver.findElement(elementloc).getText();
	}
	
	//generic method for explicit wait until the element is located.
	public void waitVisibility(By elementloc) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementloc));
	}
	
	//Generic wait method for element to be become clickable before performing any action.
	public void waitElementToBeClickable(By elementloc ) {		
		wait.until(ExpectedConditions.elementToBeClickable(elementloc));
	}
	
	//Generic method for assertions. It is used for matching actual and expected results.
	public void assertEquals (By elementloc, String expectedText) {
		waitVisibility(elementloc);
		 Assert.assertEquals(readText(elementloc), expectedText);
	}
	
	//Generic method for selecting values for comboboxes <select> tag
	public void comboBox(By elementloc, int index) {
		Select select= new Select(driver.findElement(elementloc));
		select.selectByIndex(index);
	}
	
	//Generic method for cleaing any text field before writing text into it.
	public void clearField (By elementloc) {
		driver.findElement(elementloc).clear();
	}
	
}