package com.ppl.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ppl.qa.base.TestBase;
import com.ppl.qa.pages.ClientPage;
import com.ppl.qa.pages.LoginPage;
import com.ppl.qa.pages.Program_RolePage;
import com.ppl.qa.util.TestUtil;

public class ClientPageTest extends TestBase {
	Program_RolePage Program_RolePage;
	ClientPage ClientPage;
	LoginPage loginPage;
	String sheetName="Client";
	public ClientPageTest(){
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException
	{
		intialization();
		loginPage=new LoginPage();
		Program_RolePage=loginPage.login(prop.getProperty("UserName"),prop.getProperty("Password"));
		ClientPage=Program_RolePage.Program_Role(prop.getProperty("Program"),prop.getProperty("Role"));
		ClientPage.MovetoAddClientPage();
	}
	@DataProvider
	public Object[][] getClientTestData()
	{
	
		Object data[][]=TestUtil.getTestData(sheetName);
		
		return data;
	}
	@Test(priority=1,dataProvider="getClientTestData")
	public void ValidateCreateNewClient(String CMA, String Consumer_ID,String Client_Program, String FN, String LN) throws InterruptedException {
	//	ClientPage.CreateClient("ATGC - 1","C15415", "PREP", "QAFN", "QALN");
		ClientPage.CreateClient(CMA, Consumer_ID, Client_Program, FN, LN);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
