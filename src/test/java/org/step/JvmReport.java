package org.step;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateJvmReport(String html) {

		File f= new File("E:\\Cucumber\\Report\\jvm report");
		
		Configuration c= new Configuration(f, "Detego Application");
		c.addClassifications("Name","Joywin");
		c.addClassifications("Emp id", "123");
		
		List<String> li= new ArrayList<>();
	li.add(html);
		
		ReportBuilder r= new ReportBuilder(li, c);
				r.generateReports();
		

	}
	public static void main(String[] args) {
		
		JvmReport.generateJvmReport("E:\\Cucumber\\Report\\html report\\detego.html");
	}
	

	

}
