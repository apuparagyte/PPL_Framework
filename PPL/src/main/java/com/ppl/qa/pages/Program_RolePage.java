package com.ppl.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ppl.qa.base.TestBase;

public class Program_RolePage extends TestBase{

	@FindBy(name="ctl00$MainBody$ddUserPrograms")
	WebElement Program;
	@FindBy(name="ctl00$MainBody$ddUserProgramRoles")
	WebElement Role;
	@FindBy(name="ctl00$MainBody$Button1")
	WebElement GoBtn;

	public Program_RolePage() 
	{
		PageFactory.initElements(driver, this);
	}
	public String ValidateProgram_RolePageTitle()
	{
		return driver.getTitle();
	}
	public ClientPage Program_Role(String PR, String RE) throws InterruptedException
	{
		Program.sendKeys(PR);
		Thread.sleep(10000);
		Role.sendKeys(RE);
		GoBtn.click();
		return new ClientPage();

	}

}
