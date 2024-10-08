package org.stepDefinition;

import org.helper.Helper;
import org.pom.Task4Pojo;

import cucumber.api.java.en.*;

public class Task4Defin extends Helper {
	
	public Task4Pojo t4;
	@Given("To Launch The chrome browser and hit the url")
	public void to_Launch_The_chrome_browser_and_hit_the_url() {
		t4=new Task4Pojo();
		browserLaunch("https://www.amazon.in/");
	
	}

	@When("To Click signin in Amazon application")
	public void to_Click_signin_in_Amazon_application() {
		t4=new Task4Pojo();
		btnClick(t4.getSignIn());
	}

	@When("To Enter invalid emailid in email field")
	public void to_Enter_invalid_emailid_in_email_field() {
		t4=new Task4Pojo();
		fillText(t4.getEmail(), "7094706010");
	}

	@When("To Click continue button")
	public void to_Click_continue_button() {
		t4=new Task4Pojo();
		btnClick(t4.getContinue());
	}

	@When("To enter valid pswd")
	public void to_enter_valid_pswd() {
		t4=new Task4Pojo();
		fillText(t4.getPswd(), "kijnhygvc");
	}

	@When("To click signIn in the button")
	public void to_click_signIn_in_the_button() {
		t4=new Task4Pojo();
		btnClick(t4.getSignin());
	}
	
	@Then("To cLose the browser")
	public void to_cLose_the_browser() {
		browserClose();
	}

	
}
