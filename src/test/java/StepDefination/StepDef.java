package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	public WebDriver driver;
	public LoginPage loginpg;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() 
	{
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    loginpg= new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_open_url(String URL) 
	{
		driver.get(URL);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String email, String pwd) 
	{
		loginpg.enterEmail(email);
		loginpg.enterPassword(pwd);
	}

	@When("Click on Login")
	public void click_on_login() 
	{
		loginpg.clickOnLoginButton();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be1(String expTitle) 
	{
		String actualTitle =driver.getTitle();
		if(actualTitle.equals(expTitle))
		{
			Assert.assertTrue(false);
		}
	
		else
		{
			Assert.assertTrue(false);
		}
	
	
	}

	@When("User click on Log out link")
	public void user_click_on_the_log_out_link() 
	{
		loginpg.clickOnLogOutButton();
	}

	

	@Then("close browser")
	public void close_brower() 
	{
		driver.close();
		driver.quit();
	}

}
