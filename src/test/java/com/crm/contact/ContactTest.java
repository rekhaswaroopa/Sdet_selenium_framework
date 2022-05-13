package com.crm.contact;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test(groups = {"smokeTest"})
	public void createContact()
	{
		System.out.println("create contact");
	}
	@Test(groups = {"regressionTest"})
	public void modifyContact()
	{
		System.out.println("modify contact");
	}
	@Test(groups = {"regressionTest"})
	public void deleteContact()
	{
		System.out.println("delete Contact"+System.getProperty("browser"));
	}
}
