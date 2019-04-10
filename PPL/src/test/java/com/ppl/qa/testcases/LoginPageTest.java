package com.ppl.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ppl.qa.base.TestBase;
import com.ppl.qa.pages.LoginPage;
import com.ppl.qa.pages.Program_RolePage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	Program_RolePage program_RolePage;
	
	public LoginPageTest(){
		super();
	}

	@BeforeMethod
	public void setup()
	{
		intialization();
		loginPage=new LoginPage();
	}

	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title= loginPage.ValidateLoginPageTitle();
		Assert.assertEquals(title,"Public Partnerships, LLC (PPL)");	
	}

	@Test(priority=2)
	public void LoginTest()
	{
		program_RolePage=loginPage.login(prop.getProperty("UserName"),prop.getProperty("Password"));

	}	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
