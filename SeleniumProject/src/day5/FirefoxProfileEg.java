package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxProfileEg {

	public static void main(String[] args)
	{
		ProfilesIni pr=new ProfilesIni();
		
		WebDriver driver=new FirefoxDriver(pr.getProfile("MyProfile"));
		driver.get("http://google.com");

	}

}