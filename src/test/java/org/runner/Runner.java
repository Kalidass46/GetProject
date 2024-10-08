package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources",
glue = "org.stepDefinition",
tags = "@HotelAdactin", plugin = {"html:target","junit:junitF//junitFile.xml","json:JsonF//jsonF.json"})

public class Runner {
	
	@AfterClass
	public static void aftrCls_tc() {
		JvmReport.generateJvmReport("C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\JsonF\\jsonF.json");
	}


}
