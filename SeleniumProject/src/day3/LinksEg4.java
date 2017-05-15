package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg4 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();
		
//		driver.findElement(By.linkText("Home")).click();
//		driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul/li[1]/a")).click();
		
//		WebElement block=driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul"));
//		
//		List<WebElement> links=block.findElements(By.tagName("a"));
//		System.out.println(links.size());
//		
//		for (int i = 0; i < links.size(); i++)
//		{
//			String ltext=links.get(i).getText();
//			System.out.println(ltext);
//			if (ltext.equalsIgnoreCase("home")) 
//			{
//				links.get(i).click();
//				break;
//			}
//	}
		driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul")).findElement(By.linkText("Home")).click();
		
		
	}

}
