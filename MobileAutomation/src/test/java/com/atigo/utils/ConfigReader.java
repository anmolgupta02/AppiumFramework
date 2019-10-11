package com.atigo.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	Properties prop;

	public ConfigReader() throws Exception {
		String filepath = System.getProperty("user.dir") + "/conif.properties";
		File file = new File(filepath);
		FileInputStream fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);

	}

	public String getMobNum() {
		return prop.getProperty("mobNum");
	}

	public String getHeaderText() {
		return prop.getProperty("headerText");
	}
}
