package com.crm.contact;

import org.testng.annotations.Test;

public class ContactEditTest{
	@Test(groups = {"smokeTest"})
	public void createContactedit()
	{
		System.out.println("create contact");
	}
	@Test(groups = {"regressionTest"})
	public void modifyContactedit()
	{
		System.out.println("modify contact");
	}
	@Test(groups = {"regressionTest"})
	public void deleteContactedit()
	{
		System.out.println("delete Contact");
	}
}
