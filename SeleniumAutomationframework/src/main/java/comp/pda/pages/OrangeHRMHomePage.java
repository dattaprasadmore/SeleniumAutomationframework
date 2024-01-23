package comp.pda.pages;

import org.openqa.selenium.By;
import com.pda.Enum.WaitStrategy;
import com.pda.reports.ExtentManager;
import com.pda.reports.ExtentReport;

public final class OrangeHRMHomePage extends BasePage{

	private final By linkWelcome = By.id("welcome");
	private final By linklogout = By.xpath(".//a[text()='Logout']");
	private final By linkdropdown = By.xpath(".//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
	
	public OrangeHRMHomePage clickWelcome() {
		click(linkWelcome, WaitStrategy.PRESENCE);
		ExtentManager.getExtentTest().pass("Welcome Clicked");
		return this;
	}
	
	public OrangeHRMLoginPage clickLogout() {
		click(linklogout,WaitStrategy.CLICKABLE);
		ExtentManager.getExtentTest().pass("Logout Clicked");
		return new OrangeHRMLoginPage();
	}
	
	public OrangeHRMHomePage clickDropdown() {
		click(linkdropdown,WaitStrategy.PRESENCE);
		ExtentManager.getExtentTest().pass("Dropdown Clicked");
		return this;
	}
	
}
