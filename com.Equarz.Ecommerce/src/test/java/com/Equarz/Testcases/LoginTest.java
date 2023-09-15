package com.Equarz.Testcases;


//import org.apache.commons.codec.language.bm.Lang;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
//import com.Pageobjects.Login_Functionality.login_functionality;
import com.base.Testbase;
public class LoginTest extends Testbase {

	Login_Functionality lg;
	public LoginTest()
	{
		super();
	}
	@BeforeMethod
	public void initialize()
	{
		Setup();
		lg =new Login_Functionality(driver);
		
	}

	//@Test
	//public void verifylogin() throws InterruptedException
	//{
		//lg.validateLogin();
//	}
	@Test
	public void verifyurl() throws InterruptedException
	{
		lg.validateLogin();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/", url);
	}
	@AfterMethod
	public void teardown()
	{
		//driver.close();

	}
}


