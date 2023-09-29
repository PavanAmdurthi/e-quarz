package com.Equarz.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.Wish_list;
import com.base.Testbase;

public class WishlistTest extends  Testbase { 
	Wish_list wl;
	Login_Functionality lg;
	
	
	public WishlistTest()
	{
		super();
	}
	@BeforeMethod
	public void initialize() throws InterruptedException
	{
		
		Setup();
		lg=new Login_Functionality(driver);
		lg.validateLogin( null, null);
		wl=new Wish_list (driver);		
				
	}
	@Test()
	public void categorywishlist () throws InterruptedException 
	{
		wl.catwishlist();
		
	}
	
	@Test()
	public void searchwishlist() 
	{
		wl.searchwishlist();
	}
	@Test()
	public void bannerhwishlist() 
	{
		wl.bannerwishlist();
	}
	@Test()
	public void homehwishlist() 
	{
		wl.homewishlist();
	}
	@Test()
	public void dealswishlist() 
	{
		wl.dealswishlist();
	}
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}

}