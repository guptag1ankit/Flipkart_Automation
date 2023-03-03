package pageUtility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.BaseLibrary;

public class Baby_Kids_menu extends BaseLibrary{
public Baby_Kids_menu()
{
	PageFactory.initElements(driver, this);
}



@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
private WebElement close;

@FindBy(xpath="//div[text()='Mobiles']")
private WebElement mobiles;

@FindBy(xpath="//span[text()='Baby & Kids']")
private WebElement Baby_kids;

public void baby_kids_subMenu() throws InterruptedException
{
	close.click();
	mobiles.click();
	Thread.sleep(5000);
	mousehover(Baby_kids);
    Thread.sleep(2000);
    System.out.println("Baby_kids menu");
    System.out.println("------------------------------------------------------------------------");
    System.out.println("Kids clothing submenu");
    List<WebElement> list7=driver.findElements(By.xpath("//a[contains(text(),'Kids Clothing')]/following-sibling::a"));
		for(int i=0;i<=list7.size()-1;i++)
		{
			System.out.println(list7.get(i).getText());
		}
	
}
}
