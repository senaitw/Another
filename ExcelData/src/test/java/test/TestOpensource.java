package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.KeyUpAction;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BroweserFactory;
import util.ExcelReader;

public class TestOpensource {

	WebDriver driver;
	ExcelReader reader = new ExcelReader("./data/opensource1.xlsx");
	String username = reader.getCellData("sheet1", "UserName", 2);
	String password = reader.getCellData("sheet1", "Password", 2);
	String custom = reader.getCellData("sheet1", "Customize Your Site", 1);
	@Test
	public void validUserAbleToLogin() throws InterruptedException {
	driver = BroweserFactory.startBroweser();
	LoginPage login = PageFactory.initElements(driver, LoginPage.class);
	login.login(username,password);
	Thread.sleep(3000);
	//login.customize();
	
	}
}
