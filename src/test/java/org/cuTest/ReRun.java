package org.cuTest;

import org.step.JvmReport;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@E:\\Cucumber\\Report\\ReRun report\\rerun.txt", 
dryRun = false,
glue = "org.step", 
//tags = "@detego3",
plugin = {"pretty",
		"html:E:\\Cucumber\\Report\\html report\\detego.html",
		"junit:E:\\Cucumber\\Report\\json report\\detego.xml",	
		"json:E:\\Cucumber\\Report\\junit report\\detego.json",
		"rerun:E:\\Cucumber\\Report\\ReRun report\\rerun.txt"
		})

public class ReRun extends AbstractTestNGCucumberTests{
	
	

}
