package org.stepDefinition;

import org.helper.Helper;
import org.pom.Task7Pojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.*;
import static org.helper.Helper.*;

public class Task7Defin {
	
	public static Task7Pojo t7;
	@Given("To launch the firefix browser and hit the url")
	public void to_launch_the_firefix_browser_and_hit_the_url() {
		t7=new Task7Pojo();
		browserLaunch("https://www.facebook.com/");
		System.out.println("Successfully launch chrome");
	}

	@When("To enter the Valid Email in emaild field")
	public void to_enter_the_Valid_Email_in_emaild_field() {
		t7=new Task7Pojo();
		fillText(t7.getEmailId(), "lasjalsidsdh@gmail.com");
		System.out.println("Successfully passed email data");
	}

	@When("To enter the Invalid password in password field")
	public void to_enter_the_Invalid_password_in_password_field() {
	    t7=new Task7Pojo();
	    fillText(t7.getPswdField(),"kalidass@123");
	    System.out.println("Successfully passed password data");
		
	}

	@When("To click the login button in ythe Login Button")
	public void to_click_the_login_button_in_ythe_Login_Button() {
		t7=new Task7Pojo();
		btnClick(t7.getLogin());
	}

//	@Then("Close the browser")
//	public void close_the_browser() {
//		browserClose();
	@When("To click the login button in the Login Button")
	public void to_click_the_login_button_in_the_Login_Button() {
	}

	@Given("To launch the firefox browser and hit the url")
	public void to_launch_the_firefox_browser_and_hit_the_url() {
	}

	@When("To enter the Valid eMail in emaild field")
	public void to_enter_the_Valid_eMail_in_emaild_field() {
	}

	@When("To enter the invalid PassWord in password field")
	public void to_enter_the_invalid_PassWord_in_password_field() {
	}

	@When("To click the login button In the Login Button")
	public void to_click_the_login_button_In_the_Login_Button() {
	}


}
