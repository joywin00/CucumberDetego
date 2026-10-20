package org.DetePojo;

import java.time.Duration;
import java.util.Set;

import org.helper.BaseClassProj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DetegoContactUs extends BaseClassProj{

	public DetegoContactUs() {
		PageFactory.initElements(getDriver(), this);
	}
		
		@FindBy (xpath="//button[text()=' Accept ']")
		private WebElement accept;
	
	    @FindBy(xpath="//span[text()='Contact Us']//ancestor::div[@data-id='0329f5f']//child::span[@class='elementor-button-text']")
	    private WebElement contUs;
	    
	    @FindBy (xpath="//input[@name='form_fields[name]']")
		private WebElement form;
	    
	    @FindBy (xpath="//input[@type='email']")
		private WebElement mail;
	    
	    @FindBy (xpath="//input[@id='form-field-field_42a2891']")
		private WebElement org;
	    
	    @FindBy (xpath="//input[@type='tel']")
		private WebElement telNo;
	    
	    @FindBy (xpath="//select[@name='form_fields[field_9bd09a9]']")
		private WebElement drpDown;
	    
//	    Select s = new Select(drp);
//	      s.selectByValue("Member");
	    
	    @FindBy (xpath="//textarea[@name='form_fields[message]']")
		private WebElement comment;
		
	    @FindBy (xpath="//span[text()='Send']")
		private WebElement send;

		public WebElement getAccept() {
			accept.click();
			return accept;
		}

		public WebElement getContUs() throws InterruptedException {
			Actions a = new Actions(getDriver());
			a.moveToElement(contUs).click().build().perform();
			Sleep(3000);
			return contUs;
			
		}

		public WebElement getForm(String name) {
			//a.moveToElement(form).perform();
			passTheValue(form, "joy");
			return form;
		}

		public WebElement getMail(String em) {
			passTheValue(mail, em);
			return mail;
		}

		public WebElement getOrg(String name) {
			passTheValue(org, name);
			return org;
		}

		public WebElement getTelNo(String no) {
			passTheValue(telNo, no);
			return telNo;
		}

		public WebElement getDrpDown() {
			
			return drpDown;
		}

		public WebElement getComment(String com) {
			passTheValue(comment, com);
			return comment;
		}

		public WebElement getSend() {
			//send.click();
			return send;
		}
		
		
			
	


}
