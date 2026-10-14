package org.DetePojo;

import java.time.Duration;
import java.util.Set;

import org.helper.BaseClassProj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetegoCreateNew extends BaseClassProj {

	public DetegoCreateNew() {
		PageFactory.initElements(getDriver(), this);
	}
		
		@FindBy (xpath="//button[text()=' Accept ']")
		private WebElement accept;
		
		@FindBy(xpath="//span[text()='Provider Portal']")
		private WebElement prov;
		
		//create new
		@FindBy(xpath=("//a[text()='Create an account']"))
		private WebElement create;
		
		@FindBy(xpath=("//a[text()='Begin Registration']"))
		private WebElement reg;
		
		@FindBy(xpath=("//input[@id='reg-email']"))
		private WebElement email;
		
		@FindBy(xpath=("//button[text()='Continue']"))
		private WebElement cont;
		
		@FindBy(xpath="//input[@placeholder='Enter 8-digit code']")
		private WebElement code;
		
		@FindBy(xpath="//button[text()='Continue']")
		private WebElement conti;
		

		public WebElement getAccept() {
			accept.click();
			return accept;
		}

		public WebElement getProv() {
			prov.click();
			return prov;
		}

		public WebElement getCreate() {
			create.click();
			return create;
		}

		public WebElement getReg() {
			reg.click();
			return reg;
		}

		public WebElement getEmail(String val) {
			passTheValue(email, val);
			return email;
		}

		public WebElement getCont() {
			cont.click();
			return cont;
		}
		
		public WebElement getCode() {
			code.sendKeys("12345678");
			return code;
		}
			
		public WebElement getConti() {
			cont.click();
			return cont;
		}
		
		
	
		
	
}
