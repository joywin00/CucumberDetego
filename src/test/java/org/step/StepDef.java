package org.step;

import java.awt.AWTException;

import org.DetePojo.DetegoCodeNotRece;
import org.DetePojo.DetegoCreateNew;
import org.DetePojo.DetegoMbrSrc;
import org.DetePojo.DetegoMemberReg;
import org.helper.BaseClassProj;
import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends BaseClassProj{
//1
	
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
		
		quit();
	}
	
//2
	
	@Given("user have to launch detego health portal using chrome browser")
	public void user_have_to_launch_detego_health_portal_using_chrome_browser() {

		 openChromeBrowser();
		   maxWin();
		   getUrl("https://detegohealth.com/providers/");
		   
	}
	@Given("user have to click the members and click check elig button")
	public void user_have_to_click_the_members_and_click_check_elig_button() throws AWTException {

		DetegoMemberReg m= new DetegoMemberReg();
		 m.getAccept();
		    impWait(15);
		    m.getMbr();
		downArrow();
		enter();
		
	}
	@When("user have to pass the mbr details and click register button")
	public void user_have_to_pass_the_mbr_details_and_click_register_button() throws InterruptedException {

		Sleep(3000);
		DetegoMemberReg m= new DetegoMemberReg();
		m.getFirstName();
		m.getLastName();
		m.getMbrId();
		m.getLastSsn();
		m.getDob();
		m.getPhNo();
		m.getMail();
	}
	@Then("user have to quit the browser")
	public void user_have_to_quit_the_browser() {

		//quit();
}
	
//3
	
	@Given("user have to launch detego health prov portal using chrome browser")
	public void user_have_to_launch_detego_health_prov_portal_using_chrome_browser() {

		 openChromeBrowser();
		   maxWin();
		   getUrl("https://detegohealth.com/providers/");
		   impWait(15);
	}
	@When("user have to click the provider button and click create an account button")
	public void user_have_to_click_the_provider_button_and_click_create_an_account_button() {

		DetegoCreateNew c= new DetegoCreateNew();
		c.getAccept();
		//impWait(15);
		c.getProv();
		
		
	}
	@Then("click being registered button")
	public void click_being_registered_button() throws InterruptedException {

		DetegoCreateNew c= new DetegoCreateNew();	
		Sleep(3000);
		nextWindow();
		c.getCreate();
		c.getReg();
	}
	@Then("user have to enter mailId and code function and click next button")
	public void user_have_to_enter_mail_id_and_code_function_and_click_next_button() {

		DetegoCreateNew c= new DetegoCreateNew();
		c.getEmail("joy@hotmail.com");
		c.getCont();
		c.getCode();
		c.getConti();
	}
	
	@Then ("user have to quit the browser1")
	public void user_have_to_quit_the_browser1(){

		DetegoCreateNew c= new DetegoCreateNew();
			
		Assert.assertEquals(c.getMsg(), "That code doesn't match. Please re-enter carefully.");
		quit();	
	}	

//4
	
	@Given("user have to launch detego health prov portal using chrome browser1")
	public void user_have_to_launch_detego_health_prov_portal_using_chrome_browser1() {

		openChromeBrowser();
		   maxWin();
		   getUrl("https://detegohealth.com/providers/");
		   impWait(15);
	}
	@When("user have to click the provider button and click create an account button1")
	public void user_have_to_click_the_provider_button_and_click_create_an_account_button1() {

		DetegoCodeNotRece c= new DetegoCodeNotRece();
		c.getAccept();
		//impWait(15);
		c.getProv();
	}
	@Then("click being registered button00")
	public void click_being_registered_button00() throws InterruptedException {

		DetegoCodeNotRece c= new DetegoCodeNotRece();	
		
		Sleep(3000);
		nextWindow();
		c.getCreate();
		c.getReg();
	}
	@Then("user have to enter mailId and click continue")
	public void user_have_to_enter_mail_id_and_click_continue() {

		DetegoCodeNotRece c= new DetegoCodeNotRece();
		c.getEmail("joy@hotmail.com");
		c.getCont();
	}
	@Then("user have to click code menu and click not received it function")
	public void user_have_to_click_code_menu_and_click_not_received_it_function() {

		DetegoCodeNotRece c= new DetegoCodeNotRece();
		c.getnoCode();
		c.getNotRece();
		
		
	}
	@Then("user have to fill registration help and click submit")
	public void user_have_to_fill_registration_help_and_click_submit() {
      
		DetegoCodeNotRece c= new DetegoCodeNotRece();
		c.getName();
		c.getTin();
		c.getPhNo();
		c.getTopic();
		c.getDesc();

	}
	@Then("user have to close the chrome")
	public void user_have_to_close_the_chrome() {

		//quit();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
