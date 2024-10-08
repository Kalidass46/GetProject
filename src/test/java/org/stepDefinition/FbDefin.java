package org.stepDefinition;

import java.io.IOException;

import org.helper.Helper;
import org.openqa.selenium.WebElement;
import org.pom.FaceBook1;

import cucumber.api.java.en.*;

public class FbDefin extends Helper{
	
	public static FaceBook1 f;
	@Given("To launch the chrome browser and hit the url")
	public void to_launch_the_chrome_browser_and_hit_the_url() {
		browserLaunch("https://www.facebook.com/");	    
		maxmiz();
	}

	@When("To enter the invalid username in email field")
	public void to_enter_the_invalid_username_in_email_field() throws IOException {
		String dataDrivenRead = dataDrivenRead("C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\Excel\\WorkBook.xlsx","emp" , 1, 2);
		f=new FaceBook1();
		fillText(f.getEmailId(), dataDrivenRead);
		System.out.println(dataDrivenRead);
		
		}

	@When("To enter valid passwordin password field")
	public void to_enter_valid_passwordin_password_field() throws IOException {
		String dD = dataDrivenRead("C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\Excel\\WorkBook.xlsx", "emp", 1, 1);
		f=new FaceBook1();
		fillText(f.getPswdField(), dD);
		System.out.println(dD);
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		f=new FaceBook1();
		btnClick(f.getLogin());
	}
	@Then("To close chrome browser")
	public void to_close_chrome_browser() {
		browserClose();
	}

}
