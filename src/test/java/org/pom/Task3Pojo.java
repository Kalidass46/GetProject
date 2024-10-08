package org.pom;

import org.helper.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task3Pojo extends Helper{

	public Task3Pojo() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="src")
	public WebElement from;
	
	@FindBy(id="dest")
	public WebElement to;
	
	@FindBy(id="onwardCal")
	public WebElement date;

	@FindBy(xpath="//text[text()='30 Sep']")
	public WebElement sep;

	
	@FindBy(xpath="//button[text()='SEARCH BUSES']")
	public WebElement searchBuses;
	

	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getSearchBuses() {
		return searchBuses;
	}

	public WebElement getSep() {
		return sep;
	}
	
	
}
