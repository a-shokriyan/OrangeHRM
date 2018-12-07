package com.orangehrm.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;
	public static ConfigPage prop;

	public void setUp(String browser) {

		prop = new ConfigPage();

		if (browser.equalsIgnoreCase("chrome")) {
			String chromepath = prop.getChromepath();
			System.setProperty("webdriver.chrome.driver", chromepath);
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			String firefoxpath = prop.getFirefoxpath();
			System.setProperty("webdriver.gecko.driver", firefoxpath);
			driver = new FirefoxDriver();
		} else {
			throw new RuntimeException("Please use chrome or firefox as browser");
		}
		long implWait = prop.getImplisiveWait();
		driver.manage().timeouts().implicitlyWait(implWait, TimeUnit.SECONDS);
		long loadWait = prop.getPageloadWait();
		driver.manage().timeouts().pageLoadTimeout(loadWait, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = prop.getURL();
		driver.get(url);
	}

	public void tearDown() {
		driver.quit();
	}

}
