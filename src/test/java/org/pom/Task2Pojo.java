package org.pom;

import org.helper.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task2Pojo extends Helper {
	
	public Task2Pojo() {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(id="email")
	public WebElement emailId;
	
	@FindBy(id="pass")
	public WebElement pswdField;
	
	@FindBy(xpath="//button[@name='login']")
	public WebElement login;
	
	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPswdField() {
		return pswdField;
	}

	public WebElement getLogin() {
		return login;
	
	}

}