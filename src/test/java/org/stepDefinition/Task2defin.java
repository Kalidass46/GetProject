package org.stepDefinition;

import org.helper.Helper;
import org.pom.Task2Pojo;

import cucumber.api.java.en.*;

public class Task2defin extends Helper {

	public static Task2Pojo t2;
		
	@Given("To launch the chrome browser and Hit the url")
	public void to_launch_the_chrome_browser_and_Hit_the_url() {
		t2 =new Task2Pojo();
		browserLaunch("https://www.facebook.com/");
	}

	@When("To enter the Invalid username in email field")
	public void to_enter_the_Invalid_username_in_email_field() {
		t2 =new Task2Pojo();
		fillText(t2.getEmailId(), "task2@gmail.com");
	}

	@When("To enter Valid passwordin password field")
	public void to_enter_Valid_passwordin_password_field() {
		t2 =new Task2Pojo();
	}

	@When("To click the Login button")
	public void to_click_the_Login_button() {
		t2 =new Task2Pojo();
		btnClick(t2.getLogin());
	}

	@Then("To close Chrome Browser")
	public void to_close_Chrome_Browser() {
		browserClose();
	}
}