package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomerPage {

	WebDriver ldriver;

	public SearchCustomerPage(WebDriver rDriver)
	{
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	
	}
	
	@FindBy(id="SearchEmail")
	WebElement emailAdd;
	
	@FindBy(id="Search-customers")
	WebElement searchbtn;
	
	@FindBy(xpath="//table[@role='grid']")
	WebElement searchResult;
	
	
	
	public void enterEmailAdd(String email)
	{
		emailAdd.sendKeys(email);
	}
	
	 
	public void clickOnSearchButton()
	{
		searchbtn.click();
	}
	

		
		
	
	
	
	
	
	
}