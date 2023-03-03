package Test_package;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibrary.BaseLibrary;
import pageUtility.TV_Apliances_Menu;


public class TV_Apliances_Menu_test extends BaseLibrary{
	TV_Apliances_Menu ob;
	@BeforeTest
	public void getLaunch_url()
	{
		getLaunch_url("https://www.flipkart.com/");
		ob=new TV_Apliances_Menu ();
	}
	@Test(priority=0)
	public void TV_Apliances() throws InterruptedException
	{
		ob.TV_Apliances();
	}
}


