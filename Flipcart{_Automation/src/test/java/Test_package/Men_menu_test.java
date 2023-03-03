package Test_package;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibrary.BaseLibrary;
import pageUtility.Men_menu;

public class Men_menu_test extends BaseLibrary {
	Men_menu ob;
	@BeforeTest
	public void getLaunch_url()
	{
		getLaunch_url("https://www.flipkart.com/");
		ob=new Men_menu ();
	}
	@Test(priority=0)
	public void subMenuOfMen_menu() throws InterruptedException
	{
		ob.subMenuOfMen_menu();
	}
}

