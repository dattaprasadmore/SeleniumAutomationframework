package comp.pda.pages;

import org.openqa.selenium.By;

import com.pda.driver.DriverManager;

public final class OrangeHRMLoginPage extends BasePage {

	private final By textboxUserName = By.xpath(".//input[@name='username']");
	private final By textboxPassword = By.xpath(".//input[@name='password' and @type='password']");
	private final By buttonLogin = By.xpath(".//button[@type='submit']");
	
	
	public OrangeHRMLoginPage enterUserName(String username) {
		DriverManager.getDriver().findElement(textboxUserName).sendKeys(username);
		return this;
	}
	
	public OrangeHRMLoginPage enterPassword(String password) {
		DriverManager.getDriver().findElement(textboxPassword).sendKeys(password);
		return this;
	}
	
	public OrangeHRMHomePage clickLogin() {
		click(buttonLogin);
		return new OrangeHRMHomePage();
	}
	
	public String getTitle() {
		return DriverManager.getDriver().getTitle();
	}
	

}