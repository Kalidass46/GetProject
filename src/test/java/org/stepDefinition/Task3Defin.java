package org.stepDefinition;

import org.helper.Helper;
import org.pom.Task3Pojo;

import cucumber.api.java.en.*;

public class Task3Defin extends Helper {

	public static Task3Pojo t3;
	@Given("To launch Browser and url")
	public void to_launch_Browser_and_url() {
		t3=new Task3Pojo();
		browserLaunch("https://www.redbus.in/");
	}

	@When("To Enter from in the field")
	public void to_Enter_from_in_the_field() {
		t3=new Task3Pojo();
		fillText(t3.getFrom(), "Velachery");
	}

	@When("To enter to in the field")
	public void to_enter_to_in_the_field() {
		t3=new Task3Pojo();
		fillText(t3.getTo(), "Egmore");
	}

	@When("To Select the date")
	public void to_Select_the_date() {
		t3=new Task3Pojo();
		btnClick(t3.getDate());
	}	
	@When("To select oct")
	public void to_select_oct() {
		t3=new Task3Pojo();
		btnClick(t3.getSep());
	}

	@When("To click the Search Buses")
	public void to_click_the_Search_Buses() {
		t3=new Task3Pojo();
		btnClick(t3.getSearchBuses());
		
	}

	@Then("To Close The Browser")
	public void to_Close_The_Browser() {
//		browserClose();
	}
}
