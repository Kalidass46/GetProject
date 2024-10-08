package org.test;

import java.util.List;

import org.helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pom.Hotel1Pojo;
import org.pom.Hotel2Pojo;
import org.pom.Hotel3Pojo;
import org.pom.Hotel4Pojo;
import org.pom.HotelPojo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgHotelProject extends Helper{
	
	public static HotelPojo h;
	public static Hotel1Pojo h1;
	public static Hotel2Pojo h2;
	public static Hotel3Pojo h3;
	public static Hotel4Pojo h4;	
	
	@BeforeClass
	private void browser() {
		browserLaunch("https://adactinhotelapp.com/");
		maxmiz();
	}
	
	@Test
	private void loginPage() {
		h=new HotelPojo();
		WebElement username = h.getUsername();
		fillText(username, "KDKalidass");
		
		WebElement password = h.getPassword();
		fillText(password, "Kalidass@46");
		
		WebElement login = h.getLogin();
		btnClick(login);
	}
	
	@Test
	private void searchHotel() {
		h1=new Hotel1Pojo();
		btnClick(h1.getLocation());
		WebElement e1 = driver.findElement(By.id("location"));
		Select s1=new Select(e1);
		List<WebElement> options = s1.getOptions();
		s1.selectByIndex(4);
		
		btnClick(h1.getHotels());
		WebElement e2 = driver.findElement(By.id("hotels"));
		 Select s2=new Select(e2);
		 List<WebElement> options2 = s2.getOptions();
		 s2.selectByIndex(2);
		 
		 btnClick(h1.getRoomType());
		 WebElement e3 = driver.findElement(By.name("room_type"));
		 Select s3=new Select(e3);
		 List<WebElement> options3 = s3.getOptions();
		 s3.selectByIndex(2);
		 
		 btnClick(h1.getNoRooms());
		 btnClick(h1.getRooms());
		 
		 btnClick(h1.getSearch());	
	}
	
	@Test
	private void selectHotel() {
		h2=new Hotel2Pojo();
		btnClick(h2.getRadio());
	
		btnClick(h2.getContinu());
	}
	
	@Test
	private void bookHotel() {
		h3=new Hotel3Pojo();
		fillText(h3.getFirstName(), "Kali");
		fillText(h3.getLastName(), "dass");
		fillText(h3.getAddress(), "Guindy,Chennaiiii");
		fillText(h3.getCreditCard(), "5678901234565432");
		
		btnClick(h3.getCreditCardType());
		WebElement e8 = driver.findElement(By.id("cc_type"));
		Select s8=new Select(e8);
		List<WebElement> options8 = s8.getOptions();
		s8.selectByIndex(3);		
		
		h3=new Hotel3Pojo();
		btnClick(h3.getMonth());
		WebElement e9 = driver.findElement(By.id("cc_exp_month"));
		Select s9=new Select(e9);
		List<WebElement> options9 = s9.getOptions();
		s9.selectByIndex(2);
		
		WebElement e10 = driver.findElement(By.id("cc_exp_year"));
		Select s10=new Select(e10);
		List<WebElement> options10 = s10.getOptions();
		s10.selectByIndex(9);
		
		fillText(h3.getCcvNo(),"4554");
		
		btnClick(h3.getBookNo());
				
	}
	
	@Test
	private void myIteratary() {
		h4=new Hotel4Pojo();
		btnClick(h4.getMyLit());
	}
	
	
	
}
