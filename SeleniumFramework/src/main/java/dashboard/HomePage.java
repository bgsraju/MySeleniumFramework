package dashboard;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.CommonMethods;

public class HomePage {
	
	CommonMethods commonMethods;

	public HomePage(WebDriver driver) {
		this.commonMethods = new CommonMethods(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how= How.XPATH, using="//div[@id='wrapper']//a[@id='menu_admin_viewAdminModule']")
	WebElement menuAdmin;
	
	@FindBy(how=How.XPATH, using="//div[@id='wrapper']//a[@id='menu_pim_viewPimModule']")
	WebElement menuPIM;
	
	@FindBy(how=How.XPATH, using="//div[@id='wrapper']//a[@id='menu_leave_viewLeaveModule']")
	WebElement menuLeave;
	
	@FindBy(how=How.XPATH, using="//div[@id='wrapper']//a[@id='menu_time_viewTimeModule']")
	WebElement menuTime;
	
	@FindBy(how=How.XPATH, using="//div[@id='wrapper']//a[@id='menu_recruitment_viewRecruitmentModule']")
	WebElement menuRecruitment;
	
	@FindBy(how=How.XPATH, using="//div[@id='wrapper']//a[@id='menu__Performance']")
	WebElement menuPerformance;
	
	@FindBy(how=How.XPATH, using="//div[@id='wrapper']//a[@id='menu_dashboard_index']")
	WebElement menuDashboard;
	
	@FindBy(how=How.XPATH, using="//div[@id='wrapper']//a[@id='menu_directory_viewDirectory']")
	WebElement menuDirecotry;
	
	
	public void clickAdminLink() throws IOException {
		commonMethods.click(menuAdmin);
	}
	
	public void clickPIMLink() throws IOException{
		
	}
	
	
	
	
	
	
}
