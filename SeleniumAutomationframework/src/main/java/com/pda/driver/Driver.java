package com.pda.driver;

import java.io.IOException;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pda.constants.FrameworkConstants;
import com.pda.utils.ReadPropertyFile;

public final class Driver {

	//private static WebDriver driver;

	private Driver() {}

	public static void initDriver() throws Exception {

		//System.out.println(Thread.currentThread().getId() + " : "+ Driver.driver);
		
		if (Objects.isNull(DriverManager.getDriver())) {
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverPath());
			//WebDriver driver = new ChromeDriver(); // Ctrl+Shift+O
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(ReadPropertyFile.get("url"));
		}
	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
}