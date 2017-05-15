package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Keyboard_MouseEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement user=driver.findElement(By.id("txtUsername"));
		
		Actions act=new Actions(driver);
		//Focusing on username textbox
		act.moveToElement(user).build().perform();
		Sleeper.sleepTightInSeconds(5);
		//Clciking on username textbox
		user.click();
		Sleeper.sleepTightInSeconds(5);
		//Sending some text into username textbox
		user.sendKeys("Admin");
		Sleeper.sleepTightInSeconds(5);
		//double Click
		
		act.doubleClick().build().perform();
		Sleeper.sleepTightInSeconds(5);
		//RightClick
		act.contextClick().build().perform();
		Sleeper.sleepTightInSeconds(5);
		//Clcking on d through keyboard
		act.sendKeys(Keys.chord("D")).build().perform();
		
		
		
	}

}
