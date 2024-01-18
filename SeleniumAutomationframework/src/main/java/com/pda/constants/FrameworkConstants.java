package com.pda.constants;

public final class FrameworkConstants {

	private FrameworkConstants() {}
	
	private static final String CHROMEDRIVERPATH= System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";
	private static final String URL = "https://www.google.com";
	
	public static String getChromedriverPath() {
		return CHROMEDRIVERPATH;
	}
}