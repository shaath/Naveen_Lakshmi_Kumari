package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadiobuttonsEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
//		List<WebElement> radios=block.findElements(By.tagName("input"));
//		
//		System.out.println(radios.size());
//		for (int i = 0; i < radios.size(); i++) 
//		{
//			String rtext=radios.get(i).getAttribute("value");
//			System.out.println(rtext);
//			if (rtext.equalsIgnoreCase("milk")) 
//			{
//				radios.get(i).click();
//			}
//			else if (rtext.equalsIgnoreCase("beer"))
//			{
//				radios.get(i).click();
//			}
//		}
		List<WebElement> g1=block.findElements(By.name("group1"));
		
		System.out.println(g1.size());
		for (int i = 0; i < g1.size(); i++) 
		{
			String rtext=g1.get(i).getAttribute("value");
			if (rtext.equalsIgnoreCase("cheese"))
			{
				g1.get(i).click();
				break;
			}
		}
	}

}
