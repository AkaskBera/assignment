package test;

import org.testng.annotations.Test;

import base.BaseTest;
import pom.POMActitimeLoginPage;

public class TESTLoginActitime extends BaseTest
{
	@Test
	public void login()
	{
		POMActitimeLoginPage l=new POMActitimeLoginPage(driver);
		l.loginMethod();
	}
	

}
