package pageUtility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.BaseLibrary;

public class Women_menu extends BaseLibrary {

	public Women_menu()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement close;

	@FindBy(xpath="//div[text()='Mobiles']")
	private WebElement mobiles;
	
	@FindBy(xpath="//span[text()='Women']")
	private WebElement 	Women;
	
	public void subMenuOf_WomenMenu() throws InterruptedException
	{
		
		close.click();
		mobiles.click();
		Thread.sleep(5000);
		mousehover(Women);
	       Thread.sleep(2000);
	       System.out.println("women menu");
	       System.out.println("------------------------------------------------------------------------");
	       System.out.println("Ethenic wear submenu");
	       List<WebElement> list6=driver.findElements(By.xpath("//span[text()='Ethnic Wear']/following-sibling::a"));
			for(int i=0;i<=list6.size()-1;i++)
			{
				System.out.println(list6.get(i).getText());
			}
	
	}
	
	
}
