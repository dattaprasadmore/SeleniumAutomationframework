package com.pda.constants;

import com.pda.Enum.ConfigProperties;
import com.pda.utils.PropertyUtils;

public final class FrameworkConstants {

	private FrameworkConstants() {}
	
	private static final String RESOURCESPATH = System.getProperty("user.dir")+"/src/test/resources";
	private static final String CHROMEDRIVERPATH= RESOURCESPATH + "/executables/chromedriver.exe";
	private static final String CONFIGFILEPATH = RESOURCESPATH + "/config/config.properties";
	private static final int EXPLICITWAIT = 10;
	private static final String EXTENTREPORTPATH = System.getProperty("user.dir")+"/extent-test-output/";
	
	public static String getExtentreportpath() throws Exception {
		if(PropertyUtils.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("yes")) {
			return EXTENTREPORTPATH + "/" + System.currentTimeMillis() + "index.html";
		}else {
			return EXTENTREPORTPATH + "/" + "index.html";
		}
	}

	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}

	private static final String URL = "https://www.google.com";
	
	public static String getChromedriverPath() {
		return CHROMEDRIVERPATH;
	}
	
	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}
}