package StepDefination;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import PageObject.AddNewCustomerPage;
import PageObject.LoginPage;
import Utilities.ReadConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

/*Child Class */

public class StepDef extends BaseClass{

	@Before(order=1)   //Hook with order
	public void setUp() throws IOException
	{
		readConfig = new ReadConfig();

		//initialise logger
		log = LogManager.getLogger("StepDef");

		System.out.println("Setup-Sanity method executed..");

		String browser = readConfig.getBrowser();

		//launch browser
		switch(browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;

		}
	
	}

	@Before("@sanity")					//Hook with tag
	public void setUp2()
	{
		System.out.println("setup method executed");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() 
	{

		loginpg= new LoginPage(driver);
		addNewCusPg = new AddNewCustomerPage(driver);
	}

	@When("User opens URL {string}")
	public void user_open_url(String URL) 
	{
		driver.get(URL);
		driver.manage().window().maximize();

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




	/////////////////////////////////   Add new customer ///////////////////////////////////////////////


	@Then("user can view Dashboard")
	public void user_can_view_dashboard() 
	{
		String actualTitle = addNewCusPg.getPageTitle();
		String expectedTitle = "Dashboard / nopCommerce administration";

		if(actualTitle.equals(expectedTitle))
		{
			Assert.assertTrue(true);
		}

		else
		{
			Assert.assertTrue(false);
		}

	}

	@When("user click on customers menu")
	public void user_click_on_customers_menu() 
	{
		addNewCusPg.clickOnCustomersMenu();
	}

	@When("click on add new customer")
	public void click_on_add_new_customer() 
	{
		addNewCusPg.clickOnAddnew();
	}

	@Then("user can view add new customer page")
	public void user_can_view_add_new_customer_page()
	{
		String actualTitle = addNewCusPg.getPageTitle();
		String expectedTitle = "Add new ";

		if(actualTitle.equals(expectedTitle))
		{
			Assert.assertTrue(true);
		}

		else
		{
			Assert.assertTrue(false);
		}

	}

	@When("user enter customer info")
	public void user_enter_customer_info()
	{
		addNewCusPg.enterEmail(generateEmailID()+"@gmail.com");
		addNewCusPg.enterPassword("test1");
		addNewCusPg.enterFirstName("Pawan");
		addNewCusPg.enterLastName("Bokolia");
		addNewCusPg.enterGender("Male");
		addNewCusPg.enterDob("7/6/1995");
		addNewCusPg.enterCompanyName("codeStudio");


	}

	@When("click on the save button")
	public void click_on_the_save_button()
	{


	}

	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) 
	{

	}

	@Then("clocse browser")
	public void clocse_browser() {


	}


	@After
	public void tearDown(Scenario sc)
	{
		System.out.println("Tear down executed");
		if(sc.isFailed()==true)
		{
			String path = ".//ScreenShot/";
		}

		driver.quit();
	}

	/*	@BeforeStep 
	public void beforeStep()
	{
		System.out.println("before step");
	}

	@AfterStep
	public void afterSteps()
	{
		System.out.println("After steps");
	}
	 */	



}
