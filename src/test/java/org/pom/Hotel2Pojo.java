package org.pom;

import org.helper.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel2Pojo extends Helper {
	
	public Hotel2Pojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='radio']")
	public WebElement radio;
	
	@FindBy(id="continue")
	public WebElement continu;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getContinu() {
		return continu;
	}
	
	
}
