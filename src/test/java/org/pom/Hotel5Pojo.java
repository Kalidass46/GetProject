package org.pom;

import org.helper.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel5Pojo extends Helper{

	public Hotel5Pojo() {
	 PageFactory.initElements(driver, this);
	 }
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	public WebElement searchOrderId;
	
	

}
