package org.pom;

import org.helper.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel3Pojo extends Helper{
	
	public Hotel3Pojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	public WebElement firstName;
	
	@FindBy(id="last_name")
	public WebElement lastName;
	
	@FindBy(id="address")
	public WebElement address;
	
	@FindBy(id="cc_num")
	public WebElement creditCard;

	@FindBy(xpath="//option[text()='- Select Credit Card Type -']")
	public WebElement creditCardType;
	
	@FindBy(xpath="//option[text()='- Select Year -']")
	public WebElement month;
	
	@FindBy(xpath="//option[text()='- Select Year -']")
	public WebElement year;
	
	@FindBy(id="cc_cvv")
	public WebElement ccvNo;
	
	@FindBy(id="book_now")
	public WebElement bookNo;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCcvNo() {
		return ccvNo;
	}

	public WebElement getBookNo() {
		return bookNo;
	}
	
	
	
}
