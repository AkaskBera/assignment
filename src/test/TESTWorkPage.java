package test;

import org.testng.annotations.Test;

import base.BaseTest;
import pom.POMActitimeLoginPage;
import pom.POMActitimeWorkPage;

public class TESTWorkPage extends BaseTest
{
	@Test
	public void work() throws InterruptedException
	{
		POMActitimeLoginPage l=new POMActitimeLoginPage(driver);
		l.loginMethod();
		
		POMActitimeWorkPage w=new POMActitimeWorkPage(driver);
		w.workMethod();
	}

}
