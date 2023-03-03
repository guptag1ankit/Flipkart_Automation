package Test_package;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibrary.BaseLibrary;
import pageUtility.Electronics_menu;

public class FlicpCart_Automation_test extends BaseLibrary{
	Electronics_menu ob;
	@BeforeTest
	public void getLaunch_url()
	{
		getLaunch_url("https://www.flipkart.com/");
		ob=new Electronics_menu();
	}
	@Test(priority=0)
	public void  ListOfMobiles() throws InterruptedException 
	{
		ob.ListOfMobiles();
	}
}
