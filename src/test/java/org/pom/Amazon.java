package org.pom;

import org.helper.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon extends Helper{

	public Amazon() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="nav-link-accountList-nav-line-1")
	public WebElement SignIn;
	
	@FindBy(xpath="//input[@type='email']")
	public WebElement Email;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement Continue;

	public WebElement getSignIn() {
		return SignIn;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getContinue() {
		return Continue;
	}
	
	
}
