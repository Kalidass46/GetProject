package org.stepDefinition;

import org.helper.Helper;
import org.pom.TaskPojo1;

import cucumber.api.java.en.*;

public class Task1Defin extends Helper{

	public static TaskPojo1 tp;
	@Given("To launch The chrome browser and hit the url")
	public void to_launch_The_chrome_browser_and_hit_the_url() {
		browserLaunch("https://www.amazon.in/");
	}

	@When("To click SignIn in Amazon application")
	public void to_click_SignIn_in_Amazon_application() {
		tp=new TaskPojo1();
		btnClick(tp.getSignIn());
	}

	@When("To enter Invalid emailid in email field")
	public void to_enter_Invalid_emailid_in_email_field() {
		tp=new TaskPojo1();
		fillText(tp.getEmail(), "7094706010");
	}

	@When("To Click Continue button")
	public void to_Click_Continue_button() {
		tp=new TaskPojo1();
		btnClick(tp.getContinue());
	}

	@When("To Enter The Invalid Password")
	public void to_Enter_The_Invalid_Password() {
		tp=new TaskPojo1();
		fillText(tp.getPassword(), "kalidass");
	}

	@When("To click The signin button")
	public void to_click_The_signin_button() {
		tp=new TaskPojo1();
		btnClick(tp.getSignin());
	}

	@Then("To Close Chrome browser")
	public void to_Close_Chrome_browser() {
		browserClose();
	}
	
}