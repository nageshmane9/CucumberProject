package StepDefination;

import java.io.IOException;

import org.testng.Assert;

import com.base.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Base
{
	
	@Given("I am on login page")
	public void i_am_on_login_page() throws IOException 
	{
	   LaunchTheWeb();
		
	}

	@When("Get title of the page")
	public void get_title_of_the_page() 
	{
	    driver.getTitle();
		
	}

	@Then("Validate title of the page")
	public void validate_title_of_the_page() 
	{
	  String actual=driver.getTitle();
	  String expected = prop.getProperty("Logintitle");
	  
	  Assert.assertEquals(actual, expected);
		
	}

		
 

 
}
