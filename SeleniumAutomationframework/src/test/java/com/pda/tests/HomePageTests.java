package com.pda.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.pda.driver.Driver;
import com.pda.driver.DriverManager;

public final class HomePageTests extends BaseTest{
	
	private HomePageTests() {}
	
	@Test
	public void test3() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
	}
	
	@Test
	public void test4() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
	}
}