package org.stepDefinition;

import org.helper.Helper;

import cucumber.api.java.en.*;
public class Task44Defin extends Helper{

	public Task44Defin t44;
	@Given("To Launch chrome browser and hit url")
	public void to_Launch_chrome_browser_and_hit_url() {
		t44=new Task44Defin();
		browserLaunch("https://www.amazon.in/");
	}

	@When("To click SignIn button")
	public void to_click_SignIn_button() {
		t44=new Task44Defin();
	
	}

	@When("To enter valid phonenum")
	public void to_enter_valid_phonenum() {
		t44=new Task44Defin();
	}

	@When("To click thre Continue button")
	public void to_click_thre_Continue_button() {
		t44=new Task44Defin();
	}

	@When("To enter Invalid pswd")
	public void to_enter_Invalid_pswd() {
		t44=new Task44Defin();
	}

	@When("To Click the sign button")
	public void to_Click_the_sign_button() {
		t44=new Task44Defin();
	}
}