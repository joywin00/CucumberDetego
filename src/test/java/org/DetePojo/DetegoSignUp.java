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

public class DetegoSignUp extends BaseClassProj{
	
	public DetegoSignUp() {
		PageFactory.initElements(getDriver(), this);
	}
		
		@FindBy (xpath="//button[text()=' Accept ']")
		private WebElement accept;

		
		@FindBy(xpath="//span[text()='Provider Portal']")
		private WebElement prov;

		//signup
		
	   @FindBy(xpath=("//button[text()='Sign In']"))
		private WebElement signIn;
		
	   @FindBy(xpath=("//input[@name='username']"))
		private WebElement user;
	   
	   @FindBy(id=("usernamePrimaryButton"))
		private WebElement prime;

	   public WebElement getAccept() {
		   accept.click();
		   return accept;
	   }

	   public WebElement getProv() {
		   prov.click();
		   return prov;
	   }

	   public WebElement getSignIn() {
		   signIn.click();
		   return signIn;
	   }

	   public WebElement getUser(String val) {
		   passTheValue(user, val);
		   return user;
	   }

	   public WebElement getPrime() {
		  prime.click();
		   return prime;
	   }
		
		
			
			
		
}