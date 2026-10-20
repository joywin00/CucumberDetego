package org.cuTest;

import org.DetePojo.DetegoApp;
import org.step.JvmReport;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "E:\\Cucumber\\src\\test\\resources\\featurefile", 
dryRun = false,
glue = "org.step", 
plugin = {"pretty",
"html:E:\\Cucumber\\Report\\html report\\detego.html",
"junit:E:\\Cucumber\\Report\\json report\\detego.xml",	
"json:E:\\Cucumber\\Report\\junit report\\detego.json",
"rerun:E:\\Cucumber\\Report\\ReRun report\\rerun.txt"
})


public class Runner extends AbstractTestNGCucumberTests{
	
	
	
//	@After
//	private void aft() {
//
//     JvmReport.generateJvmReport("E:\\Cucumber\\Report\\json report\\detego.json");
//	}
//	
	
	@DataProvider(parallel=true)
	@Override
	public Object[][] scenarios() {

		return super.scenarios();
	}
	
	
	
	
	
  }
