package pageUtility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.BaseLibrary;

public class Home_Furniture_menu extends BaseLibrary{
public Home_Furniture_menu()
{
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
private WebElement close;

@FindBy(xpath="//div[text()='Mobiles']")
private WebElement mobiles;

@FindBy(xpath="//span[text()='Home & Furniture']")
private WebElement home_furniture;

public void Home_Furniture_menu() throws InterruptedException
{
	close.click();
	mobiles.click();
	Thread.sleep(5000);
	mousehover(home_furniture);
    Thread.sleep(2000);
    System.out.println(" home_furniture menu");
    System.out.println("------------------------------------------------------------------------");
    System.out.println("kitchen_cookware submenu");
    List<WebElement> list8=driver.findElements(By.xpath("//a[@title='Kitchen, Cookware & Serveware']/following-sibling::a"));
		for(int i=0;i<=list8.size()-1;i++)
		{
			System.out.println(list8.get(i).getText());
		}
	
}
}
