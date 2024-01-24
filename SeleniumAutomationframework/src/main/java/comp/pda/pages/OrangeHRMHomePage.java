package comp.pda.pages;

import org.openqa.selenium.By;
import com.pda.Enum.WaitStrategy;
import com.pda.reports.ExtentLogger;
import com.pda.reports.ExtentManager;
import com.pda.reports.ExtentReport;

public final class OrangeHRMHomePage extends BasePage{

	private final By linkWelcome = By.id("welcome");
	private final By linklogout = By.xpath(".//a[text()='Logout']");
	private final By linkdropdown = By.xpath(".//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
	
	public OrangeHRMHomePage clickWelcome() {
		click(linkWelcome, WaitStrategy.PRESENCE);
		ExtentLogger.pass("Welcome Clicked");
		return this;
	}
	
	public OrangeHRMLoginPage clickLogout() {
		click(linklogout,WaitStrategy.CLICKABLE);
		ExtentLogger.pass("Logout Clicked");
		return new OrangeHRMLoginPage();
	}
	
	public OrangeHRMHomePage clickDropdown() {
		click(linkdropdown,WaitStrategy.PRESENCE);
		ExtentLogger.pass("Dropdown Clicked");
		return this;
	}
}
