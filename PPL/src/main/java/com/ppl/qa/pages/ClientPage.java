 package com.ppl.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ppl.qa.base.TestBase;

public class ClientPage extends TestBase {
	

	@FindBy(name= "ctl00$MainBody$UCDemographicsMain$gvDemographics$ctl02$ddValue")
	@CacheLookup
	WebElement Case_Manager_Agency;
	@FindBy(name= "ctl00$MainBody$UCDemographicsMain$gvDemographics$ctl04$tbValue")
	@CacheLookup
	WebElement Consumer_ID;
	@FindBy(name= "ctl00$MainBody$UCDemographicsMain$gvDemographics$ctl06$ddValue")
	@CacheLookup
	WebElement Client_Program;
	@FindBy(name= "ctl00$MainBody$UCDemographicsMain$gvDemographics$ctl07$tbValue")
	@CacheLookup
	WebElement First_Name;
	@FindBy(name= "ctl00$MainBody$UCDemographicsMain$gvDemographics$ctl09$tbValue")
	@CacheLookup
	WebElement LastName;
	@FindBy(name= "ctl00$MainBody$btnSave")
	@CacheLookup
	WebElement Save_Btn;
	@FindBy(name= "ctl00$MainBody$btnNewConsumer")
	@CacheLookup
	WebElement EnrollConsumerBtn;
	public ClientPage() 
	{
		PageFactory.initElements(driver, this);
	}
	public void MovetoAddClientPage()
	{
		EnrollConsumerBtn.click();
	
	}
	public AccountResult CreateClient(String CMA, String Con_ID, String C_Prg, String FN,String LN) throws InterruptedException
	{
		Case_Manager_Agency.sendKeys(CMA);
		Thread.sleep(20000);
		Consumer_ID.sendKeys(Con_ID);
		Client_Program.sendKeys(C_Prg);
		First_Name.sendKeys(FN);
		LastName.sendKeys(LN);
		Save_Btn.click();
		return new AccountResult();
	}
}
