package org.pom;

import org.helper.Helper;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Helper{

	@Before(order=2)
	public void beforeScenario1() {
		
	}
	@Before(order=30)
	public void bewforeScenario2() {
	prntUrl();
	}
	@Before(order=15)
	public void beforeScenari3() {
		maxmiz();	
	}
	@After(order=28)
	public void afterScenario3() {
		System.out.println("take screesnshot....");
	}
	@After(order=12)
	public void afterScenario2() {
		browserClose();
	}
	
}
