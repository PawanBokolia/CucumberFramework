package StepDefination;

import org.openqa.selenium.WebDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	public WebDriver driver;
	public LoginPage loginpg;

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() 
	{
	    
	}

	@When("user open URL {string}")
	public void user_open_url(String string) {
	    
	}

	@When("User enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String string, String string2) {

	}

	@When("Click on Login")
	public void click_on_login() 
	{
		
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be1(String string) 
	{
	
	}

	@When("user click on the log out link")
	public void user_click_on_the_log_out_link() 
	{
	
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string)
	{
	
	}

	@Then("Close brower")
	public void close_brower() 
	{
	
	}

}
