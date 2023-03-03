package Test_package;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibrary.BaseLibrary;
import pageUtility.Home_Furniture_menu;

public class Home_Furniture_menu_test extends BaseLibrary {
	Home_Furniture_menu ob;
	@BeforeTest
	public void getLaunch_url()
	{
		getLaunch_url("https://www.flipkart.com/");
		ob=new Home_Furniture_menu ();
	}
	@Test(priority=0)
	public void Home_Furniture_menu() throws InterruptedException
	{
		ob.Home_Furniture_menu();
	}
}
