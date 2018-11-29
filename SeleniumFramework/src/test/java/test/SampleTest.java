package test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageLogin.Login;
import base.BaseTest;

public class SampleTest extends BaseTest{
	WebDriver driver;
	Login login;
	
	
	
	@BeforeMethod
	public void setUp() {
		driver = initiateDriverIntance("Chrome");
	}
	
	@Test
	public void test1() {
		driver.get("http://127.0.0.1/orangehrm-4.1.2.1/symfony/web/index.php/auth/login");
		login = new Login(driver);
		login.appLogin();
	}
	
	@Test
	public void test2() {
		driver.get("http://127.0.0.1/orangehrm-4.1.2.1/symfony/web/index.php/auth/login");
		login = new Login(driver);
		login.appLogin();
	}
	
	@AfterMethod
	public void tearDown() {
		closeDriver();
	}
	
}
