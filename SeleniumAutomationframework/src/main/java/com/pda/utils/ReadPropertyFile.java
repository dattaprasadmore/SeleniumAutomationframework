package com.pda.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.pda.constants.FrameworkConstants;

public final class ReadPropertyFile {

	private ReadPropertyFile() {
		
	}
	
	private static Properties property = new Properties();
	private static final Map<String,String> CONFIGMAP = new HashMap<>();
	
	static {
		try {
			FileInputStream file = new FileInputStream(FrameworkConstants.getConfigfilepath());
			property.load(file);
			
			for(Object key : property.keySet()) {
				CONFIGMAP.put(String.valueOf(key), String.valueOf(property.get(key)));
			}
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

// Property file would work like Hashtable 
//	Hashtable - little slow but Threadsafe
// Converting a Property to HashMap need some time
	
	public static String get(String key) throws Exception {
		if(Objects.isNull(key)||Objects.isNull(CONFIGMAP.get(key))) {
			throw new Exception("Property name " + key + " is not found. Please check config.properties");
		}
		return CONFIGMAP.get(key);
	}
	
	/*public static String getValue(String key) throws Exception {
		String value = "";
		value = property.getProperty(key);
		if(Objects.isNull(value)) {
			throw new Exception("Property name " + key + " is not found. Please check config.properties");
		}
		
		return property.getProperty(key);
	}*/
	
}
