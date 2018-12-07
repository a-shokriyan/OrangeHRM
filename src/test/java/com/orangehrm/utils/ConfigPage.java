package com.orangehrm.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigPage {

	Properties properties;

	public ConfigPage() {

		properties = new Properties();

		String propFile = ".\\Configuration\\credentional.properties";

		try {
			FileInputStream fis = new FileInputStream(propFile);
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getUserName() {
		String username = properties.getProperty("username");
		return username;
	}
	public String getPassword() {
		String pwd = properties.getProperty("password");
		return pwd;
	}
	public String getURL () {
		String site= properties.getProperty("url");
		return site;
	}
	public long getImplisiveWait() {
		String imWait = properties.getProperty("impwait");
		long time=Long.parseLong(imWait);
		return time;
	}
	public long getPageloadWait() {
		String pageWait = properties.getProperty("loadwait");
		long pageTime=Long.parseLong(pageWait);
		return pageTime;
	}
	public String getChromepath() {
		String chrome = properties.getProperty("chromepath");
		return chrome;
	}
	public String getFirefoxpath() {
		String firefox = properties.getProperty("firefoxpath");
		return firefox;
	}		

}
