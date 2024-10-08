package org.stepDefinition;

import java.util.List;
import java.util.Map;

import org.helper.Helper;
import org.openqa.selenium.WebElement;
import org.pom.Task8Pojo;

import cucumber.api.java.en.*;

public class Task8Defin extends Helper{

	public static Task8Pojo t8;

	@Given("To launch chrome browser")
	public void to_launch_chrome_browser() {
		t8=new Task8Pojo();
		browserLaunch("https://www.amazon.in/online-shopping/s?k=online+shopping&page=2");
	}

	@When("To click the button of signin button")
	public void to_click_the_button_of_signin_button() {
		t8=new Task8Pojo();
		btnClick(t8.getSignIn());
	}

	@When("To enter the valid {string} in email or phone num field")
	public void to_enter_the_valid_in_email_or_phone_num_field(String email) {
		fillText(t8.getEmail(), email );
		System.out.println("EmailId (or) Phone number");
	}

	@When("To click thr continue button of button filed")
	public void to_click_thr_continue_button_of_button_filed() {
	btnClick(t8.getContinue());
	}

	@When("To enter the valid {string} in password filed")
	public void to_enter_the_valid_in_password_filed(String pass) {
		fillText(t8.getPassword(), pass);
		System.out.println("Password");
	}

	@When("To click the signIn button of the filed")
	public void to_click_the_signIn_button_of_the_filed() {
		t8=new Task8Pojo();
		btnClick(t8.getSignin());
	}

}
