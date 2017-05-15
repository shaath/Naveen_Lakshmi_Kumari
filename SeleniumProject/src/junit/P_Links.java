package junit;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P_Links extends Junitmaster
{
	@Test
	public void links()
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++)
		{
			String text=links.get(i).getText();
			System.out.println(text);
		}
	}

}
