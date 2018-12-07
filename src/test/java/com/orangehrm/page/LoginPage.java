package com.orangehrm.page;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;
import com.orangehrm.utils.CommonMethods;
import com.orangehrm.utils.ConfigPage;

public class LoginPage extends BaseClass{
	
	ConfigPage prop;
	
	@FindBy (id = "txtUsername")
	public WebElement userName;
	
	@FindBy (id = "txtPassword")
	public WebElement password;

	
	@FindBy (id = "btnLogin")
	public WebElement btnLogin;

	public LoginPage () {
		PageFactory.initElements(driver, this);
	}
	public void doLogin() {
		 prop= new ConfigPage();
		CommonMethods.enterValue(userName, prop.getUserName());
		CommonMethods.enterValue(password, prop.getPassword());
		CommonMethods.doClick(btnLogin);
		
	}

}
