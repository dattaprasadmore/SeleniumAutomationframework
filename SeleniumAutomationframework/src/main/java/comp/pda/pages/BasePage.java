package comp.pda.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pda.Enum.WaitStrategy;
import com.pda.constants.FrameworkConstants;
import com.pda.driver.DriverManager;
import com.pda.factories.ExplicitWaitFactory;

public class BasePage {

	protected void click(By by, WaitStrategy waitstrategy) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitstrategy, by);
		element.click();
	}
	
	protected void sendKeys(By by, String value, WaitStrategy waitstrategy) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitstrategy, by);
		element.sendKeys(value);
	}
	
	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}
	
	private void explicitlyWaitForElementToBeClickable(By by) {
		new WebDriverWait(DriverManager.getDriver(),FrameworkConstants.getExplicitwait())
		.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	private void explicitlyWaitForElementToBePresent(By by) {
		new WebDriverWait(DriverManager.getDriver(),FrameworkConstants.getExplicitwait())
		.until(ExpectedConditions.presenceOfElementLocated(by));
	}
}
