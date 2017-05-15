package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_LogoutTest 
{
	public static WebDriver driver;
	@Given("^the browser launch and navigate to url$")
	public void the_browser_launch_and_navigate_to_url() throws Throwable 
	{
	  driver=new FirefoxDriver();
	  driver.get("http://opensource.demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	}

	@When("^Enter username and password$")
	public void enter_username_and_password() throws Throwable 
	{
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^click on login$")
	public void click_on_login() throws Throwable 
	{
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^welcome admin message dispalyed$")
	public void welcome_admin_message_dispalyed() throws Throwable 
	{
	    String expval="welcome";
	    String actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
	    Assert.assertEquals(expval, actval);
	}

	@When("^the tester clicks on welcome admin link$")
	public void the_tester_clicks_on_welcome_admin_link() throws Throwable 
	{
		Sleeper.sleepTightInSeconds(3);
	   driver.findElement(By.partialLinkText("Welcome")).click();
	}

	@When("^also clicks on logout$")
	public void also_clicks_on_logout() throws Throwable
	{
	    driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^display the login page$")
	public void display_the_login_page() throws Throwable
	{
		Sleeper.sleepTightInSeconds(3);
	    String expval="LOGIN";
	    String actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
	    Assert.assertEquals(expval, actval);
	}


}
