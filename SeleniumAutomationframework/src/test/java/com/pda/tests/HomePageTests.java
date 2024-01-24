package com.pda.tests;

import java.util.List;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pda.driver.DriverManager;

public final class HomePageTests extends BaseTest{
	
	private HomePageTests() {}
	
	//Validate whether the title containing Google Search OR google search
	//Validate whether the title is not null and the length of title is greater than 15 and less than 100
	//Check links in the page --> Testing
	//Validate number of links displayed is exactly 10 or 15
	
	@Test
	public void test3() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("testing mini bytes - YouTube",Keys.ENTER);
		String sTitle = DriverManager.getDriver().getTitle();
		Assert.assertTrue(Objects.nonNull(sTitle),"Title is null");
		//Assert.assertTrue(sTitle.toLowerCase().contains("Google Search"));
		Assert.assertTrue(sTitle.toLowerCase().matches("\\w.*" + "google search"));
		Assert.assertTrue(sTitle.length()>15);
		Assert.assertTrue(sTitle.length()<100);
		List<WebElement> elements = DriverManager.getDriver().findElements(By.xpath("//h3"));
		//Assert.assertEquals(elements.size(), 10);
		
		boolean isElementPresent = false;
		for(WebElement element : elements) {
			if(element.getText().equalsIgnoreCase("testing mini bytes")) {
				isElementPresent = true;
				break; 
			}
		}
		Assert.assertTrue(isElementPresent,"testing mini bytes not found");
	}
}