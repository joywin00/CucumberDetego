package org.cuTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "E:\\Cucumber\\src\\test\\resources\\featurefile\\detegoMbrSrc.feature", glue = "org.step")


public class Runner  extends AbstractTestNGCucumberTests{
	
	

}
