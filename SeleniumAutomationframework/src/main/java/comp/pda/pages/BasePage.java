package comp.pda.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pda.constants.FrameworkConstants;
import com.pda.driver.DriverManager;

public class BasePage {

	protected void click(By by, String waitstrategy) {
		if(waitstrategy.equalsIgnoreCase("clickable")) {
			explicitlyWaitForElementToBeClickable(by);
		}
		else if(waitstrategy.equalsIgnoreCase("present")) {
			explicitlyWaitForElementToBePresent(by);
		}
		
		DriverManager.getDriver().findElement(by).click();
	}
	
	protected void sendKeys(By by, String value, String waitstrategy) {
		if(waitstrategy.equalsIgnoreCase("clickable")) {
			explicitlyWaitForElementToBeClickable(by);
		}
		else if(waitstrategy.equalsIgnoreCase("present")) {
			explicitlyWaitForElementToBePresent(by);
		}
		DriverManager.getDriver().findElement(by).sendKeys(value);
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
