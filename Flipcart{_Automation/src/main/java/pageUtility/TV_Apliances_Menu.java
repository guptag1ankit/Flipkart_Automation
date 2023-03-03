package pageUtility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.BaseLibrary;

public class TV_Apliances_Menu extends BaseLibrary {

	public TV_Apliances_Menu()
	{
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement close;

	@FindBy(xpath="//div[text()='Mobiles']")
	private WebElement mobiles;
	
	
	@FindBy(xpath="//span[text()='TVs & Appliances']")
	private WebElement 	TVs_Appliances;


public void TV_Apliances() throws InterruptedException
{
	close.click();
	mobiles.click();
	Thread.sleep(5000);	
	mousehover(TVs_Appliances);
    Thread.sleep(2000);
    System.out.println("Tv and Appliances menu");
    System.out.println("------------------------------------------------------------------------");
    System.out.println("Television submenu");

    List<WebElement> list4=driver.findElements(By.xpath("//a[@title='Television']/following-sibling::a"));
		for(int i=0;i<=list4.size()-1;i++)
		{
			System.out.println(list4.get(i).getText());
		}
		
}

}