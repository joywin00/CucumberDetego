package org.DetePojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.helper.BaseClassProj;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetegoMemberReg extends BaseClassProj{

	public DetegoMemberReg() {
		PageFactory.initElements(getDriver(), this);
	}
		
		@FindBy (xpath="//button[text()=' Accept ']")
		private WebElement accept;
		
		@FindBy (xpath="(//span[@class='sub-arrow'])[1]")
		private WebElement mbr;
		
  	
//     r.keyPress(KeyEvent.VK_DOWN);
//     r.keyRelease(KeyEvent.VK_DOWN);
//     r.keyPress(KeyEvent.VK_ENTER);
//     r.keyRelease(KeyEvent.VK_ENTER);    Thread.sleep(2000);
		
		@FindBy (name="first_name")
		private WebElement firstName;
		
		@FindBy (name="last_name")
		private WebElement lastName;
		
		@FindBy (name="detego_member_id")
		private WebElement MbrId;
		
		@FindBy (name="last4_ssn")
		private WebElement lastSsn;
		
		@FindBy (name="date_of_birth")
		private WebElement dob;
		
		@FindBy (name="phone")
		private WebElement phNo;
		
		@FindBy (name="email")
		private WebElement mail;
		
		@FindBy(xpath="//button[text()='Register']")
		private WebElement reg;

		public WebElement getAccept() {
			accept.click();
			return accept;
		}

		public WebElement getMbr() {
			mbr.click();
			return mbr;
		}

		public WebElement getFirstName() {
			firstName.sendKeys("joy");
			return firstName;
		}

		public WebElement getLastName() {
			passTheValue(lastName, "win");
			return lastName;
		}

		public WebElement getMbrId() {
			passTheValue(MbrId, "123546789");
			return MbrId;
		}

		public WebElement getLastSsn() {
			passTheValue(lastSsn, "1456");
			return lastSsn;
		}

		public WebElement getDob() {
			passTheValue(dob, "12122000");
			return dob;
		}

		public WebElement getPhNo() {
			passTheValue(phNo, "1478523695");
			return phNo;
		}

		public WebElement getMail() {
			passTheValue(mail, "joy@gamil.com");
			return mail;
		}
		
		public WebElement getReg() {
			reg.click();
			return reg;
		}
		
		
		
		
	

}
