package Test_package;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibrary.BaseLibrary;
import pageUtility.Sports_book_more;

public class Sports_book_more_test  extends BaseLibrary{
	Sports_book_more ob;
@BeforeTest
public void getLaunchUrl()
{
	getLaunch_url("https://www.flipkart.com/");
	ob=new Sports_book_more();
}
@Test(priority=0)
public void Sports_book_more() throws InterruptedException
{
	ob.Sports_book_more();
}

}
