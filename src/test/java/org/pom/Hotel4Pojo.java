package org.pom;

import org.helper.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel4Pojo extends Helper{
	
	public Hotel4Pojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value='My Itinerary']")
	WebElement myLit;
	
	public WebElement getMyLit() {
		return myLit;
	}
}