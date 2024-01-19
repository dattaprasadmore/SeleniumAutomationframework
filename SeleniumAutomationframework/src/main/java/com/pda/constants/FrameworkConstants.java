package com.pda.constants;

public final class FrameworkConstants {

	private FrameworkConstants() {}
	
	private static final String RESOURCESPATH = System.getProperty("user.dir")+"/src/test/resources";
	private static final String CHROMEDRIVERPATH= RESOURCESPATH + "/executables/chromedriver.exe";
	private static final String CONFIGFILEPATH = RESOURCESPATH + "/config/config.properties";
	
	private static final String URL = "https://www.google.com";
	
	public static String getChromedriverPath() {
		return CHROMEDRIVERPATH;
	}
	
	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}
}