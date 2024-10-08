package org.stepDefinition;

import java.awt.AWTException;
import java.util.List;

import org.helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pom.Hotel1Pojo;
import org.pom.Hotel2Pojo;
import org.pom.Hotel3Pojo;
import org.pom.Hotel4Pojo;
import org.pom.Hotel5Pojo;
import org.pom.HotelPojo;

import cucumber.api.java.en.*;

public class HotelDefin extends Helper{
	
	public HotelPojo  h;
	public Hotel1Pojo h1;
	public Hotel2Pojo h2;
	public Hotel3Pojo h3;
	public Hotel4Pojo h4;
	public Hotel5Pojo h5;
	
	@Given("To launch Chorome Browser & hit the url")
	public void to_launch_Chorome_Browser_hit_the_url() {
		browserLaunch("https://adactinhotelapp.com/");
		maxmiz();
	}

	@When("To Enter the username in username field")
	public void to_Enter_the_username_in_username_field() {
		h= new HotelPojo();
		fillText(h.getUsername(), "KDKalidass"); 
	}

	@When("To enter the Password in pswd field")
	public void to_enter_the_Password_in_pswd_field() {
		h= new HotelPojo();
		fillText(h.getPassword(), "Kalidass@46");
	}

	@When("To Click The Login button in this page")
	public void to_Click_The_Login_button_in_this_page() {
		h= new HotelPojo();
		btnClick(h.getLogin());
	}
	
	@When("To Select the location")
	public void to_Select_the_location() throws AWTException {
		h1=new Hotel1Pojo();
		btnClick(h1.getLocation());		
		WebElement e1 = driver.findElement(By.id("location"));
		Select s1=new Select(e1);
		List<WebElement> options1= s1.getOptions();
		s1.selectByValue("Brisbane");
	}

	@When("To select the hotels")
	public void to_select_the_hotels() {
		h1=new Hotel1Pojo();
		btnClick(h1.getHotels());
		WebElement e2 = driver.findElement(By.id("hotels"));
		Select s2=new Select(e2);
		List<WebElement> options2 = s2.getOptions();
		s2.selectByValue("Hotel Sunshine");
	}

	@When("To select the room type")
	public void to_select_the_room_type() {
		h1=new Hotel1Pojo();
		btnClick(h1.getRoomType());
		WebElement e3 = driver.findElement(By.name("room_type"));
		Select s3=new Select(e3);
		List<WebElement> options3 = s3.getOptions();
		s3.selectByValue("Deluxe");
	}

	
	@When("To select the number of rooms")
	public void to_select_the_number_of_rooms() {
		h1=new Hotel1Pojo();
		btnClick(h1.getNoRooms());
		btnClick(h1.getRooms());
			
	}

	@When("To select checkin Date")
	public void to_select_checkin_Date() {
		h1=new Hotel1Pojo();
		
	}

	@When("To select the checkout date")
	public void to_select_the_checkout_date() {
	
	}

	@When("To select the adult per room")
	public void to_select_the_adult_per_room() throws AWTException {
		h1=new Hotel1Pojo();
		btnClick(h1.getAdult());
		btnClick(h1.getAd());	
		
	}

	@When("To click the Search button")
	public void to_click_the_Search_button() throws AWTException {
		h1=new Hotel1Pojo();
		btnClick(h1.getSearch());
		
	}

	@When("To select the radio button for select")
	public void to_select_the_radio_button_for_select() {
		h2=new Hotel2Pojo();
		btnClick(h2.getRadio());
	}

	@When("To click the Continue button")
	public void to_click_the_Continue_button() {
		h2=new Hotel2Pojo();
		btnClick(h2.getContinu());
	}

	@When("To enter the first name")
	public void to_enter_the_first_name() {
		h3=new Hotel3Pojo();
		fillText(h3.getFirstName(), "kalidass");
		
	}

	@When("To enter the last name")
	public void to_enter_the_last_name() {
		h3=new Hotel3Pojo();
		fillText(h3.getLastName(), "K");
		
	}

	@When("To enter the biling address")
	public void to_enter_the_iling_address() {
		h3=new Hotel3Pojo();
		fillText(h3.getAddress(), "velachery, chennai");
		
	}

	@When("To enter credit card number")
	public void to_enter_credit_card_number() {
		h3=new Hotel3Pojo();
		fillText(h3.getCreditCard(), "0987654321123456");
		
	}

	@When("To select Credit card type")
	public void to_select_Credit_card_type() {
		h3=new Hotel3Pojo();
		btnClick(h3.getCreditCardType());
		WebElement e8 = driver.findElement(By.id("cc_type"));
		Select s8=new Select(e8);
		List<WebElement> options8 = s8.getOptions();
		s8.selectByIndex(3);		
		
	}

	@When("To select expiry date month and year")
	public void to_select_expiry_date_month_and_year() {
		h3=new Hotel3Pojo();
//		btnClick(h3.getMonth());
		WebElement e9 = driver.findElement(By.id("cc_exp_month"));
		Select s9=new Select(e9);
		List<WebElement> options9 = s9.getOptions();
		s9.selectByIndex(2);
		
		WebElement e10 = driver.findElement(By.id("cc_exp_year"));
		Select s10=new Select(e10);
		List<WebElement> options10 = s10.getOptions();
		s10.selectByIndex(9);
		
	}

	@When("To enter ccv number")
	public void to_enter_ccv_number() {
		h3=new Hotel3Pojo();
		fillText(h3.getCcvNo(), "436");
	}

	@When("To click the book now button")
	public void to_click_the_book_now_button() {
		h3=new Hotel3Pojo();
		btnClick(h3.getBookNo());
	}

	@When("To click the my iteranary button")
	public void to_click_the_my_iteranary_button() {
		h4=new Hotel4Pojo();
		btnClick(h4.getMyLit());
	}

	@When("To select the one cancelled oreder")
	public void to_select_the_one_cancelled_oreder() {
	
	}

	@When("To click the cancel")
	public void to_click_the_cancel() {

	}

	@When("To click Logout button")
	public void to_click_Logout_button() {
	
	}

	@Then("To close The Browser")
	public void to_close_The_Browser() {
		browserClose();
	}
}	