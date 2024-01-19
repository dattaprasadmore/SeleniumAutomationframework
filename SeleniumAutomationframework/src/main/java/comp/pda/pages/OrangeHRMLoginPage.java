package comp.pda.pages;

import org.openqa.selenium.By;

public final class OrangeHRMLoginPage extends BasePage {

	private final By textboxUserName = By.xpath(".//input[@name='username']");
	private final By textboxPassword = By.xpath(".//input[@name='password' and @type='password']");
	private final By buttonLogin = By.xpath(".//button[@type='submit']");
	
	
	public OrangeHRMLoginPage enterUserName(String username) {
		sendKeys(textboxUserName, username, "present");
		return this;
	}
	
	public OrangeHRMLoginPage enterPassword(String password) {
		sendKeys(textboxPassword, password,"present");
		return this;
	}
	
	public OrangeHRMHomePage clickLogin() {
		click(buttonLogin,"present");
		return new OrangeHRMHomePage();
	}
	
	public String getTitle() {
		return getPageTitle();
	}
	

}