package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example {
	
public static WebDriver driver;

	@Parameters({ "Browser" })
	@Test
	private void tc(String broName) {
		
		if (broName.startsWith("f")) {
			driver= new FirefoxDriver();
		}		
		
		else if (broName.contains("dg")) {
			driver= new EdgeDriver();
		}
		else {
			driver= new ChromeDriver();
		}
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	
}