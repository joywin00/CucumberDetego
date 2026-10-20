package org.DetePojo;

import org.helper.BaseClassProj;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetegoCodeNotRece extends BaseClassProj{

	public DetegoCodeNotRece() {
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
		
		@FindBy(xpath="//div[contains(text(),' Please re-enter carefully.')]")
		private WebElement msg;
		
		@FindBy(xpath="//span[contains(text(),'get your')]")
		private WebElement noCode;
		
		@FindBy(xpath="//button[text()='Still not receiving it?']")
		private WebElement notRece;
		
		@FindBy(xpath="//input[@placeholder='Jane Smith']")
		private WebElement name;
		
		@FindBy(xpath="//input[@placeholder='XX-XXXXXXX']")
		private WebElement tin;
		
		@FindBy(xpath="//input[@placeholder='(XXX) XXX-XXXX']")
		private WebElement phNo;
		
		@FindBy(xpath="//span[text()='Verification Code']")
		private WebElement topic;
		
		@FindBy(xpath="//textarea[@placeholder='Describe your registration issue…']")
		private WebElement decription;
	

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

		public WebElement getEmail() {
		//	passTheValue(email, str);
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
		
		public WebElement getMsg() {
			msg.getText();
			return msg;
		}
		
		public WebElement getnoCode() {
			noCode.click();
			return noCode;
		}
		
		public WebElement getNotRece() {
			notRece.click();
			return notRece;
		}
		
		
		public WebElement getName(String string) {
			passTheValue(name, string);
			return name;
		}
		
		public WebElement getTin(String string) {
			passTheValue(tin, string);
			return tin;
		}
		
		public WebElement getPhNo(String string) {
			passTheValue(phNo, string);
			return phNo;
		}
		
		public WebElement getTopic() {
			topic.click();
			return topic;
		}
		
		public WebElement getDesc(String string) {
			passTheValue(decription, string);
			return decription;
		}
		
	
}
