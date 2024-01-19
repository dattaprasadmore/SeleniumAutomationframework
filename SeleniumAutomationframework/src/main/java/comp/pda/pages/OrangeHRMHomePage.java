package comp.pda.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.util.concurrent.Uninterruptibles;
import com.pda.driver.DriverManager;

public final class OrangeHRMHomePage extends BasePage{

	private final By linkWelcome = By.id("welcome");
	private final By linklogout = By.xpath(".//a[text()='Logout']");
	private final By linkdropdown = By.xpath(".//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
	
	public OrangeHRMHomePage clickWelcome() {
		DriverManager.getDriver().findElement(linkWelcome).click();
		return this;
	}
	
	public OrangeHRMLoginPage clickLogout() {
		
		new WebDriverWait(DriverManager.getDriver(),10)
				.until(ExpectedConditions.elementToBeClickable(linklogout));
		
		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		DriverManager.getDriver().findElement(linklogout).click();
		return new OrangeHRMLoginPage();
	}
	
	public OrangeHRMHomePage clickDropdown() {
		DriverManager.getDriver().findElement(linkdropdown).click();
		return this;
	}
	
}
