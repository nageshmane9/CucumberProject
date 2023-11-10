package Hooks;

import com.base.Base;

import io.cucumber.java.After;


public class HooksClass extends Base
{
	
	@After
	public void tearDown()
	{
		driver.quit();
		
	}

}
