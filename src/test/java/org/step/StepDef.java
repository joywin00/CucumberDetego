package org.step;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.DetePojo.DetegoApp;
import org.DetePojo.DetegoCodeNotRece;
import org.DetePojo.DetegoContactUs;
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

//		openChromeBrowser();
//		   maxWin();
//		   getUrl("https://detegohealth.com/providers/");
//		    impWait(15);
		System.out.println("given");
		
		
		
	}
	@Given("user have to click the provider portal and click check elig button")
	public void user_have_to_click_the_provider_portal_and_click_check_elig_button() throws InterruptedException {

		DetegoMbrSrc m= new DetegoMbrSrc();
		//m.getAccept();
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
		m.getMbrId("12345678");
		m.getMbrDob("12/06/2000");
		m.getSubmit();

		
	}
	@Then("user have to close the browser")
	public void user_have_to_close_the_browser() {

		DetegoMbrSrc m= new DetegoMbrSrc();
		System.out.println("then");
		quit();
	}
	
//2
	
	@Given("user have to launch detego health portal using chrome browser")
	public void user_have_to_launch_detego_health_portal_using_chrome_browser() {

//		 openChromeBrowser();
//		   maxWin();
//		   getUrl("https://detegohealth.com/providers/");
		System.out.println("given");
		   
	}
	@Given("user have to click the members and click check elig button")
	public void user_have_to_click_the_members_and_click_check_elig_button() throws AWTException {

		DetegoMemberReg m= new DetegoMemberReg();
		
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

		Assert.assertNotEquals("https://providers.detegohealth.com/register", "https://detegohealth.com/providers/");
		quit();
System.out.println("then");
	}
	
//3
	
	@Given("user have to launch detego health prov portal using chrome browser")
	public void user_have_to_launch_detego_health_prov_portal_using_chrome_browser() {

//		 openChromeBrowser();
//		   maxWin();
//		   getUrl("https://detegohealth.com/providers/");
//		   impWait(15);
	System.out.println("given");
	}
	@When("user have to click the provider button and click create an account button")
	public void user_have_to_click_the_provider_button_and_click_create_an_account_button() {

		DetegoCreateNew c= new DetegoCreateNew();
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
		c.getEmail("joy@gmail.com");
		c.getCont();
		c.getCode();
		c.getConti();
	}
	
	@Then ("user have to quit the browser1")
	public void user_have_to_quit_the_browser1(){

		DetegoCreateNew c= new DetegoCreateNew();
			
		Assert.assertEquals(c.getReg(), "That code doesn't match. Please re-enter carefully.");
		quit();	
		System.out.println("then");
	}	

//4
	
	@Given("user have to launch detego health prov portal using chrome browser1")
	public void user_have_to_launch_detego_health_prov_portal_using_chrome_browser1() {

//		openChromeBrowser();
//		   maxWin();
//		   getUrl("https://detegohealth.com/providers/");
//		   impWait(15);
		System.out.println("given");
	}
	@When("user have to click the provider button and click create an account button1")
	public void user_have_to_click_the_provider_button_and_click_create_an_account_button1() {
	 
		DetegoCodeNotRece c= new DetegoCodeNotRece();	
		c.getProv();
	}
	@Then("click being registered button00")
	public void click_being_registered_button00() throws InterruptedException {
	 
		DetegoCodeNotRece c= new DetegoCodeNotRece();	
		
		Sleep(3000);
		nextWindow();
		c.getCreate();
		c.getReg();
		Sleep(2000);
	}
	
	@Then("user have to enter mailId and click continue")
	public void user_have_to_enter_mail_id_and_click_continue(io.cucumber.datatable.DataTable d) {
	 
  List<String> mp= d.asList();
  DetegoCodeNotRece c= new DetegoCodeNotRece();
  passTheValue(c.getEmail(),mp.get(1));
		c.getCont();
	}
	
	@Then("user have to click code menu and click not received it function")
	public void user_have_to_click_code_menu_and_click_not_received_it_function() {
	 
		DetegoCodeNotRece c= new DetegoCodeNotRece();
		c.getnoCode();
		c.getNotRece();
		
		
	}
	@Then("user have to fill registration help and click submit")
	public void user_have_to_fill_registration_help_and_click_submit(io.cucumber.datatable.DataTable d) {
	 
		List<String> li= d.asList();
		DetegoCodeNotRece c= new DetegoCodeNotRece();
		c.getName(li.get(0));
		c.getPhNo(li.get(2));
		c.getTin(li.get(1));
		c.getDesc(li.get(3));

	}

	@Then("user have to close the chrome")
	public void user_have_to_close_the_chrome() {

System.out.println("then");
		//quit();
	}

//5
	
	@Given("user have to shoot the DetegoHealth portal using chrome browser")
	public void user_have_to_shoot_the_detego_health_portal_using_chrome_browser() {
	   
		System.out.println("given passed");
	}
	
	@Given("user have to click ContactUs button")
	public void user_have_to_click_contact_us_button() throws InterruptedException {

		DetegoApp a= new DetegoApp();
		
		a.getContUs();
		Sleep(2000);
		a.getPrivacy();
		//Sleep(3000);
	}
	
	@When("user have to click and validate youtube icon")
	public void user_have_to_click_and_validate_youtube_icon() throws InterruptedException {

		DetegoApp a= new DetegoApp();
		a.getYt();	
		
	}
	
	@When("user have to click and validate instagram icon")
	public void user_have_to_click_and_validate_instagram_icon() throws Exception {
 
		DetegoApp a= new DetegoApp();
		a.getIg();
	}
	
	@When("user have to click and validate linkedin icon")
	public void user_have_to_click_and_validate_linkedin_icon() throws InterruptedException, AWTException {

		DetegoApp a= new DetegoApp();
		a.getLinkedIn();
//	 Assert.assertEquals("https://www.linkedin.com/company/detegohealth/","https://www.linkedin.com/company/detegohealth/");
//closeTab();
	}
	
	@When("user have to click and validate google icon")
	public void user_have_to_click_and_validate_google_icon() throws InterruptedException {

		DetegoApp a= new DetegoApp();
		a.getGoogle();
	}
		
	
	@When("user have to validate facebook icon")
	public void user_have_to_facebook_icon() throws InterruptedException {

		DetegoApp a= new DetegoApp();
		a.getFb();
		a.getfbEmail();
		Assert.assertEquals(a.getfbEmail(), "joy@gmail.com");
		a.getfbPwd();
		a.getfbLogIn();
	}
	
	@Then("user have to close the page")
	public void user_have_to_close_the_page() {

	 System.out.println("then passed");
	}
	
//6
	@Given("user have to shoot the DetegoHealth portal using chrome")
	public void user_have_to_shoot_the_detego_health_portal_using_chrome() {

		System.out.println("given passed");
	}
	@Given("user have to click ContactUs button0")
	public void user_have_to_click_contact_us_button0() throws InterruptedException {

		DetegoContactUs d= new DetegoContactUs();
		d.getContUs();
		impWait(10);
	}
	@When("user have to enter the details in box")
	public void user_have_to_enter_the_details_in_box(io.cucumber.datatable.DataTable d) {

		DetegoContactUs c= new DetegoContactUs();
		List<String> li= d.asList();
		c.getForm(li.get(0));
		c.getMail(li.get(1));
		c.getOrg(li.get(2));
		c.getTelNo(li.get(3));
		c.getComment(li.get(3));
		
}
	@Then("user have to close the page1")
	public void user_have_to_close_the_page1() {
		
System.out.println("then passed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
