package BaseLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Application_Utility.code_reusability;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLibrary implements code_reusability {
	 public static WebDriver driver;
	public void getLaunch_url(String url)
	{
		 driver=WebDriverManager.chromedriver().create();
		driver.get(url);
		driver.manage().window().maximize();
		
	}

	public void mousehover(WebElement ele) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}


}
