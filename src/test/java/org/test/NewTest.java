package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.helper.Helper;

import static org.helper.Helper.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class NewTest {

	private void tc1() {
		String prtUrl= prtUrl();
		System.out.println("prtUrl");
	}

	private String prtUrl() {
		return prtUrl();
		}

	@BeforeClass
	private void beCls() {

		browserLaunch("https://www.facebook.com/");
		maxmiz();
	}

	@AfterClass 
	private void aftCls() {
		browserClose();
	}

	@BeforeMethod
	private void beMethod() {
		getDateAndTime();
	}

	@AfterMethod
	private void afMethod() {
		getDateAndTime();
	}
	
	
	
	
}
