package tests;

import org.testng.annotations.Test;

import pages.HomePage;
/*
 * 
 * author: Nasir Sultan 
 * LinkedIn: https://www.linkedin.com/in/nasirpk3/
 * 
 */
public class HomeTests extends BaseTests {
	
	HomePage homepage = new HomePage(driver, wait);

	//@Test annotation indicates that these are the testcases. 
	
	@Test
	public void TestCase001() throws InterruptedException {
		homepage.HomePage_Method1("user1", "12345678");
	}
	
	@Test
	public void TestCase002() {
		
		homepage.HomePage_Method2();
	}
	
	@Test
	public void TestCase003() {
		
		homepage.HomePage_Method3();
	}

}
