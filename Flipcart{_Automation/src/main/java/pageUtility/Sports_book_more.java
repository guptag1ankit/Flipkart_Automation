package pageUtility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.BaseLibrary;

public class Sports_book_more extends BaseLibrary {

	public Sports_book_more()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement close;

	@FindBy(xpath="//div[text()='Mobiles']")
	private WebElement mobiles;
	
	@FindBy(xpath="//span[text()='Sports, Books & More']")
	private WebElement sports_book_more;

	public void Sports_book_more() throws InterruptedException
	{
		close.click();
		mobiles.click();
		Thread.sleep(5000);
		mousehover(sports_book_more);
	       Thread.sleep(2000);
	       System.out.println("sports_book_more menu");
	       System.out.println("------------------------------------------------------------------------");
	       System.out.println("auto_acessories submenu");
	       List<WebElement> list9=driver.findElements(By.xpath("//a[@title='Auto Accessories']/following-sibling::a"));
			for(int i=0;i<=list9.size()-1;i++)
			{
				System.out.println(list9.get(i).getText());
			}
	}

}
