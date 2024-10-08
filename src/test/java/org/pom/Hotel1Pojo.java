package org.pom;

import org.helper.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel1Pojo extends	Helper{
		
		public Hotel1Pojo() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="location")
		public WebElement location;
		
		@FindBy(id="hotels")
		public WebElement hotels;
		
		@FindBy(name="room_type")
		public WebElement roomType;
	
		@FindBy(id="room_nos")
		public WebElement noRooms;
		
		@FindBy(xpath="(//option[text()='1 - One'])[1]")
		public WebElement rooms;
		
		@FindBy(id="adult_room")
		public WebElement adult;     
		
		@FindBy(xpath="(//option[text()='2 - Two'])[2]")
		public WebElement ad;
		
		@FindBy(xpath="//input[@value='Search']")
		public WebElement search;

		public WebElement getLocation() {
			return location;
		}

		public WebElement getHotels() {
			return hotels;
		}

		public WebElement getRoomType() {
			return roomType;
		}

		public WebElement getNoRooms() {
			return noRooms;
		}

		public WebElement getRooms() {
			return rooms;
		}

		public WebElement getAdult() {
			return adult;
		}

		public WebElement getAd() {
			return ad;
		}

		public WebElement getSearch() {
			return search;
		}


}