package Test_package;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibrary.BaseLibrary;
import pageUtility.Women_menu;


public class Women_menu_test extends BaseLibrary{
	Women_menu ob;
	@BeforeTest
	public void getLaunch_url()
	{
		getLaunch_url("https://www.flipkart.com/");
		ob=new Women_menu ();
	}
	@Test(priority=0)
	public void subMenuOf_WomenMenu() throws InterruptedException
	{
		ob.subMenuOf_WomenMenu();
	}
}

