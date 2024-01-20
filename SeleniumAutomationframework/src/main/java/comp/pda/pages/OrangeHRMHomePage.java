package comp.pda.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.util.concurrent.Uninterruptibles;
import com.pda.Enum.WaitStrategy;
import com.pda.driver.DriverManager;

public final class OrangeHRMHomePage extends BasePage{

	private final By linkWelcome = By.id("welcome");
	private final By linklogout = By.xpath(".//a[text()='Logout']");
	private final By linkdropdown = By.xpath(".//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
	
	public OrangeHRMHomePage clickWelcome() {
		click(linkWelcome, WaitStrategy.PRESENCE);
		return this;
	}
	
	public OrangeHRMLoginPage clickLogout() {
		click(linklogout,WaitStrategy.CLICKABLE);
		return new OrangeHRMLoginPage();
	}
	
	public OrangeHRMHomePage clickDropdown() {
		click(linkdropdown,WaitStrategy.PRESENCE);
		return this;
	}
	
}
