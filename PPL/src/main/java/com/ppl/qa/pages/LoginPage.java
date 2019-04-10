package com.ppl.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ppl.qa.base.TestBase;

public class LoginPage extends TestBase {


	@FindBy(name="ctl00$MainBody$txtUserName1")
	WebElement UserName;
	@FindBy(name="ctl00$MainBody$txtPassword1")
	WebElement Password;
	@FindBy(name="ctl00$MainBody$btnLogin1")
	WebElement LoginBtn;
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}
	public String ValidateLoginPageTitle()
	{
		return driver.getTitle();
	}
	public Program_RolePage login(String UN, String PW)
	{
		UserName.sendKeys(UN);
		Password.sendKeys(PW);
		LoginBtn.click();
		return new Program_RolePage();
	}
	
}
