package com.crm.organization;

import org.testng.annotations.Test;

public class OrganizationTest {
	
	@Test(groups = {"smokeTest"})
	public void createOrg()
	{
		System.out.println("create org");
	}
	
	@Test(groups = {"regressionTest"})
	public void gihub()
	{
		//changes 1 rekha
		System.out.println("delete org");
	}
	@Test(groups = {"regressionTest"})
	public void modifyOrg()
	{
		System.out.println("modify org");
	}
	@Test(groups = {"regressionTest"})
	public void deleteOrg()
	{
		System.out.println("delete org");
	}
}
