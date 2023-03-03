package pageUtility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.BaseLibrary;

public class Men_menu extends BaseLibrary {
public Men_menu()
{
	 PageFactory.initElements(driver, this);
}

@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
private WebElement close;

@FindBy(xpath="//div[text()='Mobiles']")
private WebElement mobiles;

@FindBy(xpath="//span[text()='Men']")
private WebElement 	men;

public void subMenuOfMen_menu() throws InterruptedException
{
	close.click();
	mobiles.click();
	Thread.sleep(5000);
	 mousehover(men);
     Thread.sleep(2000);
     System.out.println("men menu");
     System.out.println("------------------------------------------------------------------------");
     System.out.println("Clothing submenu");
     List<WebElement> list5=driver.findElements(By.xpath("//a[text()='Clothing']/following-sibling::a"));
		for(int i=0;i<=list5.size()-1;i++)
		{
			System.out.println(list5.get(i).getText());
		}

}
}
