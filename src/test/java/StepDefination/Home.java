package StepDefination;

import org.testng.Assert;

import com.base.Base;
import com.pom.HomePage;
import com.pom.LoginPOM;

import io.cucumber.java.en.*;

public class Home extends Base
{
	LoginPOM login = new LoginPOM();
	HomePage home;
	
	@Given("User is on home page")
	public void user_is_on_home_page() 
	{
	   login.setInputusername(login.getUsername());
	   login.setInputpassword(login.getPassword());
	  home=  login.ClickOnLoginButton();
	}

	@When("Check logo is displayed or not")
	public void check_logo_is_displayed_or_not() 
	{
	  boolean result= home.ValidateHomeLogo();
	  System.out.println(result);
	}

	@Then("Validate the logo is displayed")
	public void validate_the_logo_is_displayed() 
	{
	    boolean actual= home.ValidateHomeLogo();
	    
	    Assert.assertTrue(actual);
	}

	

}
