package com.Equarz.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.buynow;
import com.base.Testbase;

public class buynowtestcses extends Testbase{
	
	buynow bn;
	Login_Functionality lg;
	
	public buynowtestcses()
	{
		super();
	}

	@BeforeMethod
	public void intialize() throws Throwable {
		
		Setup();
		lg=new Login_Functionality(driver);
		lg.validateLogin(props.getProperty("username"),props.getProperty("password"));
	    bn = new buynow();
	     
	}
	@Test
	public void categorybuynow() 
	{
		bn.buynowcategory();
	}
	
	@Test
	public void cartbuynow() throws Throwable 
	{
		bn.buynowcart();
	}
}