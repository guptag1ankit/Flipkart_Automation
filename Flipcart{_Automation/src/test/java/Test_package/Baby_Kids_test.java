package Test_package;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibrary.BaseLibrary;
import pageUtility.Baby_Kids_menu;
import pageUtility.Electronics_menu;
public class Baby_Kids_test extends BaseLibrary {
	Baby_Kids_menu ob;
	@BeforeTest
	public void getLaunch_url()
	{
		getLaunch_url("https://www.flipkart.com/");
		ob=new Baby_Kids_menu ();
	}
	@Test(priority=0)
	public void baby_kids_subMenu() throws InterruptedException
	{
		ob.baby_kids_subMenu();
	}
}
