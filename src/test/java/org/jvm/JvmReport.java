package org.jvm;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvmReport(String jsonpath) {
		
		//	1.Mention target folder location-File
		
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\Jvm");

		//	2.Add details to the report using configuration class
		
		Configuration c = new Configuration(f, "Adactin Hotel");
		c.addClassifications("platform name","android");
		c.addClassifications("platform version","windows 10");
		c.addClassifications("browser name","chrome");
		c.addClassifications("browser version","129");
		
		List<String> li = new LinkedList<String>();
		li.add(jsonpath);
		
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
		
		
		
	}
}
