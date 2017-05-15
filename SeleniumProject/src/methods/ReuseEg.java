package methods;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReuseEg {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		
		BasicmethodsEg b=new BasicmethodsEg();
		
//		b.Takes_Screenshot(driver, "F:\\Lakshmi_Kumari_Suma_Naveen\\SeleniumProject\\src\\screenshots\\facebook.bmp");

		b.Send_Text(driver, "id", "email", "gande3@gmail.com");
		b.Send_Text(driver, "id", "pass", "123456789");
	}

}
