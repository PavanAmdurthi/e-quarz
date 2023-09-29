package com.Pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class searchfunctionality  extends Testbase{
	
	@FindBy(xpath="//input[@class='form-control appended-form-control search-bar-input']")
	WebElement search;
	@FindBy(xpath="//ul[@class='list-group list-group-flush']")
	WebElement searchdd;
	
	public searchfunctionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void searchbar() 
	{
		search.sendKeys("pendrive");
		search.sendKeys(Keys.ENTER);
	}
}

