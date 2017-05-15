package methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BasicmethodsEg {

	public static void main(String[] args) 
	{
		int value1=300;
		int value2=200;
		function1();
		String res=function2();
		System.out.println(res);
		
		BasicmethodsEg b=new BasicmethodsEg();
		b.function3();
		
		boolean flag=b.function4();
		System.out.println(flag);
		
		int result=b.sum(value1,value2);
		System.out.println(result);
	}

	//Static Method without returning any value
	public static void function1()
	{
		System.out.println("This is function1 code");
	}
	
	//Static Method with returning the value
	public static String function2()
	{
		System.out.println("This is function2 code");
		return "Pass";
	}
	//Nonstatic Method without returning anyvalue
	public void function3()
	{
		System.out.println("This is function3 code");
	}
	
	//Nonstatic Method with returning values
	public boolean function4()
	{
		System.out.println("This is function4 code");
		return true;
	}
	
	//Sum
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public void Takes_Screenshot(WebDriver driver, String Path) throws IOException
	{
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(Path));
		
	}
	
	public void Send_Text(WebDriver driver, String Loc, String value, String text)
	{
		if (Loc.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("name")) 
		{
			driver.findElement(By.name(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("classname"))
		{
			driver.findElement(By.className(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("tagname"))
		{
			driver.findElement(By.tagName(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("xpath")) 
		{
			driver.findElement(By.xpath(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("cssselector"))
		{
			driver.findElement(By.cssSelector(value)).sendKeys(text);
		}
	}
}
