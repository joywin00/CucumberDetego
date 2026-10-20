package org.step;

import java.io.IOException;

import org.DetePojo.DetegoMbrSrc;
import org.helper.BaseClassProj;import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClassProj{
	
	@Before
	public void bef() {
		openChromeBrowser();
		   maxWin();
		   getUrl("https://detegohealth.com/providers/");
		    impWait(15);
		    DetegoMbrSrc m= new DetegoMbrSrc();
			m.getAccept();
	}
	
	
	@After
	public void aft(Scenario s) throws IOException {

		if(s.isFailed()) {
		TakesScreenshot ts= (TakesScreenshot)getDriver();
		byte[] ss = ts.getScreenshotAs(OutputType.BYTES);
			s.attach(ss,"E:\\Cucumber\\ScreenShots\\", s.getName()+"\\.png");
		}

		
		quit();
	}
	
	
	
	

}
