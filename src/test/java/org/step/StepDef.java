package org.step;

import org.DetePojo.DetegoMbrSrc;
import org.helper.BaseClassProj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends BaseClassProj{
	
	@Given("user have to launch the detego health portal using chrome browser")
	public void user_have_to_launch_the_detego_health_portal_using_chrome_browser() {

		openChromeBrowser();
		   maxWin();
		   getUrl("https://detegohealth.com/providers/");
		    impWait(15);
		
		
		
	}
	@Given("user have to click the provider portal and click check elig button")
	public void user_have_to_click_the_provider_portal_and_click_check_elig_button() throws InterruptedException {

		DetegoMbrSrc m= new DetegoMbrSrc();
		m.getAccept();
		m.getProv();
		nextWindow();
		Sleep(3000);
		m.getElig();
		switchToWindow(2);
		Sleep(3000);

	}
	@When("user have to pass the mbr id and dob and click submit button")
	public void user_have_to_pass_the_mbr_id_and_dob_and_click_submit_button() {
		
		DetegoMbrSrc m= new DetegoMbrSrc();
		m.getMbrId();
		m.getMbrDob();
		m.getSubmit();

		
	}
	@Then("user have to close the browser")
	public void user_have_to_close_the_browser() {

		DetegoMbrSrc m= new DetegoMbrSrc();
		
		if(m.getSubmit().isSelected()) {
		quit();
		}
		
		else {
			System.out.println("not submitted");
		}
	
	
	}
	
	
	
	
	

}
