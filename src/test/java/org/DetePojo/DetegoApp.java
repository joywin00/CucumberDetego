package org.DetePojo;

import java.awt.AWTException;

import org.helper.BaseClassProj;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DetegoApp extends BaseClassProj{
	
	public DetegoApp() {

 PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy (xpath="//button[text()=' Accept ']")
	private WebElement accept;

    @FindBy(xpath="//span[text()='Contact Us']//ancestor::div[@data-id='0329f5f']//child::span[@class='elementor-button-text']")
    private WebElement contUs;
    
    @FindBy(xpath="//span[text()='Privacy Policy']")
    private WebElement privacy;
    
    @FindBy(xpath="//i[@class='fab fa-facebook']")
	private WebElement fb;
	
    @FindBy(xpath ="//i[@class='fab fa-instagram']")
	private WebElement ig;
  
    @FindBy(xpath ="//div[@class='x6s0dn4 x78zum5 xdt5ytf xl56j7k']")
   	private WebElement igCancel;
    
    @FindBy(xpath ="//i[@class='fab fa-linkedin-in']")
	private WebElement linkedIn;
    
    @FindBy(xpath ="//i[@class='fab fa-youtube']")
	private WebElement yt;
    
    @FindBy(xpath ="//i[@class='fab fa-google-plus-square']")
	private WebElement google;
    
    private WebElement win;
    
    @FindBy(xpath ="//input[@name='email']//ancestor::label[@class='x78zum5 xh8yej3']")
	private WebElement fbEmail;
    
    @FindBy(xpath ="//input[@type='password']//ancestor::label[@class='x78zum5 xh8yej3']")
	private WebElement fbPwd;
  
    @FindBy(xpath="//span[text()='Log in']//ancestor::div[@class='x1c436fg']")
  private WebElement fbLogIn;
    
    
    public WebElement getAccept() {
    	accept.click();
    	return accept;
    }

	public WebElement getContUs() throws InterruptedException {
		jsScrollDown(contUs);
		Sleep(2000);
		contUs.click();
		return contUs;
	}
	
	public WebElement getPrivacy() throws InterruptedException {
		Sleep(2000);
		jsScrollDown(privacy);
		return privacy;
	}
	
public WebElement getYt() throws InterruptedException {
		
		Sleep(2000);
		yt.click();
		Assert.assertEquals("https://detegohealth.com/contact/", "https://detegohealth.com/contact/");
		switchToWindow(0);
		
		return yt;
	}

public WebElement getIg() throws InterruptedException {
	Sleep(2000);	
	ig.click();
	
	//Assert.assertTrue(true, "ig clicked");
	return ig;
}

public WebElement getIgCancel() throws Exception {
	Sleep(2000);
	enter();
	Sleep(2000);
	return igCancel;
}

public WebElement getLinkedIn() throws InterruptedException, AWTException {
	linkedIn.click();
	Sleep(2000);
	esc();
	switchToWindow(0);
	return linkedIn;
}


public WebElement getGoogle() throws InterruptedException {
	google.click();
	Sleep(2000);
	switchToWindow(0);
	Sleep(2000);
	return google;
}


	public WebElement getFb() throws InterruptedException {
		fb.click();Sleep(2000);
		//switchToWindow(1);
		Assert.assertNotEquals("https://www.facebook.com/detegohealth", "https://detegohealth.com/contact/","facebook open correct");
	//quit();	
		return fb;
		
	}
	
	public WebElement getfbEmail() {
		//jsSetAttr(fbEmail, "joy@gmail.com");
		//switchToWindow(1);
   passTheValue(fbEmail, "joy@gmail.com");
		return fbEmail;
	}
	
	public WebElement getfbPwd() {

		passTheValue(fbPwd, "joy");
				return fbPwd;
			}
	
	public WebElement getfbLogIn() throws InterruptedException {

		fbLogIn.click();
		Sleep(2000);
		switchToWindow(0);
			return fbLogIn;
			}

	

	

    
	public WebElement getWin() {
		Assert.assertNotEquals("https://www.linkedin.com/company/detegohealth/", "https://detegohealth.com/contact/");
		switchToWindow(1);
		
		Assert.assertNotEquals("https://www.google.com/sorry/index?continue=https://www.google.com/search", "https://detegohealth.com/contact/");
		switchToWindow(2);
		Assert.assertNotEquals("https://www.instagram.com/detegohealth", "https://detegohealth.com/contact/");
		switchToWindow(3);
		Assert.assertNotEquals("https://www.facebook.com/detegohealth", "https://detegohealth.com/contact/");

		switchToWindow(4);
		return win;
	}
    
    
    
    
    
    
    
    
    
	

}
