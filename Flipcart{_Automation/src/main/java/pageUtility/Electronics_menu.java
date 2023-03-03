package pageUtility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.BaseLibrary;

public class Electronics_menu extends BaseLibrary{

	public Electronics_menu()
	{
	 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement close;
	
	@FindBy(xpath="//div[text()='Mobiles']")
	private WebElement mobiles;
	
	@FindBy(xpath="//span[text()='Electronics']")
	private WebElement Electronics;
	
	
	public void ListOfMobiles() throws InterruptedException
	{
		close.click();
		mobiles.click();
		Thread.sleep(5000);
		mousehover(Electronics);
		Thread.sleep(2000);
		System.out.println("mobiles list is given below");
		
		List<WebElement> list=driver.findElements(By.xpath("//a[text()='Mobiles']/following-sibling::a"));
		for(int i=0;i<=list.size()-1;i++)
		{
			System.out.println(list.get(i).getText());
		}
		
	       System.out.println("-------------------------------------------------------------------------------------------------------");

		System.out.println("mobiles accesories are given below");
		
		List<WebElement> list2=driver.findElements(By.xpath("//a[text()='Mobile Accessories']/following-sibling::a"));
		for(int i=0;i<=list2.size()-1;i++)
		{
			System.out.println(list2.get(i).getText());
		}
	       System.out.println("-------------------------------------------------------------------------------------------------------");

		System.out.println("Laptop Accesories");
		
		List<WebElement> list3=driver.findElements(By.xpath("//a[text()='Laptops']/following-sibling::a"));
		for(int i=0;i<=list3.size()-1;i++)
		{
			System.out.println(list3.get(i).getText());
		}
							
	}
	
}