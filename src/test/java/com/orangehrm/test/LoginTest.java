package com.orangehrm.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.page.LoginPage;
import com.orangehrm.utils.BaseClass;

public class LoginTest extends BaseClass{
	
	
	@BeforeMethod
	public void start () {
		setUp("chrome");
	}
	
	@Test
	public void lgoin() {
		LoginPage login= new LoginPage();
		login.doLogin();
	}
	
	@AfterMethod
	public void close() {
		tearDown();
	}

}
