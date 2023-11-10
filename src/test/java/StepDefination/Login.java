package StepDefination;

import java.io.IOException;


import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.base.Base;
import com.pom.LoginPOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Base
{
	
      LoginPOM login = new LoginPOM();
      SoftAssert soft= new SoftAssert();
	
	@Given("User is on login page")
	public void i_am_on_login_page() throws IOException 
	{
	   driver=LaunchTheWeb();	
	}

	@When("Get title of the page")
	public void get_title_of_the_page() 
	{
	   System.out.println( "Title :"+driver.getTitle());
		
	}
  
	@Then("Validate title of the page")
	public void validate_title_of_the_page() 
	{
	  String actual=driver.getTitle();
	  String expected = prop.getProperty("Logintitle");
	  
	  Assert.assertEquals(actual, expected);
		
	}
	
	
	@When("Get URL of the page")
	public void get_url_of_the_page() 
	{
	    driver.getCurrentUrl();
	}

	@Then("Validate the URL of the page")
	public void validate_the_url_of_the_page() 
	{
		String actual=driver.getCurrentUrl();
		  String expected = prop.getProperty("WebUrl");
		  Assert.assertEquals(actual, expected);
	}

	@When("Logo is displayed or not")
	public void logo_is_displayed_or_not() 
	{
		System.out.println("Step1");
	    login.Logo();
	}

	@Then("Validate the Logo is displayed or not")
	public void validate_the_logo_is_displayed_or_not() 
	{
	   boolean actual = login.Logo();
	   
	   Assert.assertTrue(actual);
	}
	
	@When("Enter valid username and valid password")
	public void enter_valid_username_and_valid_password() 
	{
	    login.setInputusername(login.getUsername());
	    login.setInputpassword(login.getPassword());
	}

	@When("Click on login button")
	public void click_on_login_button() 
	{
	    login.ClickOnLoginButton();
	}

	@Then("Validate user redirected to home page")
	public void validate_user_redirected_to_home_page() 
	{
	   String actual =driver.getTitle();
	   String expected = prop.getProperty("Logintitle");
	   
	   Assert.assertEquals(actual, expected);
	}

	@When("Enter blanck credentials")
	public void enter_blanck_credentials() 
	{
		login.setInputusername("");
		login.setInputpassword("");
	   
	}

	@Then("Validate the required message is displayed")
	public void validate_the_required_message_is_displayed() 
	{
		String actual = login.RequiredErrorMessageforUsername();
	  	String expeted=prop.getProperty("RequiredErrorMessageforUsername");
	  	soft.assertEquals(actual,expeted);
	  	
	  	String actual1=login.RequiredErrorMessageforPassword();
	  	String expected1=prop.getProperty("RequiredErrorMessageforPassword");
	  	System.out.println(expected1);
	  	soft.assertEquals(actual1,expected1);
	  	
	  	soft.assertAll();
	}
	
	

	@When("Enter blank username and valid password")
	public void enter_blank_username_and_valid_password() 
	{
	    login.setInputusername("");
	    login.setInputpassword(login.getPassword());
	}

	@Then("Validate the required message is displayed below username field")
	public void validate_the_required_message_is_displayed_below_username_field() 
	{
	String actual=  login.RequiredErrorMessageforUsername(); 
	 String expected =prop.getProperty("RequiredErrorMessageforUsername");
	 
	 Assert.assertEquals(actual, expected);
	}

	@When("Enter valid username and blank password")
	public void enter_valid_username_and_blank_password() 
	{
	    login.setInputusername(login.getUsername());
	    login.setInputpassword("");
	}

	@Then("Validate the required message is displayed below password field")
	public void validate_the_required_message_is_displayed_below_password_field() 
	{
		String actual=  login.RequiredErrorMessageforPassword(); 
		 String expected =prop.getProperty("RequiredErrorMessageforPassword");
		 
		 Assert.assertEquals(actual, expected); 
	}

	@When("Enter invalid username and invalid password")
	public void enter_invalid_username_and_invalid_password() 
	{
	    login.setInputusername("adm");
	    login.setInputpassword("123");
	}

	@Then("Validate Invalid Credentials message will be displayed")
	public void validate_invalid_credentials_message_will_be_displayed() 
	{
	    String actual =login.InvalidCredentialsMessage();
	    String expected = prop.getProperty("LoginWithInvalidCredMessage");
	    
	    Assert.assertEquals(actual, expected);
	}

	@When("Enter Valid username and invalid password")
	public void enter_valid_username_and_invalid_password() 
	{
	    login.setInputusername(login.getUsername());
	    login.setInputpassword("1223");
	}

	@When("Enter invalid username and Valid password")
	public void enter_invalid_username_and_valid_password() 
	{
	    login.setInputusername("aadm");
	    login.setInputpassword(login.getPassword());
	}

	@When("Enter Special character into the username and  password")
	public void enter_special_character_into_the_username_and_password() 
	{
	    login.setInputusername("@@#$!%##@%%$");
	    login.setInputpassword("!@#$@$$@%^@^@@");
	}

	@When("Get the webapplication vesion text")
	public void get_the_webapplication_vesion_text() 
	{
	    String Text= login.GetWebApplicationVersionText();
	    System.out.println("versionText"+Text);
	}

	@Then("Validate and Check the vesiontext is correct or not")
	public void validate_and_check_the_vesiontext_is_correct_or_not() 
	{
		 String actual= login.GetWebApplicationVersionText();
		 String expected= prop.getProperty("WebApplicationVersionText");
		 
		 Assert.assertEquals(actual, expected);
	}

	@When("Get copy right text")
	public void get_copy_right_text() 
	{
	    String text= login.GetCopyRightText();
	    System.out.println("CopyRightText"+text);
	}

	@Then("Validate the copyright text correct or not")
	public void validate_the_copyright_text_correct_or_not() 
	{
	   String actual =login.GetCopyRightText();
	   String expected= prop.getProperty("CopyRightText");
	   
	   Assert.assertEquals(actual, expected);
	}

	@When("Click on Linkdn icon")
	public void click_on_linkdn_icon() 
	{
		 boolean check=login.ClickOnLinkdnLinkIcon();
		    System.out.println("LinkdnIconDisplayed"+check);
	    
	}

	@Then("Page will redirected to LinkdnProfile")
	public void page_will_redirected_to_linkdn_profile() 
	{
	    String actual= driver.getCurrentUrl();
	    String expected= prop.getProperty("LinkednURL");
	    
	    Assert.assertEquals(actual, expected);
	}

	

	@When("Click on facebook icon")
	public void click_on_facebook_icon() 
	{
		boolean check=login.ClickOnFacebookLinkIcon();
		   System.out.println("facebookIconDisplayed"+check);
	}

	@Then("Page will redirected to FacebookProfile")
	public void page_will_redirected_to_facebook_profile() 
	{
	    String actual=driver.getCurrentUrl();
	    String expected=prop.getProperty("FacebookURL");
	    
	    Assert.assertEquals(actual, expected);
	}

	

	@When("Click on twitter icon")
	public void click_on_twitter_icon() 
	{
		 boolean check=login.ClickOnTwitterLinkIcon();
		    System.out.println("twitterIconDisplayed"+check);
	}

	@Then("Page will redirected to TwitterProfile")
	public void page_will_redirected_to_twitter_profile() 
	{
	   String actual= driver.getCurrentUrl();
	   String expected= prop.getProperty("TwitterURL");
	   
	   Assert.assertEquals(actual, expected);
	}


	@When("Click on YouTube icon")
	public void click_on_you_tube_icon() 
	{
		 boolean check=login.ClickOnYoutubeLinkIcon();
		  System.out.println("YouTubeIconDisplayed"+check);
	}

	@Then("Page will redirected to YouTubeChannel")
	public void page_will_redirected_to_you_tube_channel() 
	{
		String actual= driver.getCurrentUrl();
		   String expected= prop.getProperty("YouTubeURL");
		   
		   Assert.assertEquals(actual, expected);
	    
	}	
 

 
}
