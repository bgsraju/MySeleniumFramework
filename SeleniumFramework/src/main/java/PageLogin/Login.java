package PageLogin;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.CommonMethods;

public class Login {
	
	CommonMethods methods;

	public Login(WebDriver driver) {
	methods = new CommonMethods(driver);
	PageFactory.initElements(driver, this);
	}
	
	
	
	
	//Login Page Objects...
	
	@FindBy(how= How.ID, using="txtUsername")
	WebElement txtUserName;
	
	@FindBy(id="txtPassword")
	WebElement txtPassword;
	
	@FindBy(id="btnLogin")
	WebElement btnLogin;
	
	/*By loginUserName= By.id("txtUsername") ;
	
	By loginPassword = By.id("txtPassword");
	
	By btnLogin = By.id("btnLogin");*/
	
	
	public void enterUserName(String userName){
		methods.clearText(txtUserName);
		methods.enterText(txtUserName, userName);
	}
	
	public void enterPassword(String password) {
		methods.clearText(txtPassword);
		methods.enterText(txtPassword, password);
	}
	
	public void clickLoginBtn() {
		methods.click(btnLogin);
	}
	
	public void appLogin() throws NullPointerException, ElementNotVisibleException{
		enterUserName("admin");
		enterPassword("P2$sword");
		clickLoginBtn();
	}
	
}
