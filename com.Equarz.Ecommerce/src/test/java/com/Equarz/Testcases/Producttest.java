package com.Equarz.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.Pageobjects.Login_Functionality;
import com.Pageobjects.Productsearch;
import com.base.Testbase;

public class Producttest extends Testbase {
		
		Productsearch pt;
		Login_Functionality lg;
		//Signupfunctionality sf;
		//WebDriver driver;
		 
		public Producttest() 
		{
			super();
			
		}
		
		@BeforeMethod
		public void prdinitialze() throws Throwable 
		{
			Setup();
		//	sf=new Signupfunctionality(driver);
			lg= new Login_Functionality(driver);
			lg.validateLogin(props.getProperty("username"),props.getProperty("password"));
			 pt = new Productsearch(driver);
		 
		}
		@Test(priority = 3)
		public  void verifyproduct()  throws Throwable 
		{
			 pt.cateogoryproduct(); 
			 String url=driver.getCurrentUrl();
			 Assert.assertEquals("http://e-quarz.com/product/class-5-grade-5-mathematics-practice-workbook-with-answers-cbseicse-book-question-papers-mental-math-mixed-word-problems", url);
			 
		}
		@Test(priority = 2)
		public void bannerproduct()
		{
			pt.banerproduct();
			String url=driver.getCurrentUrl();
			Assert.assertEquals("http://e-quarz.com/product/dhingra-mens-slim-fit-tuxedo-3pcs-suit-coat-pant-and-waistcoat-InysDn", url);
		}
		@Test(priority = 1)

		public void seaproduct() throws Throwable
		{
			pt.productsearch();
		
		}
		@Test(priority = 4)
		public void dealofproduct() throws InterruptedException
		{
			pt.dealproduct();
			
		}
	}
	

