package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	@FindBy(how=How.ID, using="user_login")
	WebElement username_field;
	@FindBy(how=How.ID, using="user_pass")
	WebElement password_field;
	@FindBy(how=How.ID, using="wp-submit")
	WebElement submit_field;
	
	@FindBy(how=How.XPATH,using="//div[@class='welcome-panel-column']/a")
	WebElement customize_site;
	
	public void login(String username, String password) {
		username_field.sendKeys(username);
		password_field.sendKeys(password);
		submit_field.click();
		
	
	}
}
