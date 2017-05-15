package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Gmaillogin {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Identifying email text box
		WebElement email=driver.findElement(By.id("Email"));

		//Sending the text into email textbox
		
		email.sendKeys("seleniumtrainer449");
		
		//clear the text
//		email.clear();
		//Clicking on next button
		driver.findElement(By.name("signIn")).click();
//		Sleeper.sleepTightInSeconds(5);
		//Sending text into password text box
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456799");
		//clicking on signin button
		driver.findElement(By.cssSelector("#signIn")).click();
	}

}
