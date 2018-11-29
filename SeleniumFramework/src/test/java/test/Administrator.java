package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import base.BaseTest;
import utility.ApplicationURL;

public class Administrator extends BaseTest {
	
	WebDriver driver;
	String applicationURL;
	
	@Parameters("application")
	@BeforeClass
	public void beforeClass(String application) throws IOException{
		applicationURL = ApplicationURL.getURL(application);
	}
	
	@Parameters("browser")
	@BeforeMethod
	public void beforeMethodSetUp(String browser) {
		driver = initiateDriverIntance(browser);
	}

}
