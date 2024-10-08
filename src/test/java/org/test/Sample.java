package org.test;

import org.helper.Helper;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.WebElement;
import org.pom.FaceBook1;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample extends Helper{
	public static FaceBook1 fb;
	public static SoftAssert a;
	
	@Test
	private void tc2() {
		prntTitle();
	}
	
	@Test
	private void tc3() {
		fb=new FaceBook1();
		a =new SoftAssert();
		WebElement emailId = fb.getEmailId();
		fillText(emailId,"hari@gmail.com");
		a.assertEquals(emailId.getAttribute("value"), "hari@gmail.com");
		System.out.println("EmailId is same and passed the data");
	
			
		WebElement pswdField = fb.getPswdField();
		fillText(pswdField, "Hari@123");
		a.assertEquals(pswdField.getAttribute("value"), "Hari@123");
		System.out.println("Password is same and passed the data");
		a.assertAll();

		btnClick(fb.getLogin());
	}
	
	@BeforeClass
	private void tc1() {
		browserLaunch("https://www.facebook.com/");
		System.out.println("Successfully Launched URL");
		maxmiz();
	}
	
	@Test
	private void tc() {
//		browserClose();
//		System.out.println("Quited Successfully");
	}
	
}		