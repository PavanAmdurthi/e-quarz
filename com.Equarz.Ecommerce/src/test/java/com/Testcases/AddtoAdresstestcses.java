package com.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Utils.AddressUtils;
import com.base.Testbase;
import com.pageobjects.ADDERS_Functionilty;
import com.pageobjects.logion_functionality;

import net.bytebuddy.implementation.bind.annotation.Super;



public class ADDERSTest extends Testbase { 
	ADDERS_Functionilty af;
	logion_functionality lg;
	
	
	public  ADDERSTest()
	{
		super();
	}
	
		
	
	@BeforeMethod
	public void login()
	{
		Setup();
		lg=new logion_functionality(driver);
		lg.validateLogin();
		
	}
	@BeforeMethod
	public void initialize() 
	{
		
//		Setup();
//		lg=new Login_Functionality(driver);
//		lg.validateLogin();
		af=new ADDERS_Functionilty ();		
				
	}
	@Test(priority=1,dataProvider = "setdata",dataProviderClass =AddressUtils.class,description = "address added successfully")
	public void addaddress(String name,String phone,String city,String zipcode) throws InterruptedException 
	{
		af.addaddress(name,phone,city,zipcode);
		
	}
	@Test(priority=2,description = "address edited successfully")
	public void editaddress()
	{
		af.editaddress();
	}
	@Test(priority=3,description = "address deleted successfully")
	public void deleteaddress() throws Throwable
	{
		af.deleteaddress();
	}
	

}