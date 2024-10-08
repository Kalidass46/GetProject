package org.pom;

import org.helper.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPojo extends Helper{
	
	public HotelPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	public WebElement Username;
	
	@FindBy(id="password")
	public WebElement Password;
	
	@FindBy(id="login")
	public WebElement Login;

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}	
	
}