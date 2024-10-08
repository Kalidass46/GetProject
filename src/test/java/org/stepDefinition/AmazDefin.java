package org.stepDefinition;

import org.helper.Helper;
import org.pom.Amazon;

import cucumber.api.java.en.*;

public class AmazDefin extends Helper{

		public static Amazon a;
		@Given("To Launch the chrome browser and hit the url")
		public void to_Launch_the_chrome_browser_and_hit_the_url() {
			browserLaunch("https://www.amazon.in/");
		}

		@When("To click signin in Amazon application")
		public void to_click_signin_in_Amazon_application() {
			a=new Amazon();
			btnClick(a.getSignIn());
		}

		@When("To enter valid emailid in email field")
		public void to_enter_valid_emailid_in_email_field() {
			a=new Amazon();
			fillText(a.getEmail(), "kjhgfds@gmail.com");
		}

		@When("To click continue button")
		public void to_click_continue_button() {
			a=new Amazon();
			btnClick(a.getContinue());
		}

		@Then("To close Chrome browser")
		public void to_close_Chrome_browser() {
			browserClose();
		}
	
}	