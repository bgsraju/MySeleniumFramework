package base;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonMethods {
	WebDriver driver;
	WebDriverWait wait;
	

	public CommonMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * 
	 * @param webElement
	 * @param text
	 */
	public void enterText(WebElement element, String text) {
		try {
			element.sendKeys(text);
		}catch(NullPointerException npe) {
			npe.getMessage();
		}catch(ElementNotVisibleException enve) {
			enve.getMessage();
		}
	}
	
	/**
	 * 
	 * @param element
	 * @param text
	 */
	public void enterText(By element, String text) {
		try {
			driver.findElement(element).sendKeys(text);
		}catch(NullPointerException npe) {
			npe.getMessage();
		}catch(ElementNotVisibleException enve) {
			enve.getMessage();
		}
	}
	
	/**
	 * 
	 * @param element
	 * @param text
	 * @param time
	 */
	public void enterText(WebElement element, String text, int time) {
		try {
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
			element.sendKeys(text);
		}catch(TimeoutException te) {
			te.getMessage();
		}catch(NullPointerException npe) {
			npe.getMessage();
		}catch(ElementNotVisibleException enve) {
			enve.getMessage();
		}
	}
	
	
	/**
	 * 
	 * @param element
	 * @param text
	 * @param time
	 */
	public void enterText(By element, String text, int time) {
		try {
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
			driver.findElement(element).sendKeys(text);
		}catch(TimeoutException te) {
			te.getMessage();
		}catch(NullPointerException npe) {
			npe.getMessage();
		}catch(ElementNotVisibleException enve) {
			enve.getMessage();
		}
	}
	
	
	/**
	 * 
	 * @param element
	 */
	public void click(WebElement element) {
		try {
			element.click();
		}catch(ElementNotVisibleException enve) {
			enve.getMessage();
		}
	}
	
	/**
	 * 
	 * @param element
	 */
	public void click(By element) {
		try {
			driver.findElement(element).click();
		}catch(ElementNotVisibleException enve) {
			assertTrue(false, enve.getMessage());
		}
	}
	
	
	public void clearText(By element) {
		try {
			driver.findElement(element).clear();
		}catch(ElementNotVisibleException enve) {
			assertTrue(false, enve.getMessage());
		}
	}
	
	public void clearText(WebElement element) {
		try {
			element.clear();
		}catch(ElementNotVisibleException enve) {
			assertTrue(false, enve.getMessage());
		}
	}
	
}
