package com.ppl.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.ppl.qa.base.TestBase;
import com.ppl.qa.pages.Program_RolePage;
import com.ppl.qa.pages.ClientPage;
import com.ppl.qa.pages.LoginPage;
public class Program_RolePageTest extends TestBase {
	Program_RolePage Program_RolePage;
	ClientPage ClientPage;
	
	LoginPage loginPage;
	
	
	public Program_RolePageTest(){
		super();
	}

	@BeforeMethod
	public void setup()
	{
		intialization();
		loginPage=new LoginPage();
		Program_RolePage=loginPage.login(prop.getProperty("UserName"),prop.getProperty("Password"));
	}

	@Test(priority=1)
	public void ValidateProgram_RolePageTitle()
	{
		String title= Program_RolePage.ValidateProgram_RolePageTitle();
		Assert.assertEquals(title,"Select Role of a Program");	
	}

	@Test(priority=2)
	public void Program_RoleTest() throws InterruptedException
	{
		
		ClientPage=Program_RolePage.Program_Role(prop.getProperty("Program"),prop.getProperty("Role"));
	}	
	@Test(priority=3)
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
