package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class BaseTest {
	WebDriver driver = null;
	DesiredCapabilities capabilities = new DesiredCapabilities();
	
	
	public WebDriver initiateDriverIntance(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Firefox")){
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("IE") || browser.equalsIgnoreCase("Internet Explorer")) {
			driver = new InternetExplorerDriver();
		}else if(browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}else {
			driver = new SafariDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		return driver;
	}
	
	
	public void closeDriver() {
		try {
			driver.close();
			driver.quit();
		}catch(Exception e){
			e.getCause();
			
		}
	}
	
	

}
